/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 20 Oct, 2018, 10:16 PM,
        @File-Name : FizzBuzz.java

 */

package com.ib.programming.math;

import java.util.ArrayList;

public class FizzBuzz
{

    public ArrayList <String> fizzBuzz(final int A)
    {

        ArrayList <String> list = new ArrayList <String> ();
        for (int i = 1; i <= A; i++)
        {

            if (((i % 3) == 0) && ((i % 5) == 0))
            {

                list.add("FizzBuzz");

            }
            else if ((i % 3) == 0)
            {

                list.add("Fizz");

            }
            else if ((i % 5) == 0)
            {

                list.add("Buzz");

            }
            else
            {

                list.add(Integer.toString(i));

            }

        }
        return (list);

    }

}
