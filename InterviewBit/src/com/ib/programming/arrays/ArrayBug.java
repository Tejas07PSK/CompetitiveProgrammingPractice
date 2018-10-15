/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 16 Oct, 2018, 2:41 AM,
        @File-Name : ArrayBug.java

 */

package com.ib.programming.arrays;

import java.util.ArrayList;

public class ArrayBug
{

    public ArrayList<Integer> rotateArray(final ArrayList<Integer> A, final int B)
    {

        ArrayList<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < A.size(); i++)
        {

            if ((i + (B % A.size())) < A.size())
            {

                ret.add(A.get(i + (B % A.size())));

            }
            else
            {

                ret.add(A.get(i + (B % A.size()) - A.size()));

            }
        }
        return ret;

    }

}
