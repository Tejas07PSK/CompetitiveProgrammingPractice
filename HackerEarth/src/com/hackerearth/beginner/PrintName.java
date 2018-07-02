/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 2 JUL, 2018, 1:47:53 PM
        @File-Name : PrintName.java

 */

package com.hackerearth.beginner;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class PrintName
{

    public static void main(String args[]) throws Exception
    {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Hello " + br.readLine() + "!!");
            br.close();

    }

}
