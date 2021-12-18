package br.com.microservicessb.MathV1.controller;

import br.com.microservicessb.MathV1.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @Autowired
    private OperationService operationService;

    @RequestMapping (value = "/soma/{number1}/{number2}", method = RequestMethod.GET)
    public Double sum (@PathVariable ("number1") String number1, @PathVariable ("number2") String number2)  {
       return operationService.soma(number1, number2);
    }
    @RequestMapping (value = "/mult/{numero1}/{numero2}",method = RequestMethod.GET)
    public Double mult (@PathVariable ("numero1") String numero1, @PathVariable ("numero2") String numero2){
        return operationService.mult(numero1,numero2);
    }
    @RequestMapping (value = "/div/{dividendo}/{divisor}", method = RequestMethod.GET)
    public Double div (@PathVariable ("divisor") String divisor, @PathVariable ("dividendo") String dividendo){
        return operationService.div(dividendo, divisor);
    }
    @RequestMapping (value = "/med/{n1}/{n2}/{n3}", method = RequestMethod.GET)
    public Double div (@PathVariable ("n1") String n1, @PathVariable ("n2") String n2, @PathVariable ("n3") String n3){
        return operationService.media(n1,n2,n3);
    }
    @RequestMapping (value = "/sub/{number1}/{number2}", method = RequestMethod.GET)
    public Double sub (@PathVariable ("number1") String number1, @PathVariable ("number2") String number2){
        return operationService.sub(number1,number2);
    }
    @RequestMapping (value = "/raiz/{number1}", method = RequestMethod.GET)
    public Double raiz (@PathVariable ("number1") String number1){
        return operationService.raiz(number1);
    }
}
