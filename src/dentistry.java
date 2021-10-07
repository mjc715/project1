import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
//======================================================================================================================
public class dentistry {
    //-Uppercase name^--------------------------------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);
    private static final int ROWS_OF_TEETH = 2;
    private static final int MAX_TEETH = 10;

    public static void main(String[] args) {

        String uppers = "";
        String lowers = "";
        int familyMembers, i, j;
        int letterCount = 0;
        char[][][] teethArray;
        char optionChar;
        String optionString, familyString;
        String[] namesArray;
        boolean proceed = false;

        System.out.println("Welcome to Castellucci Tooth Records");
        System.out.println("====================================================");
        System.out.printf("%-50s :", "Please enter the number of people in the family");

        familyMembers = keyboard.nextInt();

        while (familyMembers < 0 || familyMembers > 6) {
            System.out.printf("%-50s :", "Invalid number, please try again");
            familyMembers = keyboard.nextInt();
            System.out.print(familyMembers);
        }

        namesArray = new String[familyMembers];
        teethArray = new char[familyMembers][ROWS_OF_TEETH][MAX_TEETH];


        for (i = 0; i < familyMembers; i++) {
            System.out.printf("%-50s :", "Please enter family member " + (i + 1) + " name");
            namesArray[i] = keyboard.next();
            uppers = getUppers(i, namesArray);
            lowers = getLowers(i, namesArray);
            for (j = 0; j < uppers.length(); j++) {
                teethArray[i][0][j] = uppers.charAt(j);
            }
            for (j = 0; j < lowers.length(); j++) {
                teethArray[i][1][j] = lowers.charAt(j);
            }

        }
        while (!proceed) {
            System.out.printf("%-50s :","(P)rint, (E)xtract, (R)oot, or e(X)it");
            optionString = keyboard.next();
            optionString = optionString.toUpperCase();
            optionChar = optionString.charAt(0);


            switch (optionChar) {
                case 'P':
                    printTeeth(teethArray, namesArray);
                    break;
                case 'E':
                    teethArray = extractTeeth(teethArray, namesArray);
                    break;
                case 'R':
                    rootTeeth();
                    break;
                case 'X':
                    proceed = true;
                    System.out.println("Thank you for choosing Castellucci Dentistry");
                    break;
                default:
                    System.out.printf("%-50s :","Invalid character, try again");
                    optionString = keyboard.next();
                    optionString = optionString.toUpperCase();
                    optionChar = optionString.charAt(0);
                    break;

            }
        }






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
    private static void printTeeth(char [][][] teethArray,String [] namesArray) {

        int i,j;

        for (i = 0; i < namesArray.length; i++) {

            System.out.println(namesArray[i]);
            System.out.printf("%10s :","Uppers");

            for (j = 0; j < teethArray[i][0].length; j++) {

                if (teethArray[i][0][j] != '\0') {
                    System.out.print("  " + (j + 1) + ":" + teethArray[i][0][j]);
                }
            }
            System.out.println();
            System.out.printf("%10s :","Lowers");

            for (j = 0; j < teethArray[i][1][j]; j++) {
                System.out.print("  " + (j + 1) + ":" + teethArray[i][1][j]);
            }
            System.out.println();
        }

        }
//----------------------------------------------------------------------------------------------------------------------
    private static char[][][] extractTeeth(char [][][] teethArray, String [] namesArray) {

        String member, rowInput;
        int toothNumber;
        char rowChar;
        int i,j;
        boolean done = false;
        String [] namesArrayCopy = namesArray.clone();

        for (i = 0; i < namesArrayCopy.length; i++) {
            namesArrayCopy[i] = namesArrayCopy[i].toUpperCase();
        }

        System.out.printf("%-50s :","Which family member?");
        member = keyboard.next();
        member = member.toUpperCase();

        while (!Arrays.asList(namesArrayCopy).contains(member)) {

            System.out.printf("%-50s :","Invalid family member, try again.");
            member = keyboard.next();
            member = member.toUpperCase();

        }

        for (i = 0; i < namesArray.length; i++) {
            if (Objects.equals(namesArrayCopy[i], member)) {

                System.out.printf("%-50s :","(U)pper or (L)ower row?");
                rowInput = keyboard.next();
                rowInput = rowInput.toUpperCase();
                rowChar = rowInput.charAt(0);

                switch (rowChar) {
                    case 'U':

                        System.out.printf("%-50s :","Which tooth number?");
                        toothNumber = keyboard.nextInt();

                        while (toothNumber > 10 || teethArray[i][0][(toothNumber - 1)] == '\0'
                        || teethArray[i][0][(toothNumber - 1)] == 'M') {

                            System.out.printf("%-50s :","Invalid tooth, try again");
                            toothNumber = keyboard.nextInt();

                        }
                        teethArray[i][0][(toothNumber - 1)] = 'M';
                        break;
                    case 'L':

                        System.out.printf("%-50s :","Which tooth number?");
                        toothNumber = keyboard.nextInt();

                        while (toothNumber > 10 || teethArray[i][1][(toothNumber - 1)] == '\0'
                        || teethArray[i][1][(toothNumber - 1)] == 'M') {

                            System.out.printf("%-50s :","Invalid tooth, try again");
                            toothNumber = keyboard.nextInt();

                        }
                        teethArray[i][1][(toothNumber - 1)] = 'M';
                        break;
                }
            }
        }
        return(teethArray);
    }
//----------------------------------------------------------------------------------------------------------------------
    private static int rootTeeth() {
        int root1 = 0;
        return(root1);
    }
//----------------------------------------------------------------------------------------------------------------------
}





