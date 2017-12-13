package com.stackthread.capillary;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class LuckyStringRK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nCases = sc.nextInt();
        List<String> strList = new ArrayList<String>();
        String str;
        for (int i = 0; i < nCases; i++) {
            strList.add(sc.next());
        }

        for (Iterator<String> itStr = strList.iterator(); itStr.hasNext();) {
            str = itStr.next();
            System.out.println(getMaxLuckyStringLength(str));
        }
        sc.close();
    }

    private static int getMaxLuckyStringLength(String str) {
        int nR = 0, nK = 0, strLen;
        int tmpMax = 0, tmp = 0;
        strLen = str.length();
        char chStr[] = str.toCharArray();

        for (int i = 0; i < strLen; i++) {

            // reset values
            tmp = 0;
            nR = 0;
            nK = 0;

            while (i < strLen && chStr[i] == 'R') {
                nR++;
                i++;
            }
            while (i < strLen && chStr[i] == 'K') {
                nK++;
                i++;
            }
            i--;

            // further steps not needed..iterate again..
            if (nR == 0 || nK == 0) {
                continue;
            }

            if (nK <= nR) {
                tmp = 2 * nR;
            } else if (nR < nK) {
                tmp = 2 * nR;
            } else {
                tmp = 2 * nK;
            }
            tmpMax += tmp;
        }
        return tmpMax;
    }
}
