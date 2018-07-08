/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 08 Jul, 2018, 8:01 PM,
        @File-Name : Cipher.java

 */

package com.hackerearth.codemonk.bsio;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Character;

public class Cipher
{

    public static void main(String args []) throws Exception
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char text_arr [] = (br.readLine()).toCharArray();
        short key = Short.valueOf(br.readLine());
        for (short i = 0; i < text_arr.length; i += 1)
        {

            if (Character.isDigit(text_arr[i]))
            {

                text_arr[i] = ((Short.parseShort(String.valueOf(text_arr[i])) + key) > (short)9) ? Character.forDigit(((Short.parseShort(String.valueOf(text_arr[i])) + key) % (short)10), 10) : Character.forDigit((Short.parseShort(String.valueOf(text_arr[i])) + key), 10);

            }
            else if (Character.isUpperCase(text_arr[i]))
            {

                text_arr[i] = ((((short)text_arr[i] - (short)65) + key) > (short)25) ? (char)(((((short)text_arr[i] - (short)65) + key) % (short)26) + (short)65) : (char)((((short)text_arr[i] - (short)65) + key) + (short)65);

            }
            else if (Character.isLowerCase(text_arr[i]))
            {

                text_arr[i] = ((((short)text_arr[i] - (short)97) + key) > (short)25) ? (char)(((((short)text_arr[i] - (short)97) + key) % (short)26) + (short)97) : (char)((((short)text_arr[i] - (short)97) + key) + (short)97);

            }
            else
                ;

        }
        System.out.println(new String(text_arr));
        br.close();

    }

}
