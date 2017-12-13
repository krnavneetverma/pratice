package com.stackthread.fiberlink;

import java.util.Arrays;
import java.util.Scanner;

public class RailwayTicket {

    public static void main(String[] args) {
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
        System.out.println(getMaxRevenue(windows,mTicketsSold));
    }

    private static Integer getMaxRevenue(Integer[] windows, Integer mTicketsSold) {
        Integer revenue = 0;
        int counter2 = windows.length-1;
        while (counter2>=0 && mTicketsSold!=0) {
            
            int tktAtCurrCounter =  windows[counter2];
            int tktsAtNxtWindow = 0;
            
            if(counter2==0)
            {
                tktsAtNxtWindow=0;
            }
            else
            {
                tktsAtNxtWindow=windows[counter2-1];
            }
            int counter1 = tktAtCurrCounter - tktsAtNxtWindow;
            while(counter1!=0 && mTicketsSold!=0)
            {
                revenue+=tktAtCurrCounter;
                tktAtCurrCounter-=1;
                mTicketsSold--;
                counter1--;
            }
            counter2--;
        }
        return revenue;
    }
    
}
