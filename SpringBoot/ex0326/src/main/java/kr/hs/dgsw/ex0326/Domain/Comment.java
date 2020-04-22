package kr.hs.dgsw.ex0326.Domain;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;


@Entity @Data @NoArgsConstructor
public class Comment {

    @Id @GeneratedValue
    private Long Id;
    private Long UserId;
    private String Content;

    @CreationTimestamp
    private LocalDateTime Created;
    @UpdateTimestamp
    private LocalDateTime Updated;

    //public Comment(){} 롬복이 만들어 줄거라규><

    public Comment(Long UserId, String Content){

        this.UserId = UserId;
        this.Content = Content;
    }

    public Comment(Comment C){
        //this = C; 절대 에러, this가 가르키는 객체 주소가 버려진다. 즉 this는 값을 바꿀 수 없게 만들어졌다.
        this.Id = C.getId(); //이런식으로 딥카피를 해줘야 한다.
        this.UserId = C.getUserId();
        this.Content = C.getContent();
        this.Created = C.getCreated();
        this.Updated = C.getUpdated();
    }
}
