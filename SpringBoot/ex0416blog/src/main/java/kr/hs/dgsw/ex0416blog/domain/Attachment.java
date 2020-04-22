package kr.hs.dgsw.ex0416blog.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity @Data
public class Attachment {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long postId;
    private String storedPath; //내 파일 시스템 경로를 읽어서 네트워크로 뿌리기 위함

}
