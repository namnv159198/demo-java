/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment;

/**
 *
 * @author namku
 */
import java.awt.*;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class bai1 {
    
    public static int soNguyenTo(int n)
{
    if (n < 2)    
        return 0;

    for (int i = 2; i <= sqrt((float)n); i ++)
    {
        if (n%i==0)
        {
            return 0;
        }
    }
    return 1;
}
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Nhập số N : ");
        int n = in.nextInt();
        System.out.print("Các số nguyên tố < "+n+ " là : ");
        for (int i = 0; i < n; i++) {
            if(soNguyenTo(i)==1){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}

