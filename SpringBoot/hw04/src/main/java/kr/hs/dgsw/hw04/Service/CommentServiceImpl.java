package kr.hs.dgsw.hw04.Service;

import kr.hs.dgsw.hw04.Domain.Comment;
import kr.hs.dgsw.hw04.Domain.User;
import kr.hs.dgsw.hw04.Protocol.CommentUserProtocol;
import kr.hs.dgsw.hw04.Repository.CommentRepository;
import kr.hs.dgsw.hw04.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private  UserRepository userRepository;


    @PostConstruct
    public void Init(){

        if(this.commentRepository.count() > 0) return;
        User u = this.userRepository.save(new User("tid2","test2","password", "test2@test.test"));
        this.commentRepository.save(new Comment(u.getId(), "Test1"));
        this.commentRepository.save(new Comment(u.getId(), "Test2"));
        this.commentRepository.save(new Comment(u.getId(), "Test3"));
    }

    @Override
    public List<CommentUserProtocol> commentView() {

        List<Comment> commentList = this.commentRepository.findAll();
        List<CommentUserProtocol> cupList = new ArrayList<>();

        commentList.forEach(comment ->
                cupList.add(new CommentUserProtocol(comment, comment.getUserName()))
            );
        return cupList;
    }

    @Override
    public CommentUserProtocol commentWrite(Comment comment) {

        return new CommentUserProtocol(
                this.commentRepository.save(comment),
                comment.getUserName()
        );
    }

    @Override
    public Comment commentModify(Long id, Comment comment) {

        return this.commentRepository.findById(id)
                .map(c -> {
                    c.setContent(Optional.ofNullable(comment.getContent()).orElse(c.getContent()));
                    return c;
                })
                .orElse(null);
    }

    @Override
    public boolean commentDelete(Long id) {

        try{
            this.commentRepository.deleteById(id);
            return true;
        }catch(Exception ex){
            return false;
        }
    }
}
