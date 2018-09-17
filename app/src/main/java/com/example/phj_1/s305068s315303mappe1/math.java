package com.example.phj_1.s305068s315303mappe1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class math {

    private static Scanner input = new Scanner(System.in);
    private static int svar;
    private static int riktig, feil, antallRiktig;


    private static int tilfeldigTall(int min, int max) {
        Random random = new Random();

        return random.nextInt((max - min) + 1) + min;
    }


    //lage liste over tall som ikke går igjen for å generere tilfeldig oppgave
    private static ArrayList<Integer> RandomInt(int size, int min, int max) {
        ArrayList<Integer> tall= new ArrayList<>();

        while (tall.size() < size) {
            int nyTall = tilfeldigTall(min, max);
            //sørger for at tall ikke går igjen.
            if (!tall.contains(nyTall)) {
                tall.add(nyTall);
            }
        }

        return tall;
    }

    private static int StartGame(int k) {



        ArrayList<Integer> list = RandomInt(k, 0, 25);



        String[] game={"1+1=?", "2+1=?", "3-1=?", "2-2=?", "2+5=?", "4+5=?", "5-2=?", "8+1=?", "7-4=?", "6-5=?", "1+8=?", "4+4=?", "9-2=?",
                "9-7=?", "8-5=?", "4+2=?", "1+5=?", "3+6=?", "2+7=?", "2-2=?", "4+3=?", "9-9=?", "5-4=?", "6-3=?", "4-1=?"};
        int[] answer={2, 3, 2, 0, 7, 9, 3, 9, 3, 1, 9, 8, 7, 2, 3, 6, 6, 9, 9, 0, 7, 0, 1, 3, 3};

        for(int i=0;i <= list.size()-1; i++) {

            System.out.println("hva er "+ game[list.get(i)]+":");



            while (true) {

                String inn = input.nextLine();
                //sjekk brukerens input.
                try {
                    svar = Integer.parseInt(inn);
                    break;
                } catch (NumberFormatException e) {
                    System.out.print("Vennligst prøv igjen :) ");
                }
            }

            if(svar==answer[list.get(i)]) {
                riktig++;
                System.out.println("riktig:)");
            }
            else if(svar!=answer[list.get(i)]) {
                feil++;
                System.out.println("feil:(");
            }
        }
        System.out.println("antall riktig: "+riktig);
        System.out.println("antall feil: "+feil);
        antallRiktig=riktig;
        return antallRiktig;
    }



    public static void main (String[] args) {
        StartGame(10);
        System.out.println(antallRiktig);
    }
}
