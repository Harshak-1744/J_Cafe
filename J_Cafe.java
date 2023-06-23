package mini_projects;

public class J_Cafe {
    public static void main(String[] args) {
        System.out.println("Aloah Welcome to J_Cafe");
        System.out.println("Menu:-");

        String[][] menu = new String[3][3];

        menu[0][0] = "1. Pizza";
        menu[0][1] = "2. Burger";
        menu[0][2] = "3. mocktailes";
        menu[1][0] = "4. coffee";
        menu[1][1] = "5. Briyani";
        menu[1][2] = "6. Pasteries";
        menu[2][0] = "7. Noodles";
        menu[2][1] = "8. FriedRice";
        menu[2][2] = "9. Starters";

        for (int i = 0; i < menu.length; i++) {
            System.out.println();
            for (int j = 0; j < menu[i].length; j++) {
                System.out.print(menu[i][j] + " ");
            }
        }
    }

}
