package kr.hs.dgsw.ex0416blog.service;

import kr.hs.dgsw.ex0416blog.domain.Post;
import kr.hs.dgsw.ex0416blog.protocol.PostUserProtocol;

import java.util.List;

public interface PostService {

    List<Post> postList(Long userId);
    List<Post> postList();

    PostUserProtocol postAdd(Post post);
    Post postUpdate(Long id, Post post);
    boolean postDelete(Long id);

    Post postGet(Long id);
    Post getPostByUser(Long userId);
}
