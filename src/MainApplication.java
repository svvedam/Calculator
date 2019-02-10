import java.util.Scanner;

public class MainApplication {

    public void basicCalculator(int mode){

            InputOutput ip1 = new InputOutput();
            DisplayResult dp1 = new DisplayResult();
            BasicCalc bc1 = new BasicCalc();

            ip1.displayBasicCalcMessage();
            int basicOperation = ip1.scanOneInteger();

            int [] myArray = new int[2];
            if ((basicOperation ==1)||(basicOperation ==2)||(basicOperation ==3)||(basicOperation ==4)||(basicOperation ==6)){
                myArray = ip1.scanTwoIntegers();
            }
            else if ((basicOperation ==5)||(basicOperation ==7)||(basicOperation ==8)){
                myArray[0] = ip1.scanOneInteger();
                myArray[1] = 0;
            }
            double endResult = bc1.basicCalc(basicOperation, myArray[0], myArray[1]);
            System.out.println("Basic Calc Output is : " + dp1.displayResult(endResult,mode));
    }

    public void scientificCalculator(int mode){

            InputOutput ip2 = new InputOutput();
            DisplayResult dp2 = new DisplayResult();

            ip2.displayTrigMessage();
            int trigType = ip2.scanOneInteger();

            ScientificCalculator mainApp = new ScientificCalculator();


            System.out.println("Enter the angle in degrees : ");
            double value = ip2.scanOneDouble();

            double result = mainApp.trigMethods(trigType, value);

            System.out.println("Trigonometry Output is : " + dp2.displayResult(result,mode));


    }
    public static void main(String []args){

        //Declare all the instances of classes
        InputOutput ip= new InputOutput();
        MainApplication mainApplication= new MainApplication();

        ip.displayInitialMessage();
        int dispMode = ip.scanOneInteger();

        ip.basicVSscientificMessage();
        int calculatorType = ip.scanOneInteger();

        if (calculatorType==1){
            mainApplication.basicCalculator(dispMode);
        }
        else if(calculatorType==2){
            mainApplication.scientificCalculator(dispMode);
        }
    }


}
