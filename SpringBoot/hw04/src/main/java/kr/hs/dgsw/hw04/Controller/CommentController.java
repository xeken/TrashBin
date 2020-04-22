package kr.hs.dgsw.hw04.Controller;

import kr.hs.dgsw.hw04.Domain.Comment;
import kr.hs.dgsw.hw04.Protocol.CommentUserProtocol;
import kr.hs.dgsw.hw04.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/commentView")
    public List<CommentUserProtocol> commentView(){

        return this.commentService.commentView();
    }

    @PostMapping("/commentWrite")
    public Comment commentWrite(@RequestBody Comment comment){

        return this.commentService.commentWrite(comment);
    }

    @PutMapping("/commentModify/{id}")
    public Comment commentModify(@PathVariable Long id, @RequestBody Comment comment){

        return this.commentService.commentModify(id, comment);
    }

    @DeleteMapping("/commentDelete/{id}")
    public boolean commentDelete(@PathVariable Long id){

        return this.commentService.commentDelete(id);
    }
}
