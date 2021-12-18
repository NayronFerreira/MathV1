package br.com.microservicessb.MathV1.service;

public class UtilsStringNumber {

    public static Double convertToDouble(String number) {
        if (number == null){
            return 0D;
        }else {
            String numb = number.replace(",",".");
            if (isNumeric(numb))
                return Double.parseDouble(numb);
        }
        return 0D;
    }

    public static boolean isNumeric(String number) {
        if (number == null){
            return false;
        }else{
            String numb = number.replace(",", ".");
            return numb.matches("[-+]?[0-9]*\\.?[0-9]+");
        }
    }
}
