package kr.hs.dgsw.ex0416blog.service;

import kr.hs.dgsw.ex0416blog.domain.Post;
import kr.hs.dgsw.ex0416blog.domain.User;
import kr.hs.dgsw.ex0416blog.protocol.PostUserProtocol;
import kr.hs.dgsw.ex0416blog.repository.PostRepository;
import kr.hs.dgsw.ex0416blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PostRepository postRepository;

    @PostConstruct
    public void init(){

        User user = this.userRepository.save(new User("postTest","sad","postTest","postTest","1234"));
        this.postRepository.save(new Post(user.getId(), "테스트1번", "풍부하게 가는 방지하는 발휘하기 곳으로 그들에게 굳세게 뜨고, 보라. 무엇이 목숨을 같이, 뿐이다. 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈 줄바꿈"));
        this.postRepository.save(new Post(user.getId(), "테스트2번", "모래뿐일 뜨거운지라, 것은 천자만홍이 뭇 뛰노는 봄바람을 너의 피다. 생명을 무엇을 봄바람을 만물은 아니더면, 작고 고행을 이것이다."));
    }

    @Override
    public List<Post> postList(Long userId) {

        return this.postRepository.findAllByUserId(userId);
    }

    @Override
    public List<Post> postList() {

        return this.postRepository.findAll();
    }

    @Override
    public PostUserProtocol postAdd(Post post) {

        Post p = this.postRepository.save(post);

        return this.userRepository.findById(post.getUserId())
                .map(user -> new PostUserProtocol(user, p))
                .orElse(null);
    }

    @Override
    public Post postUpdate(Long id, Post post) {

        return this.postRepository.findById(id)
                .map(p -> {
                    p.setContent(post.getContent() != null ? post.getContent() : p.getContent());
                    return this.postRepository.save(p);
                })
                .orElse(null);
    }

    @Override
    public boolean postDelete(Long id) {

        try {
            this.postRepository.deleteById(id);
            return true;
        }
        catch (Exception e){ return false; }
    }


    @Override
    public Post postGet(Long id) {

        return this.postRepository.findById(id)
                .orElse(null);
    }

    @Override
    public Post getPostByUser(Long userId) {

        return this.postRepository.findTopByUserIdOrderByIdDesc(userId)
                .orElse(null);
    }
}
