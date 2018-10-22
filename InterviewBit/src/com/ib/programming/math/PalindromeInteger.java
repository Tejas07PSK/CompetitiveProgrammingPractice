/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 23 Oct, 2018, 3:18 AM,
        @File-Name : PalindromeInteger.java

 */

package com.ib.programming.math;

public class PalindromeInteger
{

    public int isPalindrome(int n)
    {

        //negative numbers are not considered palindromic, as stated in the question.
        if (n < 0)
        {

            return (0);

        }
        int div = 1;
        while ((n / div) >= 10)
        {

            div *= 10;

        }
        while (n != 0)
        {

            if ((n / div) != (n % 10))
            {

                return (0);

            }
            n = ((n % div) / 10);
            div /= 100;

        }
        return (1);

    }

}
