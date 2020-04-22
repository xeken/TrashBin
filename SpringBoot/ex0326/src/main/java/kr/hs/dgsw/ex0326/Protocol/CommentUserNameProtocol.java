package kr.hs.dgsw.ex0326.Protocol;

import kr.hs.dgsw.ex0326.Domain.Comment;
import lombok.Data;

@Data
public class CommentUserNameProtocol extends Comment {

    private String UserName;

    public CommentUserNameProtocol(Comment C, String UserName){

        super(C);
        this.UserName = UserName;

    }
}
