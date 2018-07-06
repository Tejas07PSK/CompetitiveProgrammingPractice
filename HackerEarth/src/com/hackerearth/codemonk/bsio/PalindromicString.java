/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 06 Jul, 2018, 2:16 AM,
        @File-Name : PalindromicString.java

 */

package com.hackerearth.codemonk.bsio;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;

public class PalindromicString
{

    public static void main(String args []) throws Exception
    {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder((br.readLine()).toLowerCase());
            if ((sb.toString()).equalsIgnoreCase((sb.reverse()).toString()))
                System.out.println("YES");
            else
                System.out.println("NO");
            br.close();
    }

}
