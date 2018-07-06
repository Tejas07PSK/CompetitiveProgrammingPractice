/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 06 Jul, 2018, 7:50 PM,
        @File-Name : TwoStrings.java

 */

package com.hackerearth.codemonk.bsio;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

public class TwoStrings
{

    public static void main(String [] args) throws Exception
    {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            byte T = Byte.valueOf(br.readLine());
            for (byte i = 0; i < T; i +=  1)
            {

                String strs[] = (br.readLine()).split(" ");
                if (strs[0].length() != strs[1].length())
                    System.out.println("NO");
                else if (check(strs[0], strs[1]))
                    System.out.println("YES");
                else
                    System.out.println("NO");

            }
            br.close();

    }

    private static boolean check(String s1, String s2)
    {

        int alf_arr [] = new int [26];
        boolean flag = true;
        for (int i = 0; i < s1.length(); i += 1)
        {

            alf_arr[((int)s1.charAt(i) - 97)] += 1;
            alf_arr[((int)s2.charAt(i) - 97)] -= 1;

        }
        for (int i = 0; i < 26; i = i + 1)
        {

            if (alf_arr[i] != 0)
            {

                flag = false;
                break;

            }

        }
        return (flag);

    }

}
