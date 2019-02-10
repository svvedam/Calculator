public class BasicCalc {

    double basicResult;


    public double basicCalc(int type, int num1, int num2){
        switch(type){
            case 1:
                basicResult = num1 + num2;
                break;
            case 2:
                basicResult = num1 - num2;
                break;
            case 3:
                basicResult = num1 * num2;
                break;
            case 4:
                basicResult = num1 / num2;
                break;
            case 5:
                basicResult =  Math.sqrt(num1);
                break;
            case 6:
                basicResult = Math.pow(num1, num2);
                break;
            case 7:
                basicResult = 1 / num1;
                break;
            case 8:
                basicResult = posNeg(num1);
                break;
            default:
                System.out.println("No operation selected");
        }
        return basicResult;
    }

    public double posNeg(double val) {
        double doubleResult;
        if (val < 0) {
            return doubleResult = Math.abs(val);
        } else {
            return doubleResult = -val;
        }
    }
}












