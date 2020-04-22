package kr.hs.dgsw.hw04.Domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data @NoArgsConstructor @Entity
public class Comment {

    @Id @GeneratedValue
    private Long id;
    private String userName;
    private String content;

    @CreationTimestamp
    private LocalDateTime created;
    @UpdateTimestamp
    private LocalDateTime modified;

    public Comment(String userName, String content){

        this.userName = userName;
        this.content = content;
    }

    public Comment(Comment comment) {

        this.id = comment.getId();
        this.userName = comment.getUserName();
        this.content = comment.getContent();
        this.created = comment.getCreated();
        this.modified = comment.getModified();
    }
}
