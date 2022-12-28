package Validate;

public class Validate {
    public static String validateString(String value){
        if (value == null || value.isBlank() || value.isEmpty()){ throw new RuntimeException("Заполните карточку товара полностью");}
        return value;
    }
    public static Boolean validateBoolean (Boolean value){return value != null && value;}

    public static Integer validateInteger (Integer value){
        if (value == null || value <= 0) throw new RuntimeException("Заполните карточку товара полностью");
        return value;
    }
}