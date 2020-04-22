package kr.hs.dgsw.ex0326.Controller;

import kr.hs.dgsw.ex0326.Domain.Comment;
import kr.hs.dgsw.ex0326.Protocol.CommentUserNameProtocol;
import kr.hs.dgsw.ex0326.Repository.CommentRepository;
import kr.hs.dgsw.ex0326.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;
    @Autowired
    private CommentRepository commentRepository;

    @GetMapping("/commentlist")
    public List<CommentUserNameProtocol> list() {
        return this.commentService.ListAllComments() ;
    }

    @PostMapping("/commentadd")
    public Comment addComment(@RequestBody Comment comment){
        return this.commentService.addComment(comment);
    }

    @DeleteMapping("/commentdelete/{id}")
    public boolean deleteComment(@PathVariable Long id){

        return this.commentService.deleteComment(id);
    }
}
