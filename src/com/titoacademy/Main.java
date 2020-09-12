package com.titoacademy;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String myString = "SILLYSPIDERS";
        char [] myChar = myString.toCharArray();
        Map<Character,Integer> myMap = new LinkedHashMap<>();

        for(int i = 0; i < myChar.length;i++){
            if (!myMap.containsKey(myChar[i])){
                myMap.put(myChar[i], 1);
            } else{
                myMap.put(myChar[i],myMap.get(myChar[i]) + 1);
            }
        }

        String mySecondString = " ";


        Set<Map.Entry<Character,Integer>> myEntireEntrySets = myMap.entrySet();
        for (Map.Entry<Character,Integer> mySingleEntry : myEntireEntrySets){
            mySecondString = mySecondString + mySingleEntry.getKey();

        }

        System.out.println(mySecondString);
    }
}
