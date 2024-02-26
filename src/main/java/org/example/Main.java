package org.example;

// Klavyeden küçük harflerle girilen bir cümledeki sesli harfilerin sayısını ve cümledeki yerini bulan program.

// örn. ----> algoritma geliştirme ve programlamaya giriş

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i,j,s=0;
        int[] yer = new int[255];
        String c;
        char[] B = {'a','e','ı','i','o','ö','u','ü'};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Cümle Giriniz : ");
        c = scanner.nextLine();

        for (i=0; i<c.length(); i++){
            for (j=0; j<8; j++)
                if (c.charAt(i)==B[j]){
                    s++; yer[s-1]=i+1;
                }
        }
        System.out.println("\nCümlede "+s+" tane sesli harf vardır.");
        System.out.println("\nYerleri : ");
        for (i=0; i<s; i++)
            System.out.print(yer[i] + "-");
    }
}