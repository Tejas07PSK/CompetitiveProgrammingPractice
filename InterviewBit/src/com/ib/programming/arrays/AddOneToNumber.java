/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 08 Sep, 2018, 6:50 PM,
        @File-Name : AddOneToNumber.java

 */

package com.ib.programming.arrays;

import java.util.Stack;

public class AddOneToNumber
{

    public int[] plusOne(int[] number)
    {

        if ((number == null) || (number.length == 0))
        {

            return (new int [0]);

        }
        if ((number[0] == 0) && (number.length == 1))
        {

            int tmp [] = {1};
            return (tmp);

        }
        Stack <Integer> tmp_lst = new Stack <Integer> ();
        int i = 0, j = 0, z = 0, count = 0, new_num_len = 0, carry = 1;
        int [] res_num = null;
        while (true)
        {

            if (number[i] != 0)
            {

                break;

            }
            z += 1;
            i += 1;

        }
        for (i = (number.length - 1); i >= z; i -= 1)
        {

            tmp_lst.push((number[i] + carry) % 10);
            carry = (number[i] + carry) / 10;
            if (carry == 0)
            {

                i -= 1;
                break;

            }

        }
        if ((i == (z - 1)) && (carry != 0))
        {

            tmp_lst.push(carry);

        }
        new_num_len = (i - z + 1) + tmp_lst.size();
        res_num = new int [new_num_len];
        for (j = z ; j <= i ; j += 1)
        {

            res_num[count] = number[j];
            count += 1;

        }
        while (!(tmp_lst.empty()))
        {

            res_num[count] = tmp_lst.pop();
            count += 1;

        }
        return (res_num);

    }

}
