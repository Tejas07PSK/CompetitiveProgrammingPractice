/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 20 Jul, 2018, 9:50 PM,
        @File-Name : SpecialShop.java

 */

package com.hackerearth.circuits.july18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

public class SpecialShop
{

    public static void main(String args [])
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try
        {

            int T = Integer.parseInt(br.readLine());
            double N = 0.0, A = 0.0, B = 0.0;
            long min = 0, X = 0, Y = 0;
            String [] temp = null;
            for (long i = 0; i < T; i += 1)
            {

                temp = (br.readLine()).split(" ");
                N = Double.parseDouble(temp[0]);
                A = Double.parseDouble(temp[1]);
                B = Double.parseDouble(temp[2]);
                X = Math.round((N/(A + B)) * B);
                Y = (long)N - X;
                min = ((long)A * X * X) + ((long)B * Y * Y);
                System.out.println(min);

            }
            br.close();

        }catch(Exception e)
        {

            ;

        }

    }

}