package kr.hs.dgsw.hw04.Domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity  //데이터베이스에 이거랑 똑같이 생긴 테이블이 생긴다.
@Data @NoArgsConstructor
public class User {

    @Id
    private String id;
    private String userName;
    private String password;
    private String email;
    private String imgSrc;
    private String imgName;

    @CreationTimestamp
    private LocalDateTime Joined;

    public User(String id , String userName, String password, String email){

        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

//    public String joinedPeriod(){
//
//        LocalDate joined = this.Joined.toLocalDate();
//        LocalDate now = LocalDate.now();
//        Period period = Period.between(joined, now);
//
//        return "가입 후" +period.getYears() +"년" +period.getMonths() +"월" +period.getDays() +"일";
//    }

}
