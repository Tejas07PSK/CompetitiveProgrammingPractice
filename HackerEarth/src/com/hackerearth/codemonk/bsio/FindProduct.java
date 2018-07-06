/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 06 Jul, 2018, 11:46 AM,
        @File-Name : FindProduct.java

 */

package com.hackerearth.codemonk.bsio;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

public class FindProduct
{

    public static void main(String [] args) throws Exception
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int factor = (int)(Math.pow(10, 9) + 7);
        int product = 1;
        br.readLine();
        String num_arr [] = (br.readLine()).split(" ");
        for (short i = 0; i < num_arr.length; i += 1)
            product *= Short.valueOf(num_arr[i]);
        System.out.println((product % factor));
        br.close();

    }

}
