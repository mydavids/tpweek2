package za.ac.cput.mydavids.multimoduleproj;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class DisplayMenu
{
    public static String userName;
    private static Scanner in = new Scanner(System.in);

    public static void main( String[] args )
    {
        System.out.println(showMenu());
        userName = in.nextLine();
    }

    public static String showMenu(){
        return "THIS IS THE MENU OF THIS APPLICATION\n"
                + "----------------------------------------\n"
                + "Please enter your name: ";
    }
}
