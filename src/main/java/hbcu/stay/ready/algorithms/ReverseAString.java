package hbcu.stay.ready.algorithms;

import java.util.Locale;

public class ReverseAString {

    public String reverseAString(String input){
        input = input.toLowerCase();
        //System.out.println(input.);

        for(int i=0;i<input.length();i++){
            input= input.substring(0,input.length()-i)+input.substring(0,1)+input.substring(input.length()-i);
            input = input.substring(1);
        }


       for (int j=0;j<input.length();j++){
           input = input.substring(0,1).toUpperCase()+input.substring(1);
            if (input.substring(j,j+1).contains(" ")){
                //System.out.println("yes");
                //System.out.println(input.substring(j+1,j+2).toUpperCase());
                input = input.substring(0,j+1)+input.substring(j+1,j+2).toUpperCase()+input.substring(j+2);
            }
        }



        return input;
    }


}
