package com.sdajava.GraEuklidesa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public List<Integer> lista = new ArrayList<>();

    public Main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj liczbe meczów");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("podaj ilość żetonów gracza 1" + " dla meczu " + (i+1));
            lista.add(sc.nextInt());
            System.out.println("podaj ilość żetonów gracza 2" + " dla meczu " + (i+1));
            lista.add(sc.nextInt());
        }

    }
    public int[] gra(){
        int [] tab3 = new int[this.lista.size()];
            for (int i = 0; i < this.lista.size()/2; i++ ) {
                int a = this.lista.get(2*i);
                int b = this.lista.get(2*i+1);

                while (a != b){
                    if (a < b)
                        b -= a;
                    else
                        a -= b;
                }

                System.out.println("wynik meczu" +(i+1)+ " = " + (a+b));
            }
        return tab3;
    }
    
    public static void main(String[] args) {
	     Main zad1 = new Main();
         zad1.gra();
        

    }
}
