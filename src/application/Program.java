package application;

import entities.Guest;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.CANADA);
        Scanner scan = new Scanner(System.in);

        Guest[] listOfRooms = new Guest[10];
        System.out.print("How many rooms will be rented? ");
        int rooms = scan.nextInt();

        for (int i = 0; i < rooms; i++){
            System.out.println("Rent #" + (i + 1));
            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("Email: ");
            String email = scan.nextLine();
            System.out.print("Room: ");
            int rNum = scan.nextInt();

            listOfRooms[rNum] = new Guest(name, email);
        }

        System.out.println("Busy rooms: ");
        for (int i = 0; i < listOfRooms.length; i++){
            if (listOfRooms[i] != null){
                System.out.println(i + ": " + listOfRooms[i]);
            }
        }
        scan.close();
    }
}
