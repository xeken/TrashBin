package kr.hs.dgsw.hw04.Service;

import kr.hs.dgsw.hw04.Domain.Comment;
import kr.hs.dgsw.hw04.Protocol.CommentUserProtocol;

import java.util.List;

public interface CommentService {

    List<CommentUserProtocol> commentView();
    CommentUserProtocol commentWrite(Comment comment);
    Comment commentModify(Long id, Comment comment);
    boolean commentDelete(Long id);
}
