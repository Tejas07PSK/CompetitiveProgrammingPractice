/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 4 JUL, 2018, 1:47:53 PM
        @File-Name : FormatPrinting.java

 */

package com.hackerearth.codemonk.bsio;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FormatPrinting
{

    public synchronized static void main(String [] args) throws Exception
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println((Integer.parseInt(br.readLine()) * 2));
        System.out.println(br.readLine());
        br.close();

    }

}
