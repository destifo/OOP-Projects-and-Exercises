package IOParsing;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SalaryUpdateTest {


    public static void main(String[] args) {


        String writeOn = "Emp_june.txt";
        String readEmp = "Emp_may.txt";
        String readHr = "Hrs_june.txt";
        String empData;
        String hr;
        BufferedReader brEmp = null;
        BufferedReader brHrs = null;
        BufferedWriter bwEmp = null;

        try {
            brEmp = new BufferedReader(new FileReader(readEmp));
            brHrs = new BufferedReader(new FileReader(readHr));
            bwEmp = new BufferedWriter(new FileWriter(writeOn));
            String line = brEmp.readLine();
            while (line != null) {
                StringTokenizer stk = new StringTokenizer(line);
                StringTokenizer st = new StringTokenizer(line);

                while (stk.hasMoreTokens()) {
                    String name = stk.nextToken();
                    String ssn = stk.nextToken();
                    String rate = stk.nextToken();
                    String salary = stk.nextToken(); //Integer.parseInt(st.nextToken()));
                    bwEmp.write(name + "\n");
                    bwEmp.write(ssn + "\n");
                    bwEmp.write(rate + "\n");
                    bwEmp.write(salary + "\n");

                }

            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (bwEmp != null) {
                try {
                    bwEmp.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            if (brEmp != null) {
                try {
                    brEmp.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                if (brHrs != null) {
                    try {
                        brHrs.close();
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            }
        }


        //        EmployeeSalaryCheck file1 = new EmployeeSalaryCheck("Emp_May.txt", "Hrs_june.txt", "Emp_june.txt");


//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the line of the text that u wanna enter");
//        int lineNo = sc.nextInt();
//        String testFile = "";
//        while(lineNo >= 0) {
//            testFile += "\n" + sc.nextLine();
//            lineNo--;
//        }
//        sc.close();
//        System.out.println(testFile);
//        BufferedWriter bw1 = null;
//
//        String writeon = null;
//
//        try{
//            bw1 = new BufferedWriter(new FileWriter(writeon));
//            bw1.write(testFile);
//        }catch (IOException ex){
//            System.out.println(ex.getMessage());
//        }
//        finally {
//            if(bw1 != null){
//                try {
//                    bw1.close();
//                }catch (IOException ex){
//                    System.out.println(ex.getMessage());
//                }
//        }
//
//        }
//
    }
}
