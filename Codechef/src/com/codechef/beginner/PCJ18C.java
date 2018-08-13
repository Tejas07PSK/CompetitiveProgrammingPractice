/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 13 Aug, 2018, 11:36 PM,
        @File-Name : PCJ18C.java

 */

package com.codechef.beginner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Exception;

public class PCJ18C
{

    public static void main(String args []) throws Exception
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] N_A_K = null;
        long x = 0;
        long y = 0;
        byte T = Byte.parseByte(br.readLine());
        for(byte i = 1; i <= T; i += 1)
        {

            N_A_K = (br.readLine()).split(" ");
            x = (((360 * (Short.parseShort(N_A_K[0]) - 2)) - (2 * Long.parseLong(N_A_K[1]) * Short.parseShort(N_A_K[0])))*(Short.parseShort(N_A_K[2]) - 1)) + (Long.parseLong(N_A_K[1]) * Short.parseShort(N_A_K[0]) * (Short.parseShort(N_A_K[0]) - 1));
            y = (long)(Short.parseShort(N_A_K[0]) * (Short.parseShort(N_A_K[0]) - 1));
            System.out.print(x/gcd(x, y));
            System.out.print(" ");
            System.out.println(y/gcd(x, y));

        }
        br.close();

    }

    private static long gcd(long x, long y)
    {

        return ((x % y) == 0 ? y : gcd(y, (x % y)));

    }

}
