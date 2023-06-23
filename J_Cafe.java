import java.util.*;

public class J_Cafe {
    public static void main(String[] args) {
        int Pizza = 12;
        int Burger = 15;
        int Mocktail = 20;
        int coffee = 5;
        int Briyani = 20;
        int Pasteries = 10;
        int Noodels = 10;
        int FriedRice = 10;
        int Chicken_Winges = 20;

        System.out.println("Aloah! Welcome to J_Cafe");
        System.out.println("Menu:-");

        String[][] menu = {
                { "1. Pizza", "2. Burger", "3. mocktailes" },
                { "4. coffee", "5. Briyani", "6. Pasteries" },
                { "7. Noodles", "8. FriedRice", "9. Chicken-Winges" }
        };

        for (int i = 0; i < menu.length; i++) {
            System.out.println();
            for (int j = 0; j < menu[i].length; j++) {
                System.out.print(menu[i][j] + " ");
            }
        }

        Scanner input = new Scanner(System.in);
        System.out.println("\n \n" + "Enter your Choice:-");
        int response = input.nextInt();

        switch (response) {
            case 1:
                System.out.println("You Selected Pizza");
                System.out.println("i.e," + Pizza + "$");
                break;

            case 2:
                System.out.println("You Selected Burger");
                System.out.println("i.e," + Burger + "$");
                break;

            case 3:
                System.out.println("You Selected Mocktail");
                System.out.println("i.e," + Mocktail + "$");
                break;

            case 4:
                System.out.println("You Selected Coffee");
                System.out.println("i.e," + coffee + "$");
                break;

            case 5:
                System.out.println("You Selected Briyani");
                System.out.println("i.e," + Briyani + "$");
                break;

            case 6:
                System.out.println("You Selected Pastries");
                System.out.println("i.e," + Pasteries + "$");
                break;

            case 7:
                System.out.println("You Selected Noodels");
                System.out.println("i.e," + Noodels + "$");
                break;

            case 8:
                System.out.println("You Selected FriedRice");
                System.out.println("i.e," + FriedRice + "$");
                break;

            case 9:
                System.out.println("You Selected Chicken-Winges");
                System.out.println("i.e," + Chicken_Winges + "$");
                break;

        }
        System.out.println("\n" + "Thank you for Visiting J_Cafe" + "\n" + "Please Do Visit Again");
        input.close();
    }

}
