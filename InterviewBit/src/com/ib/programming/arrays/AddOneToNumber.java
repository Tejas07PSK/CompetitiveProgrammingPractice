/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 08 Sep, 2018, 6:50 PM,
        @File-Name : AddOneToNumber.java

 */

package com.ib.programming.arrays;

import java.util.Stack;

public class AddOneToNumber
{

    public int [] plusOne(final int[] A)
    {

        if ((A == null) || (A.length == 0))
        {

            return (new int [0]);

        }
        if ((A[0] == 0) && (A.length == 1))
        {

            int tmp [] = {1};
            return (tmp);

        }
        final Stack <Integer> stk = new Stack <Integer> ();
        int i = 0, z = 0, carry = 1;
        int [] res_no = null;
        z = countZeroes(A);
        for (i = (A.length - 1); i >= z; i -= 1)
        {

            stk.push((A[i] + carry) % 10);
            carry = (A[i] + carry) / 10;
            if (carry == 0)
            {

                i -= 1;
                break;

            }

        }
        if ((i == (z - 1)) && (carry != 0))
        {

            stk.push(carry);

        }
        res_no = new int [(i - z + 1) + stk.size()];
        return (formNewNumber(A, res_no, stk, z, i));

    }

    private int countZeroes(final int A [])
    {

        int i = 0, z = 0;
        while (true)
        {

            if (A[i] != 0)
            {

                break;

            }
            z += 1;
            i += 1;

        }
        return (z);

    }

    private int [] formNewNumber(final int [] A, final int res_no [], final Stack <Integer> stk, int z, int i)
    {

        int j = 0, count = 0;
        for (j = z ; j <= i ; j += 1)
        {

            res_no[count] = A[j];
            count += 1;

        }
        while (!(stk.empty()))
        {

            res_no[count] = stk.pop();
            count += 1;

        }
        return (res_no);

    }

}
