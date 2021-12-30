package classroom;

import java.util.Arrays;

public class PrimitiveTypes {
    public static void main(String[] args) {

       // Floating point example

        float floatexample = 999999.99F;
        System.out.println(floatexample);
        System.out.println(999999.99F);

        double doubleExample = 2000000.9876D;
        System.out.println(doubleExample);
        System.out.println(2000000.9876D);
//      Integral example

//      byte
        byte handCount = 2;
        System.out.println(handCount);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        short distanceBetweenKievAndRiga = 1011;
        System.out.println(distanceBetweenKievAndRiga);

        int populationOfLatvia = 190000;
        System.out.println(populationOfLatvia);

        long currentWorldPopulation = 7900000000L;
        System.out.println(currentWorldPopulation);

        char ch = 'P';
        System.out.println(ch);

        int[] arrayOfPeopleAges = {21, 22, 23, 24};
        System.out.println(Arrays.toString(arrayOfPeopleAges));

//      String variables

        String myName = "Ilja";
        System.out.println(myName);

        String mySurname = "Zinkov";
        String myNameAndUsername = myName +""+ mySurname;
        System.out.println(myNameAndUsername);

        //

        System.out.printf("My name is %s. My surname is %s.\n", myName, mySurname);

        int  sumOfTwoNumbers = 10 + 30;
        System.out.println(sumOfTwoNumbers);
        System.out.println(5 + 10);
        System.out.println("5 + 10");

        int a = 30;
        int b = 5;
        System.out.println(a / b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a + b);

        float doubleDivision = 100 / 13F;
        System.out.println(doubleDivision);


    }

}
