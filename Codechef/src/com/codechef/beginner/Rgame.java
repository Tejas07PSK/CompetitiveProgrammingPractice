/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 12 Aug, 2018, 7:48 PM,
        @File-Name : Rgame.java

 */

package com.codechef.beginner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Exception;

public class Rgame
{

    public static void main(String args[]) throws Exception
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long  factor = 1000000007;
        byte T = Byte.parseByte(br.readLine());
        for (byte i = 1; i <= T; i += 1)
        {

            int N = Integer.parseInt(br.readLine());
            long sum = 0;
            String snos [] = (br.readLine()).split(" ");
            long combo =  Long.parseLong(snos[0]) * 2;
            long pow = 2 % factor;
            for (int j = 1; j <= N; j += 1)
            {

                sum = (sum * 2 + Long.parseLong(snos[j]) * combo) % factor;
                combo = (combo + pow * Long.parseLong(snos[j])) % factor;
                pow = (pow << 1) % factor;

            }
            System.out.println(sum);

        }
        br.close();

    }

}
