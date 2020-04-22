package kr.hs.dgsw.ex0326.Service;

import kr.hs.dgsw.ex0326.Domain.Comment;
import kr.hs.dgsw.ex0326.Protocol.CommentUserNameProtocol;

import java.util.List;

public interface CommentService {

    List<CommentUserNameProtocol> ListAllComments();
    CommentUserNameProtocol addComment(Comment comment);
    boolean deleteComment(Long id);
}
