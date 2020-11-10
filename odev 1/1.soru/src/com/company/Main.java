package com.company;



public class Main {
    public static void main(String[] args) {


    int sayilar=0;
    int adet=0;
    for (int i = 0; i < 2000; i++) {
        if (i%3==0 && i%5==0 && i%7==0 && i%53==0) {
            adet++;
            sayilar+=i;

        }
    }
    System.out.println("adet: " +adet);
    System.out.println("sayılar: "+ sayilar);
    System.out.println("Ortalama: "+sayilar/adet);
    }

}

