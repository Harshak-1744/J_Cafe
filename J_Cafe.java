package mini_projects;

public class J_Cafe {
    public static void main(String[] args) {
        System.out.println("Aloah Welcome to J_Cafe");
        System.out.println("Menu:-");

        String[] menu = new String[3];

        menu[0] = "1.Pizza";
        menu[1] = "2.Burger";
        menu[2] = "3.mocktailes";

        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i]);
        }
    }

}
