/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 05 Jul, 2018, 6:50 PM,
        @File-Name : PrimeNo.java

 */

package com.hackerearth.codemonk.bsio;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

public class PrimeNo
{

    public synchronized static void main(String args[]) throws Exception
    {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.valueOf(br.readLine());
            for (int i = 2; i <= N; i = i + 1)
            {

                int count = 2;
                boolean flag = true;
                while (count <= Math.sqrt(i))
                {

                    if ((i % count) == 0)
                    {

                        flag = false;
                        break;

                    }
                    count += 1;

                }
                if (flag)
                {

                    System.out.print(i);
                    if (i != N)
                        System.out.print(" ");

                }

            }
            br.close();

    }

}
