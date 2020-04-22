package kr.hs.dgsw.ex0416blog.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;

@Entity @Data @NoArgsConstructor
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // NULL 허용X, 유니크-> 유일 값, 최대길이 20
    @Column(nullable = false, unique = true, length = 20)
    private String account;

    //이 설정을 해주면 날아가는 패킷을 캡처해도 안보인다. 즉, 응답값이 포함X
    @Column(nullable = false) @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    public void setPassword(String password) {

        try {

            MessageDigest md = MessageDigest.getInstance("SHA-512");
            //SHA는 단방향 암호화라서 복호화를 못시킴
            md.update(password.getBytes(), 0, password.getBytes().length);
            this.password = new BigInteger(1 ,md.digest()).toString(16);
            //범위에 제한이 없는 숫자 자료형
        }
        catch (NoSuchAlgorithmException e) {

            Logger logger = LoggerFactory.getLogger(User.class);
            logger.warn(e.getMessage());
            this.password = null;
        }
    }

    @Column(nullable = false)
    private String name;

    @Column(unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String phone;

    //서버에서 사용할 수는 있는데 네트워크로 전송은 안된다?
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String profilePath;

    @CreationTimestamp @Column(updatable = false, nullable = false) //값을 못 바꿈
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime created;

    @UpdateTimestamp @Column(nullable = false) @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updated;


    public User(String account, String password, String name, String email, String phone) {

        this.account = account;
        this.password = password;
        setPassword(password);
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
}
