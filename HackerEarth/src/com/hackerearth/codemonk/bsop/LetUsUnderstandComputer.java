/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 13 Jul, 2018, 3:42 PM,
        @File-Name : LetUsUnderstandComputer.java

 */

package com.hackerearth.codemonk.bsop;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LetUsUnderstandComputer
{

    public static void main(String [] args) throws Exception
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        long L = 0;
        long R = 0;
        long M = 0;
        long num = 0;
        for (int i = 0; i < T; i += 1)
        {

            num = Long.parseLong(br.readLine());
            L = 1;
            R = (long)Math.sqrt(num);
            while (L < R)
            {

                M = (L + R) / 2;
                if (getBits(num / M) <= getBits(M))
                    R = M;
                else
                    L = M + 1;

            }
            if (!(getBits(num / L) <= getBits(L)))
                L = L + 1;
            System.out.println(num - L + 1);

        }

    }

    private static long getBits(long num)
    {

        long count = 0;
        while (num != 0)
        {

            num /= 2;
            count += 1;

        }
        return (count);

    }

}
