package kr.hs.dgsw.hw01;

import org.springframework.stereotype.Service;

@Service
public class CulcServiceImple implements CulcService{



    @Override
    public double Culc(double left, String op, double right) {

        double result = 0;

        if(op.equals("plus"))
            result = left + right;
        else if(op.equals("minus"))
            result = left - right;
        else if(op.equals("multi"))
            result = left * right;
        else if(op.equals("div"))
            result = left / right;

        return result;
    }
}
