package com.pluralsight.calcengine;

public enum MathOperation {
    ADD('+'),
    SUBTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    private char symbol;
    char getSymbol() {
        return symbol;
    }

    private MathOperation(char symbol) {
        this.symbol = symbol;
    }


}
