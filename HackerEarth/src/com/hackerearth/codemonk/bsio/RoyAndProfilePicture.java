/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 06 Jul, 2018, 6:56 PM,
        @File-Name : RoyAndProfilePicture.java

 */

package com.hackerearth.codemonk.bsio;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RoyAndProfilePicture
{

    public static void main(String args []) throws Exception
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        short L = Short.parseShort(br.readLine());
        short N = Short.parseShort(br.readLine());
        for (short i = 0; i < N; i += 1)
        {

            String wh [] = (br.readLine()).split(" ");
            if ((Short.parseShort(wh[0]) < L) || (Short.parseShort(wh[1]) < L))
                System.out.println("UPLOAD ANOTHER");
            else
            {

                if ((Short.parseShort(wh[0]) >= L) && (Short.parseShort(wh[1]) >= L))
                {

                    if ((Short.parseShort(wh[0])) == (Short.parseShort(wh[1])))
                        System.out.println("ACCEPTED");
                    else
                        System.out.println("CROP IT");

                }
                else
                    ;

            }

        }
        br.close();

    }

}
