/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 14 Aug, 2018, 2:45 AM,
        @File-Name : PCJ188.java

 */

package com.codechef.beginner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Exception;

public class PCJ188
{

    public static void main(String args []) throws Exception
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        short N = 0;
        long ans = 0;
        byte T = Byte.parseByte(br.readLine());
        for(byte i = 1; i <= T; i += 1)
        {

            N = Short.parseShort(br.readLine());
            for (short j = 2; j <= N; j += 2)
            {

                ans += ((N - j) == 0) ? (N * N) : (((N - j) == 1) ? ((N * N) + 1) : ((N - j) * (N - j)));

            }
            if (N == 1)
            {

                System.out.println(1);

            }
            else
            {

                System.out.println(ans);
                ans = 0;

            }

        }
        br.close();

    }

}
