/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 21 Aug, 2018, 11:23 AM,
        @File-Name : PicuBank.java

 */

package com.hackerearth.circuits.august18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Exception;
import java.lang.String;

public class PicuBank
{

    public static void main(String args [])
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try
        {

            int T = Integer.parseInt(br.readLine());
            String D_A_M_B_X [] = null;
            long result = 0;
            long temp = 0;
            long rem = 0;
            for (int i = 1; i <= T; i += 1)
            {

                D_A_M_B_X = (br.readLine()).split(" ");
                if (Long.parseLong(D_A_M_B_X[0]) >= Long.parseLong(D_A_M_B_X[4]))
                {

                    System.out.println(0);

                }
                else
                {

                    result = (Long.parseLong(D_A_M_B_X[4]) - Long.parseLong(D_A_M_B_X[0])) / ((Long.parseLong(D_A_M_B_X[1]) * Long.parseLong(D_A_M_B_X[2])) + Long.parseLong(D_A_M_B_X[3]));
                    temp = result * ((Long.parseLong(D_A_M_B_X[1]) * Long.parseLong(D_A_M_B_X[2])) + Long.parseLong(D_A_M_B_X[3]));
                    result *= Long.parseLong(D_A_M_B_X[2]) + 1L;
                    rem = Long.parseLong(D_A_M_B_X[4]) - Long.parseLong(D_A_M_B_X[0]);
                    if (temp != 0)
                    {

                        rem = (Long.parseLong(D_A_M_B_X[4]) - Long.parseLong(D_A_M_B_X[0])) % temp;

                    }
                    if (rem == 0)
                    {

                        System.out.println(result);

                    }
                    else
                    {

                        System.out.println(result + (long)Math.ceil(rem / Double.parseDouble(D_A_M_B_X[1])));

                    }

                }

            }

        }
        catch (Exception e)
        {

            ;

        }

    }

}
