package com.knoldus;

public class ProductMain {
    public static void main(String[] args){
      long leftBorder = 5;
      long rightBorder =15;
      ProductionOfNumbers productionOfNumbers = new ProductionOfNumbers();
      long product = productionOfNumbers.getRange(leftBorder,rightBorder);
        System.out.println("Result is " +product);
    }
}
