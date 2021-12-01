package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Encyclopedia enc = new Encyclopedia();
        System.out.print("Publication year = ");
        enc.publication_year();
        System.out.print("Book author = ");
        enc.book_author();

    }
}
