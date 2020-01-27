package demoreference;

public class Main {

    public static void main(String[] args) {

        /*
        int iNumber = 5;
        int intNumber = 5;
        int iNumbers [];
        int intNumbers [];
         */
        int[] numbers = {1, 2, 3, 4};
        int[] digits = {10, 20, 30, 40};
        System.out.println("numbers[0] is " + numbers[0]);
        System.out.println("digits[0] is " + digits[0]);
        System.out.println("numbers reference is " + numbers);
        System.out.println("digits reference is " + digits);

        numbers = digits;
        System.out.println("numbers reference is " + numbers);
        System.out.println("digits reference is " + digits);
        System.out.println("numbers[0] is " + numbers[0]);
        System.out.println("digits[0] is " + digits[0]);

        numbers[0] = 99;
        System.out.println("numbers[0] is " + numbers[0]);
        System.out.println("digits[0] is " + digits[0]);

    }

}

/*
Data Referencing Homework

1.	Create a project called DemoReference,
2.	Declare two integer arrays
a.	Numbers with the elements 1,2,3,4
b.	Digits with the elements 10,20,30,40
3.	Print out the first element of each array.
4.	Print out the reference stored in numbers and in digits.
5.	Set numbers = digits, then print out numbers and digits.
6.	Print out the first element of each array.
7.	Set the first element of numbers to 99
8.	Print out the first element of each array.

*/