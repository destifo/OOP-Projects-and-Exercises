package IOParsing;

import java.io.*;
import java.util.StringTokenizer;

public class EmployeeSalaryCheck {
    private String writeOn = "Emp_june.txt";
    private String readEmp = "Emp_may.txt";
    private String readHr = "Emp_hrs.txt";
    private String empData;
    private String hr;
    private BufferedReader brEmp = null;
    private BufferedReader brHrs = null;
    private BufferedWriter bwEmp = null;

    public EmployeeSalaryCheck(String readEmp, String readHr, String writeOn){
        this.readEmp= readEmp;
        this.readHr = readHr;
        this.writeOn = writeOn;
        ReadAndCopy(readEmp, readHr, writeOn);
    }

    private void ReadAndCopy(String readEmp, String readHr, String writeOn) {
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


    }
}
