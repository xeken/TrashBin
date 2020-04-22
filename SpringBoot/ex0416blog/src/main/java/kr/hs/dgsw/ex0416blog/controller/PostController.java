package kr.hs.dgsw.ex0416blog.controller;

import kr.hs.dgsw.ex0416blog.domain.Post;
import kr.hs.dgsw.ex0416blog.protocol.PostUserProtocol;
import kr.hs.dgsw.ex0416blog.protocol.ResponseFormat;
import kr.hs.dgsw.ex0416blog.protocol.ResponseType;
import kr.hs.dgsw.ex0416blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    private ResponseFormat responseFormat;

    @GetMapping("/postGet/{id}")
    public ResponseFormat postGet(@PathVariable Long id){

        responseFormat = new ResponseFormat(ResponseType.FAIL, null);

        Post post = this.postService.postGet(id);

        if(post != null)
            responseFormat = new ResponseFormat(ResponseType.POST_GET, post, post.getId());

        return responseFormat;
    }

    @GetMapping("/postGetByUser/{userId}")
    public ResponseFormat getTopPost(@PathVariable Long userId) {

        responseFormat = new ResponseFormat(ResponseType.FAIL, null);

        Post post = this.postService.getPostByUser(userId);

        if (post != null)
            responseFormat = new ResponseFormat(ResponseType.POST_GET, post, post.getId());

        return responseFormat;
    }

    @GetMapping("/postList")
    public ResponseFormat postList() {

        responseFormat = new ResponseFormat(ResponseType.FAIL, null);

        List<Post> postList = this.postService.postList();

        if (postList != null)
            responseFormat = new ResponseFormat(ResponseType.POST_LIST, postList, (long) postList.size());

        return responseFormat;
    }


    @PostMapping("/postAdd")
    public ResponseFormat postAdd(@RequestBody Post post){

        responseFormat = new ResponseFormat(ResponseType.FAIL, null);

        PostUserProtocol postUserProtocol = this.postService.postAdd(post);

        if(postUserProtocol != null)
            responseFormat = new ResponseFormat(ResponseType.POST_ADD,  post, postUserProtocol.getId());

        return responseFormat;
    }

    @PutMapping("/postUpdate/{id}")
    public ResponseFormat postUpdate(@PathVariable Long id, @RequestBody Post post){

        responseFormat = new ResponseFormat(ResponseType.FAIL, null);

        Post p = this.postService.postUpdate(id, post);

        if(p != null)
            responseFormat = new ResponseFormat(ResponseType.POST_UPDATE, p, p.getId());

        return responseFormat;
    }

    @DeleteMapping("/postDelete/{id}")
    public ResponseFormat postDelete(@PathVariable Long id){

        responseFormat = new ResponseFormat(ResponseType.FAIL, null);

        if(this.postService.postDelete(id))
            responseFormat = new ResponseFormat(ResponseType.POST_DELETE, true, id);

        return responseFormat;
    }
}
