package com.company;

class Araba {
    int arabaModeli;
    int arabaHizi;
    int arabaFiyati;

    public Araba(){ //consturctor metod, class ile ayni isime sahip ve return type yoktur
        System.out.println("bir araba objesi olusturuldu");
    }
    public Araba(int arabaModeli , int arabaHizi , int arabaFiyati) {
        this.arabaModeli= arabaModeli;
        this.arabaHizi=arabaHizi;
        this.arabaFiyati=arabaFiyati;

    }
}

public class Main {

    public static void main(String[] args) {

        Araba mercedes = new Araba(); //default constructor
        mercedes.arabaFiyati=1000;
        mercedes.arabaHizi=120;
        System.out.println("mercedes arabanin modeli :"+ mercedes.arabaModeli +" hizi :"+mercedes.arabaHizi);


        Araba ferrari = new Araba(2000,200,20000);
        System.out.println("ferrari arabanin modeli :"+ ferrari.arabaModeli +" hizi :"+ferrari.arabaHizi+"fiyati :"+ ferrari.arabaFiyati);



    }
}
