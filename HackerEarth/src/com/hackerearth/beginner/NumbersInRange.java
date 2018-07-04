package com.hackerearth.beginner;

import java.util.Scanner;

public class NumbersInRange
{

    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);
        for(int i = s.nextInt(); i <= s.nextInt(); i++)
            System.out.print(i + " ");
        System.out.println();
        s.close();

    }

}
