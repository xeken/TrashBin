package kr.hs.dgsw.ex0326.Service;

import kr.hs.dgsw.ex0326.Domain.Comment;
import kr.hs.dgsw.ex0326.Domain.User;
import kr.hs.dgsw.ex0326.Protocol.CommentUserNameProtocol;
import kr.hs.dgsw.ex0326.Repository.CommentRepository;
import kr.hs.dgsw.ex0326.Repository.UserRepository;
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
    private UserRepository userRepository;

    @PostConstruct
    private void Init(){ //초기 데이터용

        //this.userRepository.save(new User("abc", "abc@dgsw"));  --> 위험한 방식이래
        if(this.commentRepository.count() > 0) return;
        User u = this.userRepository.save(new User("abc", "abc@dgsw"));
        this.commentRepository.save(new Comment(u.getId(), "hi there 111"));
        this.commentRepository.save(new Comment(u.getId(), "hi there 222"));
        this.commentRepository.save(new Comment(u.getId(), "hi there 333"));
    }

    @Override
    public List<CommentUserNameProtocol> ListAllComments() {

        List<Comment> commemtList = this.commentRepository.findAll();
        List<CommentUserNameProtocol> cupList = new ArrayList<>();
        /*
        코멘트 아이디, 코멘트 네임, 코멘트 내용, 날짜, 수정 날짜
        이게 여러줄
        코멘트 아이디(1,2,3(오토인크리즈)를 이름으로 바꿔야한다)
         */
        commemtList.forEach(comment -> {


//            Optional<User> found =  this.userRepository.findById(comment.getUserId());
//            String UserName = (found.isPresent()) ? found.get().getUserName() : null;
//            cupList.add(new CommentUserNameProtocol(comment, UserName));

//            if(found.isPresent())
//                UserName = found.get().getUserName();

//            CommentUserNameProtocol cup = new CommentUserNameProtocol(comment, UserName);
//            //cup = (CommentUserNameProtocol) comment; 강제 타입캐스팅 -> 상위에서 하위로 하면 절대 안된다. 그래서 우린 딥카피를 하였다. (물론 생성자로 하면 더 편하다 그래ㅑ서 그렇게 할거다)
//            cup.setUserName(UserName);
//            cup.setContent(comment.getContent());
            cupList.add(new CommentUserNameProtocol(comment, this.userRepository.findById(comment.getUserId()).map(u->u.getUserName()).orElse(null)));
        });
        return cupList;
    }

    @Override
    public CommentUserNameProtocol addComment(Comment comment) {

        return new CommentUserNameProtocol(
                this.commentRepository.save(comment),
                this.userRepository
                .findById(comment.getUserId())
                .map(u -> u.getUserName())
                .orElse(null)
        );
    }

    @Override
    public boolean deleteComment(Long id) {
        try{
            this.commentRepository.deleteById(id);
            return true;
        }catch(Exception ex){
            return false;
        }
    }
}
