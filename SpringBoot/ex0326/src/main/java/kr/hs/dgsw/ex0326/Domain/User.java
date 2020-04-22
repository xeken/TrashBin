package kr.hs.dgsw.ex0326.Domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity  //데이터베이스에 이거랑 똑같이 생긴 테이블이 생긴다.
@Data @NoArgsConstructor
public class User {

    @Id @GeneratedValue
    private Long Id;

    private String UserName;
    private String eMail;

    @CreationTimestamp
    private LocalDateTime Joined;
    @UpdateTimestamp
    private LocalDateTime Modified;

    public User(String UserName, String eMail){

        this.UserName = UserName;
        this.eMail = eMail;
    }

}
