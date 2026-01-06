package com.pluralsight.calcengine;

public class MathEquation {
    double leftVal, rightVal, result;
    char opCode;

    private static int numberOfCalculations;
    private static double sumOfResults;

    public MathEquation() {}

    public MathEquation(char opCode) {
        this.opCode = opCode;
    }

    public MathEquation(char opCode, double leftVal, double rightVal) {
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    void execute() {
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal; break;
            case 's':
                result = leftVal - rightVal; break;
            case 'm':
                result = leftVal * rightVal; break;
            case 'd':
                result = leftVal / rightVal; break;
            default:
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0d;
                break;
        }

        numberOfCalculations++;
        sumOfResults += result;
    }

    public void execute(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;

        execute();
    }

    public static double getAverageResult() {
        return sumOfResults / numberOfCalculations;
    }

    public double getLeftVal() {
        return leftVal;
    }

    public void setLeftVal(double leftVal) {
        this.leftVal =  leftVal;
    }

    public double getRightVal() {
        return rightVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal =  rightVal;
    }

    public String getResult() {
        return String.valueOf(result);
    }
}
