package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        StringBuffer buffer = new StringBuffer();
        int digit;
        while(number>0){
            digit = number%10;
            buffer.append(digit);
            number /= 10;
        }
        System.out.println(buffer.toString());
    }

}
