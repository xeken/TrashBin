package kr.hs.dgsw.hw01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {

    @GetMapping("Culc/{left},{op},{right}")
    public double ret(@PathVariable double left, @PathVariable String op, @PathVariable double right){

        CulcServiceImple culc = new CulcServiceImple();

        double result = culc.Culc(left, op, right);
        //double result = CulcServiceImple.Culc(left, op, right);

        return result;
    }
}
