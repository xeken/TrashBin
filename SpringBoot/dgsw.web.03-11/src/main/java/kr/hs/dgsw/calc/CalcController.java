package kr.hs.dgsw.calc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

    @GetMapping
    public String getString(){

        return "Hello World && Hi";
    }
}
