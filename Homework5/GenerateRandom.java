package Homework5;

import java.util.Random;

public class GenerateRandom {

    public String generateRandomString(){
        String string = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        StringBuffer str =new StringBuffer();
        for(int i=0;i<8;i++){
            int number = random.nextInt(52);
            str.append(string.charAt(number));
        }
        return str.toString();
    }

    public String generateRandomNumber() {
        Random random = new Random();
        StringBuilder number = new StringBuilder(String.valueOf(random.nextDouble(0, 10)));
        number.delete(6, number.length() - 1);
        return String.valueOf(number);
    }


}
