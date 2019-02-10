import java.text.DecimalFormat;

public class DisplayResult {
    public String displayResult(double dispResult, int mode){
        String returnResult ="";
        DecimalFormat df2= new DecimalFormat(".###");

        switch (mode){
            case 0:
                returnResult = Long.toBinaryString(Double.doubleToLongBits(dispResult));
                break;
            case 1:
                returnResult = Long.toOctalString(Double.doubleToLongBits(dispResult));
                break;
            case 2:
                returnResult = df2.format(dispResult);
                break;
            case 3:
                returnResult = Long.toHexString(Double.doubleToLongBits(dispResult));
                break;
            default:
                returnResult = Long.toBinaryString(Double.doubleToLongBits(dispResult));
                break;
        }
        return returnResult;
    }
}
