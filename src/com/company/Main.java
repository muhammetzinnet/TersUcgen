package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Çizilecek olan ters yıldızın basamak sayısını girin = ");
        int step = input.nextInt();

        for (int i = 0; i < step; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(" ");
            }

            for (int k = 2 * step-1; k >= (2 * i + 1); k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
