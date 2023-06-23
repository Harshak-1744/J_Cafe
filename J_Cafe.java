public class J_Cafe 
{
    public static void main(String[] args) 
    {
        System.out.println("Aloah Welcome to J_Cafe");
        System.out.println("Menu:-");

        String[][] menu = {
                                { "1. Pizza", "2. Burger", "3. mocktailes" },
                                { "4. coffee", "5. Briyani", "6. Pasteries" },
                                { "7. Noodles", "8. FriedRice", "9. Starters" }
                        };

        for (int i = 0; i < menu.length; i++) 
        {
            System.out.println();
            for (int j = 0; j < menu[i].length; j++) 
            {
                System.out.print(menu[i][j] + " ");
            }
        }
    }

}
