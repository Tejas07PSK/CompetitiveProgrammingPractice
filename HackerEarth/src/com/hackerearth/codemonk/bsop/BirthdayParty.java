/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 15 Jul, 2018, 9:01 PM,
        @File-Name : BirthdayParty.java

 */

package com.hackerearth.codemonk.bsop;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BirthdayParty
{

    public static void main(String args []) throws Exception
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte T = Byte.parseByte(br.readLine());
        String N_M [] = null;
        for (byte b = 0; b < T; b += 1)
        {

            N_M = (br.readLine()).split(" ");
            if ((Integer.parseInt(N_M[1]) % Integer.parseInt(N_M[0])) == 0)
                System.out.println("Yes");
            else
                System.out.println("No");

        }
        br.close();

    }

}
