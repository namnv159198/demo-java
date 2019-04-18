/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment;

import java.util.Scanner;

/**
 *
 * @author namku
 */
public class bai2 {
    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
       int n1 = 0, n2 = 1, n3=0, n,sum= 0;
       System.out.print("Nhập số phần tử trong dãy số fibonacci : ");
       n = in.nextInt();
        if (n == 1) {
            sum = n1;
            System.out.println(n + " phần tử đầu tiên trong dãy là : " + n1);
            System.out.println("Tổng " +n+ " phần tử đầu tiên trong dãy là " + sum);
        }else if (n==2){
            sum = n1+n2;
            System.out.println(n + " phần tử đầu tiên trong dãy là : " + n1+" " +n2);
            System.out.println("Tổng " +n+ " phần tử đầu tiên trong dãy là " + sum);
        }else{
            System.out.print(n + " phần tử đầu tiên trong dãy là : " +n1+" " +n2+" ");
            sum+=n1+n2;
        for (int i = 0; i < n -2 ; i++) {
                n3= n1+n2;
                System.out.print(n3+" ");
                n1=n2;
                n2=n3;
                sum+=n3;
            }
            System.out.println("\nTổng " +n+ " phần tử đầu tiên trong dãy là " + sum);
        } 
       
       
       
    }
}

