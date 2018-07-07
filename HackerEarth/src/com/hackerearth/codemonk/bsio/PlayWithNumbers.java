/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 07 Jul, 2018, 6:21 PM,
        @File-Name : PlayWithNumbers.java

 */

package com.hackerearth.codemonk.bsio;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PlayWithNumbers
{

    public static void main(String [] args) throws Exception
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N_Q [] = (br.readLine()).split(" ");
        long sum_arr_eles [] = new long[Integer.parseInt(N_Q[0]) + 1];
        long mean = 0;
        int c = 1;
        for (String str : (br.readLine()).split(" "))
        {

            sum_arr_eles[c] = sum_arr_eles[c - 1] + Long.parseLong(str);
            c += 1;

        }
        for (int i = 0; i < Integer.parseInt(N_Q[1]); i += 1)
        {

            String L_R [] = (br.readLine()).split(" ");
            mean = (sum_arr_eles[Integer.valueOf(L_R[1])] - sum_arr_eles[Integer.valueOf(L_R[0]) - 1]) / ((Integer.valueOf(L_R[1]) - Integer.valueOf(L_R[0])) + 1);
            System.out.println(mean);

        }
        br.close();

    }

}
