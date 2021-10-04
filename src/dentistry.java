import java.util.Scanner;
//======================================================================================================================
public class dentistry {
    //------------------------------------------------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        String uppers = "";
        String lowers = "";
        int familyMembers, i, j;
        int letterCount = 0;
        char[][][] teethArray;
        String[] namesArray;

        System.out.println("Welcome to the Floridian Tooth Records");
        System.out.println("====================================================");
        System.out.printf("%-50s :", "Please enter the number of people in the family");

        familyMembers = keyboard.nextInt();

        while (familyMembers < 0 || familyMembers > 6) {
            System.out.printf("%-50s :", "Invalid number, please try again");
            familyMembers = keyboard.nextInt();
        }
        namesArray = new String[familyMembers];
        teethArray = new char[familyMembers][2][10];


        for (i = 0; i < familyMembers; i++) {
            System.out.printf("%-50s :", "Please enter family member " + (i + 1) + " name");
            namesArray[i] = keyboard.next();
            uppers = getUppers(i, namesArray);
            lowers = getLowers(i, namesArray);



        }
        System.out.print(uppers + lowers);
    }
//----------------------------------------------------------------------------------------------------------------------
    private static String getUppers(int i, String [] namesArray) {

        String uppers;
        int teethCount;
        int j;

        System.out.printf("%-50s :", "Please enter uppers for " + namesArray[i]);
        uppers = keyboard.next();
        uppers = uppers.toUpperCase();
        teethCount = uppers.length();

        for (j = 0; j < uppers.length(); j++) {
            while (teethCount < 10 && uppers.charAt(j) != 'M' && uppers.charAt(j) != 'C' && uppers.charAt(j) != 'B') {
                if (uppers.charAt(j) != 'M' && uppers.charAt(j) != 'C' && uppers.charAt(j) != 'B') {
                    System.out.printf("%-50s :", "Invalid characters, try again ");
                    uppers = keyboard.next();
                    uppers = uppers.toUpperCase();
                    teethCount = uppers.length();
                    j = 0;
                }


                if (teethCount > 10) {
                    System.out.printf("%-50s :", "Too many teeth, try again ");
                    uppers = keyboard.next();
                    uppers = uppers.toUpperCase();
                    teethCount = uppers.length();
                }
            }
        }
        j = 0;
        return(uppers);
    }
//----------------------------------------------------------------------------------------------------------------------
    private static String getLowers(int i, String [] namesArray) {

        String lowers;
        int teethCount;
        int j;

        System.out.printf("%-50s :", "Please enter lowers for " + namesArray[i]);
        lowers = keyboard.next();
        lowers = lowers.toUpperCase();
        teethCount = lowers.length();

        for (j = 0; j < lowers.length(); j++) {
            while (teethCount < 10 && lowers.charAt(j) != 'M' && lowers.charAt(j) != 'C' && lowers.charAt(j) != 'B') {
                if (lowers.charAt(j) != 'M' && lowers.charAt(j) != 'C' && lowers.charAt(j) != 'B') {
                    System.out.printf("%-50s :", "Invalid characters, try again ");
                    lowers = keyboard.next();
                    lowers = lowers.toUpperCase();
                    teethCount = lowers.length();
                    j = 0;
                }


                if (teethCount > 10) {
                    System.out.printf("%-50s :", "Too many teeth, try again ");
                    lowers = keyboard.next();
                    lowers = lowers.toUpperCase();
                    teethCount = lowers.length();
                }
            }
        }
        j = 0;
        return(lowers);
    }
//----------------------------------------------------------------------------------------------------------------------
}





