package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        //Question 1:
        double bobSalary , garySalary;
        double highestSalary;
        bobSalary = 40500;
        garySalary = 95500;
        highestSalary = Math.max(bobSalary,garySalary);
        System.out.println("The highest salary is " + highestSalary);
        //Question 2:
        double carPrice , truckPrice , smallest;
        carPrice = 36000;
        truckPrice = 88000;
        smallest = Math.min(carPrice , truckPrice);
        System.out.println("The smallest value is " + smallest);
        //Question 3:
        double radius , area;
        radius = 7.25;
        area = Math.PI * (radius * radius);
        System.out.println("The area of a circle with radius " + radius + "is " + area);
        //Question 4:
        double numberToGetSqrFor , sqr;
        numberToGetSqrFor = 5.0;
        sqr = Math.sqrt(numberToGetSqrFor);
        System.out.println("The square root of " + numberToGetSqrFor + " is " + sqr);
        //Question 5:
        double resultForcircle;
        int x1 ,x2 , y1, y2;
        x1 = 5;
        x2 = 85;
        y1 = 10;
        y2 = 50;
        resultForcircle = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 -y1) * (y2 -y1));
        System.out.println("The distance between (" + x1 +","+ y1 + ") and (" + x2 +","+y2+") is "+ resultForcircle);
        //Question 6:
        double numberToAbsoluteVFor, resultForAV ;
        numberToAbsoluteVFor = -3.8;
        resultForAV = Math.abs(numberToAbsoluteVFor);
        System.out.println("The absolute value of " + numberToAbsoluteVFor +"is " + resultForAV);
        //Question 7:
        double randomNumber;
        randomNumber = Math.random();
        System.out.println("Random number between 0 and 1 is : " + randomNumber);
        //Question 8:
        int hour, dayminutes, Dayes, resultForMinutes, numOfDayesresult;
        hour = 60;
        dayminutes = hour * 24;
        Dayes = 24;
        numOfDayesresult = Dayes * dayminutes;
        System.out.println("The number of minutes in " + Dayes + " is " + numOfDayesresult);








    }
}
