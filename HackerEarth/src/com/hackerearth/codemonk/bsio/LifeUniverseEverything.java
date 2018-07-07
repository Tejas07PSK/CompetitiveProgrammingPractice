/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 07 Jul, 2018, 1:52 AM,
        @File-Name : LifeUniverseEverything.java

 */

package com.hackerearth.codemonk.bsio;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LifeUniverseEverything
{

    public static void main(String [] args) throws Exception
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        short N = 0;
        while (true)
        {

            N = Short.valueOf(br.readLine());
            if (N != 42)
                System.out.println(N);
            else
                break;

        }
        br.close();

    }

}
