package com.stackthread.healthifyMe;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AConversion {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nbrOfTestCases = Integer.parseInt(br.readLine());
        String str1, str2;
        List<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < nbrOfTestCases; i++) {
            str1 = br.readLine();
            str2 = br.readLine();

            list.add(getMinConversionRate(str1, str2));
        }

        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }
    }

    
    
    private static Integer getMinConversionRate(String str1, String str2) {
        Integer minConRate = 0;
        char chStr1[],chStr2[];
        chStr1 = str1.toCharArray();
        chStr2 = str2.toCharArray();
        
        
        return minConRate;
    }

}
