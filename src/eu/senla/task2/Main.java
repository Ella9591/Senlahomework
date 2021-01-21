package eu.senla.task2;
/*
Created by Ella Mamadzan Annaeva/ 2021
 */

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int key;
        while (true) {
            System.out.println("Choose color:" +
                    "\nPrimary colors = 1 " +
                    "\nSemi color = 2 " +
                    "\nOutput= 0\n" +
                    "Enter a number:");

            key = Integer.parseInt(reader.readLine());
            if (key == 1) {
                Rainbow.Print();
                int color = Integer.parseInt(reader.readLine());
                System.out.print("Rainbow color: ");
                Rainbow.Rain(color);
                System.out.println("\n");
            } else if (key == 2) {
                Rainbow.Print();
                System.out.println("Enter a number: ");
                int color1 = Integer.parseInt(reader.readLine());
                System.out.println("Enter second number : ");
                int color2 = Integer.parseInt(reader.readLine());
                System.out.print("Rainbow color: ");
                Rainbow.Rain(color1, color2);
                System.out.println("\n");

            } else if (key == 0) break;
        }
    }
}
