public class ScientificCalculator {

    double trigResult;

    ScientificCalculator() {
        trigResult = 0.0;
    }

    public double trigMethods(int type, double angleInDegree) {

        switch (type) {
            case 1:

                trigResult = Math.sin(Math.toRadians(angleInDegree));
                break;
            case 2:

                trigResult = Math.cos(Math.toRadians(angleInDegree));
                break;
            case 3:
                trigResult = Math.tan(Math.toRadians(angleInDegree));
                break;
            case 4:
                trigResult = Math.asin(Math.toRadians(angleInDegree));
                break;

            case 5:
                trigResult = Math.acos(Math.toRadians(angleInDegree));
                break;
            case 6:
                trigResult = Math.atan(Math.toRadians(angleInDegree));
                break;
            default:
                trigResult = 0.0;
        }
        return trigResult;
    }


}
