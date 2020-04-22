package kr.hs.dgsw.ex0326.Protocol;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
public class AttachmentProtocol {

    private String storedPath;
    private String originalName;

    public AttachmentProtocol(String storedPath, String originalName){

        this.storedPath = storedPath;
        this.originalName = originalName;
    }
}
