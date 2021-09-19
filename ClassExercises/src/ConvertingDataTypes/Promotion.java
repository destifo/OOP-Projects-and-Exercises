package ConvertingDataTypes;

public class Promotion {
    public static void main(String[] args) {
        int num1 = 55_555;
        long num2 = 77_777;
        long num3 = num1 * num2;

        int castedDouble = (int)3.0;
        int choppedDouble = (int)5.9;
        byte intSum = (byte)(castedDouble + choppedDouble);

        short a, b, c;
        a = 1; b = 3;
        c = (short)(a + b);//c = a + b is an error as a and b are automatically promoted to ints

        int age, days; age = 10; days = 100;
        long longAge = age * days;

//        int num5 = 50 + 4.0; compiler error

//        float float1 = 50.5; compiler error
        float float1 = 50.5F;


        byte byteNum = 127;
        short num4 = 127;
        num4 +=1;
        num4 +=1;
        byteNum += 200;

        System.out.println(byteNum);
    }
}
