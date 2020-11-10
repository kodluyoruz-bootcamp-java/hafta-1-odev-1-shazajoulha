package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        System.out.println("yuvarlamak istediginiz bir sayi giriniz:");
        float a = scan.nextFloat();

        System.out.println("girdiginiz"+a+" degerini asagiya yuvarlamak icin 1'i, yukariya yuvarlamak icin ise 0'i giriniz :");
        Scanner yvrlma = new Scanner(System.in);
        int b = scan.nextInt();

     if (b==1){
         System.out.println(Math.ceil(a));
    } else {
         System.out.println(Math.floor(a));
     }
    }
}
