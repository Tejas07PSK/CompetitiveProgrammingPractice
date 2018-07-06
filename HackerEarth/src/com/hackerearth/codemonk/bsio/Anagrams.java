/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 06 Jul, 2018, 1:31 AM,
        @File-Name : Anagrams.java

 */

package com.hackerearth.codemonk.bsio;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

public class Anagrams
{

    public static void main(String args []) throws Exception
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.valueOf(br.readLine());
        for (int i = 0; i < T; i = i + 1)
        {

            System.out.println(countChsToDel((br.readLine()).toUpperCase(), (br.readLine()).toUpperCase()));

        }
        br.close();

    }

    private static int countChsToDel(String a, String b)
    {

        short [] uni_char_array = new short[26];
        short del_count = 0;
        for (short i = 0; i < a.length(); i += 1 )
        {

            uni_char_array[(short)a.charAt(i) - (short)65] += 1;

        }
        for (short i = 0; i < b.length(); i += 1)
        {

            uni_char_array[(short)b.charAt(i) - (short)65] -= 1;

        }
        for (byte i = 0; i < (short)uni_char_array.length; i += 1)
        {

            del_count += Math.abs(uni_char_array[i]);

        }
        return (del_count);

    }

}
