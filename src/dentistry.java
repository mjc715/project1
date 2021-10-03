import java.util.Scanner;
//============================================================================
public class dentistry {
//----------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {

        int familyMembers;
        char [] [] [] teethArray;

        System.out.println("Welcome to the Floridian Tooth Records");
        System.out.println("======================================");
        System.out.printf("%-50s :","Please enter the number of people in the family");
        familyMembers = keyboard.nextInt();

        while (familyMembers < 0 || familyMembers > 6) {
            System.out.printf("%-50s :","Invalid number, please try again");
            familyMembers = keyboard.nextInt();
        }
        teethArray = new char [familyMembers] [] [];

    }

}
