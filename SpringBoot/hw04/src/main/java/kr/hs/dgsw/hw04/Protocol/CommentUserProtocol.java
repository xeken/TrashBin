package kr.hs.dgsw.hw04.Protocol;

import kr.hs.dgsw.hw04.Domain.Comment;
import lombok.Data;

@Data
public class CommentUserProtocol extends Comment {

    private String userName;

    public CommentUserProtocol(Comment comment, String userName){

        super(comment);
        this.userName = userName;
    }
}
