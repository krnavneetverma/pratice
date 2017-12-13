package com.stackthread.healthifyMe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChanduAndXor {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String lineStrArr[] = br.readLine().split(" ");
        
        final int rows = Integer.parseInt(lineStrArr[0]);
        final int columns = Integer.parseInt(lineStrArr[1]);
        
        int rowSumArr[] = new int[rows];
        int colSumArr[] = new int[columns];
        
        String matrix[][] = new String[rows][columns]; 
        for (int i = 0; i < rows; i++) {
            matrix[i] = br.readLine().split(" ");
        }
        int rowSum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                rowSum += Integer.parseInt(matrix[i][j]);
                colSumArr[j] += Integer.parseInt(matrix[i][j]);
            }
            rowSumArr[i]=rowSum;
            rowSum = 0;
        }

        System.out.println(findMaxXorPairValue(rowSumArr,colSumArr));
        
    }

    private static int findMaxXorPairValue(int[] rowSumArr, int[] colSumArr) {
        int max = Integer.MIN_VALUE, xor = 0 ;
        for (int i = 0; i < rowSumArr.length; i++) {
            for (int j = 0; j < colSumArr.length; j++) {
                xor = rowSumArr[i]^colSumArr[j];
                if(xor>max)
                    max=xor;
            }
        }
        return max;
    }

}
