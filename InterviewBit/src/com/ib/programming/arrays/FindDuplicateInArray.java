/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 27 Sep, 2018, 1:39 PM,
        @File-Name : FindDuplicateInArray.java

 */

package com.ib.programming.arrays;

import java.util.List;

public class FindDuplicateInArray
{

    public int repeatedNumber(final List <Integer> A)
    {

        if ((A == null) || (A.size() <= 1))
        {

            return (-1);

        }
        int tort = A.get(0), rabbit = A.get(A.get(0));
        while (tort != rabbit)
        {

            tort = A.get(tort);
            rabbit = A.get(A.get(rabbit));

        }
        tort = 0;
        while (tort != rabbit)
        {

            tort = A.get(tort);
            rabbit = A.get(rabbit);

        }
        return (tort);

    }

}
