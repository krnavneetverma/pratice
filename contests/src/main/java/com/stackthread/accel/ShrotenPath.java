//https://www.hackerrank.com/contests/accel-hack/challenges/shorten-the-path
package com.stackthread.accel;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ShrotenPath {
    
    private static final char NORTH = 'N';
    private static final char SOUTH = 'S';
    private static final char EAST = 'E';
    private static final char WEST = 'W';
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String directions = sc.nextLine();
        Map <Character,Integer> dirMap =  getDirectionMap(directions.toCharArray());
        System.out.println(getShortenPath(dirMap));
        
        sc.close();
    }

    private static String getShortenPath(Map<Character, Integer> dirMap) {
        StringBuilder sb = new StringBuilder();
        int up = dirMap.get(NORTH);
        int forward = dirMap.get(EAST);
        char []ns = new char[Math.abs(up)];
        char []es = new char[Math.abs(forward)];
        if(forward>0)
        {
            Arrays.fill(es, EAST);
            sb.append(es);
        }
        if(up>0)
        {
            Arrays.fill(ns, NORTH);
            sb.append(ns);
        }
        if(up<0)
        {
            Arrays.fill(ns, SOUTH);
            sb.append(ns);
        }
        if(forward<0)
        {
            Arrays.fill(es, WEST);
            sb.append(es);
        }
        
        
        return sb.toString();
    }

    private static Map<Character, Integer> getDirectionMap(char[] chDir) {
        Map <Character,Integer> dirMap = new LinkedHashMap<>();
        int chDirLen = chDir.length;
        int tmp = 0;
        char dir = NORTH;
        dirMap.put(NORTH, 0);
        dirMap.put(SOUTH, 0);
        dirMap.put(EAST, 0);
        dirMap.put(WEST, 0);
        for (int i = 0; i < chDirLen; i++) {
            switch(chDir[i])
            {
            case NORTH:
                tmp = dirMap.get(NORTH)+1;
                dir = NORTH;
                break;
            case SOUTH:
                tmp = dirMap.get(NORTH)-1;
                dir = NORTH;
                break;
            case EAST:
                tmp = dirMap.get(EAST)+1;
                dir = EAST;
                break;
            case WEST:
                tmp = dirMap.get(EAST)-1;
                dir = EAST;
                break;
            }
            dirMap.put(dir, tmp);
        }
        return dirMap;
    }
}
