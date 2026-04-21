package com.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int slot = getUserInput();

        System.out.println("You selected slot: " + slot);
    }

    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a slot (1-9): ");
        int slot = scanner.nextInt();

        return slot;
    }
}