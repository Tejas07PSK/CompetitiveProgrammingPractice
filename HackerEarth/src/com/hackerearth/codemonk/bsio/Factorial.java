/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 06 Jul, 2018, 5:42 PM,
        @File-Name : Factorial.java

 */

package com.hackerearth.codemonk.bsio;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Factorial
{

    public static void main(String args []) throws Exception
    {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            byte N = Byte.valueOf(br.readLine());
            int fact = 1;
            for (byte i = 0; i <= N; i += 1)
            {

                if (i == 0)
                    fact *= 1;
                else
                    fact *= i;

            }
            System.out.println(fact);
            br.close();

    }

}
