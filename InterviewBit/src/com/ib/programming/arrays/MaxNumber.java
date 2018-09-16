/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 16 Sep, 2018, 2:00 PM,
        @File-Name : MaxNumber.java

 */

package com.ib.programming.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class MaxNumber
{

    public String largestNumber(final int A [])
    {

        if ((A == null) || (A.length == 0))
        {

            return ("");

        } else if (A.length == 1)
        {

            return (Integer.toString(A[0]));

        }
        String arr[] = getStringArray(A);
        StringBuilder sb = new StringBuilder();
        Arrays.sort(arr, new Comparator <String> ()
                        {

                            @Override
                            public int compare(String o1, String o2)
                            {

                                return (((o1 + o2). compareTo(o2 + o1)) > 0 ? -1 : 1);

                            }

                        });
        if ((arr[0]).equals("0"))
        {

            return ("0");

        }
        for (String s : arr)
        {

            sb.append(s);

        }
        return (sb.toString());

    }

    private static String [] getStringArray(final int arr [])
    {

        String txt [] = new String [arr.length];
        for (int i = 0; i < arr.length; i += 1)
        {

            txt[i] = Integer.toString(arr[i]);

        }
        return (txt);

    }

}
