package br.com.microservicessb.MathV1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @RequestMapping (value = "/soma/{number1}/{number2}", method = RequestMethod.GET)
    public Double sum (@PathVariable ("number1") String number1, @PathVariable ("number2") String number2) throws Exception {
        if ( !isNumeric(number1) || !isNumeric (number2)){
            throw new Exception("Digite número inteiros");
        } else{
            Double soma = convertToDouble(number1) + convertToDouble(number2);
            return soma;
        }
    }

    private Double convertToDouble(String number) {
        if (number == null){
            return 0D;
        }else {
            String numb = number.replace(",",".");
            if (isNumeric(numb))
                return Double.parseDouble(numb);
        }
        return 0D;
    }

    private boolean isNumeric(String number) {
        if (number == null){
            return false;
        }else{
            String numb = number.replace(",", ".");
            return numb.matches("[-+]?[0-9]*\\.?[0-9]+");
        }
    }
}
