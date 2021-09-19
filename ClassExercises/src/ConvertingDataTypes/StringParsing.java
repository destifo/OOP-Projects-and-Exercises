package ConvertingDataTypes;

import java.util.Scanner;

public class StringParsing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the your age: \n");
        String ageString = sc.nextLine();
        sc.close();

        int parsedAge = Integer.parseInt(ageString);
        System.out.println("You are " + parsedAge + " Years old!");

    }
}
