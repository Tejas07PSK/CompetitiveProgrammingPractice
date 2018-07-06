/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 05 Jul, 2018, 8:46 PM,
        @File-Name : SeatingArrangement.java

 */

package com.hackerearth.codemonk.bsio;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SeatingArrangement
{

    public static void main(String args []) throws Exception
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.valueOf(br.readLine());
        for ( int i = 0; i < T;  i = i + 1)
        {

            byte seat_no = Byte.parseByte(br.readLine());
            switch (seat_no % (byte)12)
            {

                case 0 : System.out.println((seat_no - (byte)11) + " WS");
                         break;
                case 1 : System.out.println((seat_no + (byte)11) + " WS");
                         break;
                case 2 : System.out.println((seat_no + (byte)9) + " MS");
                         break;
                case 3 : System.out.println((seat_no + (byte)7) + " AS");
                         break;
                case 4 : System.out.println((seat_no + (byte)5) + " AS");
                         break;
                case 5 : System.out.println((seat_no + (byte)3) + " MS");
                         break;
                case 6 : System.out.println((seat_no + (byte)1) + " WS");
                         break;
                case 7 : System.out.println((seat_no - (byte)1) + " WS");
                         break;
                case 8 : System.out.println((seat_no - (byte)3) + " MS");
                         break;
                case 9 : System.out.println((seat_no - (byte)5) + " AS");
                         break;
                case 10 : System.out.println((seat_no - (byte)7) + " AS");
                          break;
                case 11 : System.out.println((seat_no - (byte)9) + " MS");
                          break;
                case 12 : System.out.println((seat_no - (byte)11) + " WS");
                          break;
                default : break;

            }

        }
        br.close();

    }

}
