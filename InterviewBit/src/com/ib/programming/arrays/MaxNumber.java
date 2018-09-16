/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 16 Sep, 2018, 2:00 PM,
        @File-Name : MaxNumber.java

 */

package com.ib.programming.arrays;

import java.util.Random;
import java.util.Stack;

public class MaxNumber
{

    private String largestNumber(final int A [])
    {

        if ((A == null) || (A.length == 0))
        {

            return ("");

        }
        else if (A.length == 1)
        {

            return (Integer.toString(A[0]));

        }
        String arr [] = MaxNumber.cnvToAtringArray(A);
        StringBuilder sb = new StringBuilder();
        Stack <Integer> stk = new Stack <Integer> ();
        Random r = new Random();
        int start_index = 0;
        int end_index = 0;
        int iterator = 0;
        String pivot = "";
        int low = 0;
        int high = 0;
        int random_index = 0;
        String temp = "";
        stk.push(0);
        stk.push(arr.length - 1);
        while (!(stk.isEmpty()))
        {

            high = stk.pop();
            low = stk.pop();
            if(high <= low)
            {

                continue;

            }
            random_index = low + ((r.nextInt(arr.length)) % (high - low + 1));
            if (!((arr[random_index]).equals(arr[low])))
            {

                temp = arr[low];
                arr[low] = arr[random_index];
                arr[random_index] = temp;

            }
            start_index = low;
            end_index = high;
            iterator = low;
            pivot = arr[low];
            while (iterator <= end_index)
            {

                if (compareTo((arr[iterator] + pivot), (pivot + arr[iterator])) > 0)
                {

                    if (!((arr[iterator]).equals(arr[start_index])))
                    {

                        temp = arr[start_index];
                        arr[start_index] = arr[iterator];
                        arr[iterator] = temp;

                    }
                    iterator += 1;
                    start_index += 1;

                }
                else if(compareTo((arr[iterator] + pivot), (pivot + arr[iterator])) < 0)
                {

                    if (!((arr[iterator]).equals(arr[end_index])))
                    {

                        temp = arr[end_index];
                        arr[end_index] = arr[iterator];
                        arr[iterator] = temp;

                    }
                    end_index -= 1;

                }
                else
                {

                    iterator += 1;

                }

            }
            if ((start_index - 1) > low)
            {

                stk.push(low);
                stk.push(start_index - 1);

            }
            if ((end_index + 1) < high)
            {

                stk.push(end_index + 1);
                stk.push(high);

            }

        }
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

    private static int compareTo(final String s1, final String s2)
    {

        for (int i = 0; (i < s1.length()) && (i < s2.length()); i += 1)
        {

            if (s1.charAt(i) == s2.charAt(i))
            {

                continue;

            }
            return ((int)s1.charAt(i) - (int)s2.charAt(i));

        }
        if (s1.length() < s2.length())
        {

            return (s2.charAt(s1.length()));

        }
        else if (s1.length() > s2.length())
        {

            return (s1.charAt(s2.length()));

        }
        else
        {

            return (0);

        }

    }

    private static String [] cnvToAtringArray(final int arr [])
    {

        String strs [] = new String [arr.length];
        for (int i = 0; i < arr.length; i += 1)
        {

            strs[i] = Integer.toString(arr[i]);

        }
        return (strs);

    }

    public static void main (String args [])
    {

        int inp_arr [] = {5, 100, 5};
        MaxNumber obj = new MaxNumber();
        System.out.println(obj.largestNumber(inp_arr));

    }

}
