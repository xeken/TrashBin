package kr.hs.dgsw.ex0326.Controller;

import kr.hs.dgsw.ex0326.Protocol.AttachmentProtocol;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

@RestController
public class AttachmentController {

    @PostMapping("/attachment")
    public AttachmentProtocol upload(@RequestPart MultipartFile ralara){ //파일 읽어오는 리퀘스트 파트

        String destFileName = "E:/DEV/프로젝트/전공/ew0326/upload/" + UUID.randomUUID().toString() + "_" +ralara.getOriginalFilename();

        try {

            File destFile = new File(destFilename);
            destFile.getParentFile().mkdirs();
            ralara.transferTo(destFile);
            return new AttachmentProtocol(destFilename, ralara.getOriginalFilename());
        } catch(Exception ex) {
            return null;
        }
    }
}