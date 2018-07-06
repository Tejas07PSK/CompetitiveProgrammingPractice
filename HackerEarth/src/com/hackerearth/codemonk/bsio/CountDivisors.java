/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 06 Jul, 2018, 3:23 PM,
        @File-Name : CountDivisors.java

 */

package com.hackerearth.codemonk.bsio;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountDivisors
{

    public static void main(String [] args) throws Exception
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nos [] = (br.readLine()).split(" ");
        short count = 0;
        for (short i = Short.valueOf(nos[0]); i <= Short.valueOf(nos[1]); i += 1)
        {

            if ((i % Short.valueOf(nos[2])) == 0)
                count += 1;

        }
        System.out.println(count);
        br.close();

    }

}
