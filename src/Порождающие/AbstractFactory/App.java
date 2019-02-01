package Порождающие.AbstractFactory;

import java.util.Scanner;

public class App {
    private static Squadron getSquadron(String type){
        Squadron squadron = null;
        SquadronFactory squadronFactory;

        switch (type){
            case "elf":
                squadronFactory = new ElfSquadronFactory();
                squadron = new Squadron(squadronFactory);
                break;
            case "ork":
                System.out.println("Need to creat orks");
                break;
            case "warrior":
                System.out.println("Need to create warrior");
                break;


        }return squadron;

    }

    public static void main(String[] args) {
        System.out.println("Enter type: ");
        Scanner sc = new Scanner(System.in);

        String type = sc.nextLine();

        Squadron squadron = getSquadron(type);

        squadron.fight();
    }

}
