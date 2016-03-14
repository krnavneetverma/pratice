package com.hackerRank.domain.algo.bitManipulation;

import java.util.Scanner;

public class LonelyInteger {
   static int lonelyinteger(int[] a) {
      Integer xor = null;
       Integer num = null;
		for (int i = 0; i < a.length; i++) {
			num = a[i];
			if(xor==null)
			{
				xor = num;
				continue;
			}
			xor ^= num;
		}
       return xor;
    }
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        
        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
        in.close();
        
        res = lonelyinteger(_a);
        System.out.println(res);
        
    }
}
