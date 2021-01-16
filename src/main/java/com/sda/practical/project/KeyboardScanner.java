package com.sda.practical.project;

import java.util.Scanner;

//clasa pe care o folosim ca sa citim de la tastatura

public class KeyboardScanner {
    private Scanner scanner;

    public KeyboardScanner() {
        this.scanner = new Scanner(System.in);
    }

    public void displayMessage (String message) {
        System.out.println(message);

    }

    public String verifyUserName() {
        return scanner.nextLine();
    }

    public int verifyPin() {
        return scanner.nextInt();
    }
}
