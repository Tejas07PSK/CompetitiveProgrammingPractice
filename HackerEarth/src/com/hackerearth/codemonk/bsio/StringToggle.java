/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 06 Jul, 2018, 6:19 PM,
        @File-Name : StringToggle.java

 */

package com.hackerearth.codemonk.bsio;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringToggle
{

    public static void main(String args []) throws Exception
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char [] in_str = (br.readLine()).toCharArray();
        for (byte i = 0; i < in_str.length; i += 1)
        {

            if (((byte)in_str[i] >= (byte)65) & ((byte)in_str[i] <= (byte)90))
                in_str[i] = (char)((byte)97 + ((byte)in_str[i] - (byte)65));
            else if (((byte)in_str[i] >= (byte)97) & ((byte)in_str[i] <= (byte)122))
                in_str[i] = (char)((byte)65 + ((byte)in_str[i] - (byte)97));
            else
                ;

        }
        System.out.println(new String(in_str));
        br.close();

    }

}
