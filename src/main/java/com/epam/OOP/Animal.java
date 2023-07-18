package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    //Dog class using default getDescription() method from the parent class Animal
    // This happens due to inheritance

    // Bird class use overriden version of getDescription() method of the Animal and added extra value of the String
    // This happens due to inheritance

    public String getDescription(){
        StringBuffer buffer = new StringBuffer("This animal is mostly ");
        buffer.append(color);
        buffer.append(". It has ");
        buffer.append(numberOfPaws);
        buffer.append(numberOfPaws > 1 ? " paws" : " paw");
        buffer.append(" and ");
        buffer.append(hasFur == true ? "a" : "no");
        buffer.append(" fur.");
        return buffer.toString();
    }
}
