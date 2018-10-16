/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 16 Oct, 2018, 6:29 AM,
        @File-Name : Nby3RepeatNumber.java

 */

package com.ib.programming.arrays;

import java.util.List;

public class Nby3RepeatNumber
{

    // DO NOT MODIFY THE LIST.
    public int repeatedNumber(final List <Integer> a)
    {

        int one = Integer.MAX_VALUE, count1 = 0, two = Integer.MAX_VALUE, count2 = 0;
        int length = a.size(), i = 0;
        // modified Boyer-Moore voting algorithm, for finding majority cadidates.
        while (i < length)
        {

            if (a.get(i) == one)
            {

                count1 += 1;

            }
            else if (a.get(i) == two)
            {

                count2 += 1;

            }
            else if (count1 == 0)
            {

                one = a.get(i);
                count1 += 1;

            }
            else if (count2 == 0)
            {

                two = a.get(i);
                count2 += 1;

            }
            else
            {

                count1 -= 1;
                count2 -= 1;

            }
            i += 1;

        }
        count1 = 0;
        count2 = 0;
        // finding frequencies of the majority candidates.
        for (i = 0; i < length; i += 1)
        {

            if (a.get(i) == one)
            {

                count1 += 1;

            }
            else if (a.get(i) == two)
            {

                count2 += 1;

            }

        }
        // verifying the frequencies of the majority candidates according to the problem statement.
        if (count1 > (length / 3))
        {

            return (one);

        }
        if (count2 > (length / 3))
        {

            return (two);

        }
        return (-1);

    }

}
