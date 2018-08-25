/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 25 Aug, 2018, 9:07 PM,
        @File-Name : String.java

 */

package com.hackerearth.circuits.august18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Exception;
import java.lang.String;

public class Str
{

    public static void main(String [] args)
    {

        try
        {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            String inp_str = ((br.readLine()).trim()).toLowerCase();
            int ch [] = new int[26];
            for(int i = 0; i < N; i += 1)
            {

                ch[(int)inp_str.charAt(i) - 97] += 1;

            }
            int max_freq = ch[0];
            for(int i = 1; i < 26; i += 1)
            {

                if (ch[i] >= max_freq)
                {

                    max_freq = ch[i];

                }

            }
            System.out.println(N - max_freq);

        }
        catch (Exception e)
        {

            ;

        }

    }

}
