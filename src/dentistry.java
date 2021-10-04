import java.util.Scanner;
//======================================================================================================================
public class dentistry {
    //------------------------------------------------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        String uppers = "";
        int familyMembers, i, j;
        int letterCount = 0;
        char[][][] teethArray;
        String[] namesArray;
        index = 0;
        findex = 0;

        System.out.println("Welcome to the Floridian Tooth Records");
        System.out.println("======================================");
        System.out.printf("%-50s :", "Please enter the number of people in the family");
        familyMembers = keyboard.nextInt();

        while (familyMembers < 0 || familyMembers > 6) {
            System.out.printf("%-50s :", "Invalid number, please try again");
            familyMembers = keyboard.nextInt();
        }
        namesArray = new String[familyMembers];
        teethArray = new char[familyMembers][2][10];


        for (i = 0; i < familyMembers; i++) {
            System.out.printf("%-50s :", "Please enter family member name");
            namesArray[i] = keyboard.next();
            uppers = getUppers(i, namesArray);



        }
    }
//----------------------------------------------------------------------------------------------------------------------
    private static String getUppers(int i, String [] namesArray) {

        String uppers;
        int teethCount;
        char forbiddenChars = {'A','D','E','F','G','H','I','J','K','L','N','O','P','Q','R','S','T','U','V','W','X','Y',
        'Z'};

        System.out.printf("%-50s :", "Please enter uppers for " + namesArray[i]);
        uppers = keyboard.next();
        teethCount = uppers.length();

        while (teethCount > 10) {
            System.out.printf("%-50s \n", "Too many teeth, try again: ");
            uppers = keyboard.next();
            teethCount = uppers.length();
        }
        while (uppers.contains('a'));

    }
}





