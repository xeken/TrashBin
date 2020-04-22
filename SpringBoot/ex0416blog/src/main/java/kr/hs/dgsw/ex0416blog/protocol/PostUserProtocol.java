package kr.hs.dgsw.ex0416blog.protocol;

import kr.hs.dgsw.ex0416blog.domain.Post;
import kr.hs.dgsw.ex0416blog.domain.User;
import lombok.Data;

@Data
public class PostUserProtocol extends Post {

    private User user;

    public PostUserProtocol(User user, Post post){

        this.user = user;
        super.setId(post.getId());
        super.setContent(post.getContent());
        super.setCreated(post.getCreated());
        super.setUpdated(post.getUpdated());
        super.setPictures(post.getPictures());
        super.setUserId(post.getUserId());
        super.setTitle(post.getTitle());
    }
}
