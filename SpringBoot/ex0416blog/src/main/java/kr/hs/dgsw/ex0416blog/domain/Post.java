package kr.hs.dgsw.ex0416blog.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data @Entity @NoArgsConstructor
public class Post {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId; //외래키
    // select 1 * from post where userid = my_id order by id desc

    private String title;
    @Column(columnDefinition = "TEXT") // lob 그냥 큰 자료형?; blob 바이너리 자료형(파일서버를 안쓰고 디비에 때릴때, 그래서 잘 안씀) ; clob 캐릭터 자료형;
    private String content; //스트링은 255바이트까지 지원되기때문에 컬럼디피니션에서 mysql text로 설정해줌

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true) //여기 id랑 포스트의 postId(외래키)가 같으면 다 들고옮, 포스트 삭제시 얘네들도 지움
    private List<Attachment> pictures;

    @CreationTimestamp @Column(updatable = false, nullable = false) @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime created;

    @UpdateTimestamp @Column(nullable = false) @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updated;

    public Post(Long userId, String title, String content){

        this.userId = userId;
        this.title = title;
        this.content = content;
    }
}
