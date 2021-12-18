package br.com.microservicessb.MathV1.service;

import org.springframework.stereotype.Service;

@Service
public class OperationService {

    public Double soma (String number1, String number2){
        if ( !UtilsStringNumber.isNumeric(number1) || !UtilsStringNumber.isNumeric (number2)){
            throw new UnsupportedOperationException("Digite números inteiros");
        } else{
            Double soma = UtilsStringNumber.convertToDouble(number1) + UtilsStringNumber.convertToDouble(number2);
            return soma;
        }
    }
    public Double sub (String number1, String number2){
        if ( !UtilsStringNumber.isNumeric(number1) || !UtilsStringNumber.isNumeric (number2)){
            throw new UnsupportedOperationException("Digite números inteiros");
        } else{
            Double sub = UtilsStringNumber.convertToDouble(number1) - UtilsStringNumber.convertToDouble(number2);
            return sub;
        }
    }
    public Double mult (String numero1, String numero2){
        if ( !UtilsStringNumber.isNumeric(numero1) || !UtilsStringNumber.isNumeric (numero2)){
            throw new UnsupportedOperationException("Digite números inteiros");
        }else {
            Double multiplicacao = UtilsStringNumber.convertToDouble(numero1) * UtilsStringNumber.convertToDouble(numero2);
            return multiplicacao;
        }
    }
    public Double div (String dividendo, String divisor){
        if ( !UtilsStringNumber.isNumeric(divisor) || !UtilsStringNumber.isNumeric (dividendo)){
            throw new UnsupportedOperationException("Digite números inteiros");
        }else {
            Double resultado = UtilsStringNumber.convertToDouble(dividendo) / UtilsStringNumber.convertToDouble(divisor);
            return resultado;
        }
    }
    public Double media (String n1, String n2, String n3){
        if ( !UtilsStringNumber.isNumeric(n1) || !UtilsStringNumber.isNumeric (n2)|| !UtilsStringNumber.isNumeric (n3)){
            throw new UnsupportedOperationException("Digite números inteiros");
        }else {
            Double media = (UtilsStringNumber.convertToDouble(n1) + UtilsStringNumber.convertToDouble(n2) + UtilsStringNumber.convertToDouble(n3))/3;
            return media;
        }
    }
    public Double raiz (String number1){
        if ( !UtilsStringNumber.isNumeric(number1)){
            throw new UnsupportedOperationException("Digite números inteiros");
        } else{
            Double raiz = Math.sqrt(UtilsStringNumber.convertToDouble(number1));
            return raiz;
        }
    }
}
