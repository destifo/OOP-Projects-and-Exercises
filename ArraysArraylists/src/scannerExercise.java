import java.util.Scanner;

public class scannerExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y = sc.nextDouble();
        String z = sc.next();
        System.out.printf("%d, %f, %s", x, y, z);


        sc.close();
    }
}
