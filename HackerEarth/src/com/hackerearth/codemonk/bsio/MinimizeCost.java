/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 10 Jul, 2018, 12:58 AM,
        @File-Name : MinimizeCost.java

 */

package com.hackerearth.codemonk.bsio;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MinimizeCost
{

        public static void main(String args []) throws Exception
        {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String arr1 [] = (br.readLine()).split(" ");
            int N = Integer.parseInt(arr1[0]);
            int K = Integer.parseInt(arr1[1]);
            long vals [] = new long[N];
            long sum = 0;
            int j = 0;
            long min = 0;
            String arr2 [] = (br.readLine()).split(" ");
            for(int i = 0; i < arr2.length; i += 1)
                vals[i] = Long.parseLong(arr2[i]);
            for (int i = 0; i < N; i += 1)
            {

                if (vals[i] <= 0)
                    continue;
                else
                {

                    while ((i - j) > K)
                        j += 1;
                    while ((vals[i] != 0) && (j <= (i + K)))
                    {

                        if (vals[j] > 0)
                            j += 1;
                        else
                        {

                            min = ((vals[i] >= Math.abs(vals[j])) ? Math.abs(vals[j]) : vals[i]);
                            vals[i] -= min;
                            vals[j] += min;
                            j += (vals[j] >= 0) ? 1 : 0;

                        }

                    }

                }

            }
            for (long val : vals)
                sum = sum + Math.abs(val);
            System.out.println(sum);
            br.close();

        }

}
