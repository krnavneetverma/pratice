package com.stackthread.fiberlink;

import java.util.Arrays;
import java.util.Scanner;

public class RailwatTicketsRevenueManager {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String line[] = sc.nextLine().split(" ");
        //Integer nTicketWindows = Integer.parseInt(line[0]);
        Integer mTicketsSold = Integer.parseInt(line[1]);
        int count = 0;
        line = sc.nextLine().split(" ");
        sc.close();
        
        Integer windows[] = new Integer[line.length];
        for (int i = 0; i < line.length; i++) {
            windows[i] = Integer.parseInt(line[i]);
        }
        Arrays.sort(windows);
        int tktsAtCurrCounter = 0;
        int tktsAtPreCounter = 0;
        int revenue = 0;
        count = mTicketsSold;
        for (int i = windows.length-1; i >=0 ; i--) {

            tktsAtCurrCounter = windows[i]; 
            if(tktsAtCurrCounter<=count)
            {
                revenue += tktsAtCurrCounter*(tktsAtCurrCounter+1)/2;
                count -= tktsAtCurrCounter; 
            }
            else
            {
                revenue += tktsAtCurrCounter*(tktsAtCurrCounter+1)/2;
                revenue -= (tktsAtCurrCounter-count)*(tktsAtCurrCounter-count+1)/2;
                count -= tktsAtCurrCounter;
            }
            if(count<=0)
                break;
        }
        System.out.println(revenue);
    }
}