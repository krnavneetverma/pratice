package com.stackthread.misc;

import java.util.Scanner;

public class DiagonalDifferece {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int matrixOrder = 0;
        String line, strRow[];
        int d1Sum=0, d2Sum=0;
        
        line = in.nextLine();
        matrixOrder = Integer.parseInt(line);
        
        for (int i = 0; i < matrixOrder; i++) {
			line = in.nextLine();
			strRow = line.split(" ");
			d1Sum += Integer.parseInt(strRow[i]);
			d2Sum += Integer.parseInt(strRow[matrixOrder-i-1]);
		}
        
        System.out.println(Math.abs(d1Sum-d2Sum));
        in.close();
    }
}
