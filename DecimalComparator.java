package com.TimBuchalka;

//Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
//The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
//
//EXAMPLES OF INPUT/OUTPUT:
//* areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.
//* areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places
//* areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.
//* areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double one, double two) {
        if(one < 0 && two < 0) {
            double c = Math.ceil(one * 1000) / 1000;
            double d = Math.ceil(two * 1000) / 1000;
            return c == d;
        } else if(one > 0 && two > 0){
            double c = Math.floor(one * 1000) / 1000;
            double d = Math.floor(two * 1000) / 1000;
            return c == d;
        } else {
             return one == two;
        }
    }
}
