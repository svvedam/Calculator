import java.util.Scanner;

public class InputOutput {
    public int scanOneInteger()
    {
        //For methods that call for one integer
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int acceptOneInteger = scanner.nextInt();
        return acceptOneInteger;
    }

    public double scanOneDouble()
    {
        //For methods that call for one double number

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double acceptOneDouble = scanner.nextDouble();
        return acceptOneDouble;
    }

    public int[] scanTwoIntegers(){
        Scanner scanner = new Scanner(System.in);
        int [] arr;
        arr = new int[2];
        System.out.println("First number: ");
        int num1 = scanner.nextInt();
        System.out.println("Second number:" );
        int num2 = scanner.nextInt();
        arr[0]= num1;
        arr[1]= num2;

        return arr;
    }
    public void displayBasicCalcMessage(){
        System.out.println("Choose Basic calculator operation :");
        System.out.println("1. Addition ");
        System.out.println("2. Subtraction ");
        System.out.println("3. Multiplication ");
        System.out.println("4. Division ");
        System.out.println("5. SquareRoot ");
        System.out.println("6. Exponent " );
        System.out.println("7. Inverse ");
        System.out.println("8. Switch signs of number ");
    }
    public void displayInitialMessage(){
        System.out.println("Enter display mode 0.Binary, 1.Octal, 2.Decimal, 3. Hexadecimal");
    }
    public void displayTrigMessage(){
        System.out.println("Choose Trigonometry operation :");
        System.out.println("1. Sine ");
        System.out.println("2. Cosine ");
        System.out.println("3. Tangent ");
        System.out.println("4. Inverse Sine ");
        System.out.println("5. Inverse Cosine ");
        System.out.println("6. Inverse Tangent " );
    }
    public void basicVSscientificMessage(){
        System.out.println("Choose Basic vs Scientific calculator :");
        System.out.println("1. Basic ");
        System.out.println("2. Scientific ");

    }
}
