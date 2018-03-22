package Roman.Roman;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IntSummaryStatistics;

public class RomanNumerics {

    public static String[] strArray = null;
    private static final HashMap<String, String> myMap;
    static
    {
        myMap = new HashMap<String, String>();
        myMap.put("I", "1");
        myMap.put("V", "5");
        myMap.put("X", "10");
        myMap.put("L", "50");
        myMap.put("C", "100");
        myMap.put("D", "500");
        myMap.put("M", "1000");
    }

	public static int convert(String inputRomanNo){
        System.out.println("input "+inputRomanNo);
        strArray = inputRomanNo.split("");
        int sum = 0;
        int currentNO=0;
        for(int i = strArray.length-1; i >=0 ;i--){

                if(CheckIfMinusIsRequired(i)){
                    currentNO = Integer.parseInt(myMap.get(strArray[i])) - Integer.parseInt(myMap.get(strArray[i - 1]));
                    i--;
                }
                else{
                    currentNO = Integer.parseInt(myMap.get(strArray[i]));
                }

                sum = sum + currentNO;
        }
        System.out.println("Sum "+sum);
        return sum;
	}

	public static  boolean CheckIfMinusIsRequired(int i){
        if(i == 0){
            return false;
        }
        if(Integer.parseInt(myMap.get(strArray[i])) > Integer.parseInt(myMap.get(strArray[i-1]))){
            return true;
        }
        else {
            return false;
        }
    }
}
