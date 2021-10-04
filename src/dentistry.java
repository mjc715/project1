import java.util.Scanner;
//============================================================================
public class dentistry {
    //----------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        String teeth = "";
        int familyMembers, index, findex;
        int letterCount = 0;
        char[][][] teethArray;
        String[] namesArray;

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


        do {
            System.out.printf("%-50s :", "Please enter family member name");
            namesArray[index] = keyboard.next();
            do {
                for (index = 0; index < familyMembers; index++) {


                    System.out.printf("%-50s :", "Please enter uppers for " + namesArray[index]);
                    teeth = keyboard.next();
                    letterCount = teeth.length();
                    if (letterCount > 10) {
                        System.out.printf("%-50s \n1", "Too many teeth, try again");
                    }
                }
            } while (letterCount > 10);



                for (findex = 0; findex < teeth.length(); findex++) {
                    teeth = teeth.toUpperCase();
                    teethArray[index][0][findex] = teeth.charAt(findex);

                }


            } while (index < familyMembers);
        }
    }



