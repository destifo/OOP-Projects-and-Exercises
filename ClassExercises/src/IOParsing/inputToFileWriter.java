package IOParsing;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class inputToFileWriter {
    public void inputToFileWriter(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the line of the text that u wanna enter");
        int lineNo = sc.nextInt();
        String testFile = "";
        while(lineNo >= 0) {
            testFile += "\n" + sc.nextLine();
            lineNo--;
        }
        sc.close();
        System.out.println(testFile);
        BufferedWriter bw1 = null;

        String writeon = null;

        try{
            bw1 = new BufferedWriter(new FileWriter(writeon));
            bw1.write(testFile);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        finally {
            if(bw1 != null){
                try {
                    bw1.close();
                }catch (IOException ex){
                    System.out.println(ex.getMessage());
                }
            }

        }
    }
}
