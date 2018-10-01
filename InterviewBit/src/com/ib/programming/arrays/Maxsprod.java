/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 01 Oct, 2018, 9:22 PM,
        @File-Name : Maxsprod.java

 */

package com.ib.programming.arrays;

import java.util.Stack;

public class Maxsprod
{

    private final static Stack <Integer> stk =  new Stack <Integer> ();
    private final static long factor = 1000000007L;

    public long maxSpecialProduct(final int A [])
    {

        int left_right [] [] = new int [2] [];
        left_right [0] = getSpecialArray(A, A.length - 1, 0);
        left_right [1] = getSpecialArray(A, 0, A.length - 1);
        long max_spec_prod = 0L;
        for (int i = 0; i < A.length; i += 1)
        {

            max_spec_prod = Math.max(max_spec_prod, ((long)left_right[0][i] * left_right[1][i]));

        }
        return (max_spec_prod % factor);

    }

    private int [] getSpecialArray(final int A [], final int start, final int end)
    {

        int [] arr = new int [A.length];
        int range = end - start;
        for (int i = start; ((range > 0) ? (i <= end) : (i >= end)); i += ((range > 0) ? 1 : -1))
        {

            while ((!(stk.empty())) && (A[i] > A[stk.peek()]))
            {

                arr[stk.peek()] = i;
                stk.pop();

            }
            stk.push(i);

        }
        stk.clear();
        return (arr);

    }

}
