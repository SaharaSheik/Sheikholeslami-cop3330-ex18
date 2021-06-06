package base;

/*

 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sahar Sheikholeslami

 */

/*
Exercise 18 - Temperature Converter
You’ll often need to determine which part of a program is run based on user input or other events.

Create a program that converts temperatures from Fahrenheit to Celsius or from Celsius to Fahrenheit.
Prompt for the starting temperature. The program should prompt for the type of conversion and
then perform the conversion.

The formulas are

C = (F − 32) × 5 / 9
and

F = (C × 9 / 5) + 32
Example Output
Press C to convert from Fahrenheit to Celsius.
Press F to convert from Celsius to Fahrenheit.
Your choice: C
Please enter the temperature in Fahrenheit: 32
The temperature in Celsius is 0.

Constraints
Ensure that you allow upper or lowercase values for C and F.
Use as few output statements as possible and avoid repeating output strings.
Challenges
1- Revise the program to ensure that inputs are entered as numeric values.
Don’t allow the user to proceed if the value entered is not numeric.
2- Break the program into functions that perform the computations.
3- Implement this program as a GUI program that automatically updates the values when any value changes.
4- Modify the program so it also supports the Kelvin scale.

 */


import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String s1, s2;
        int conversion=0;
        int temperature;

        System.out.print("Press C to convert from Fahrenheit to Celsius."+ "\n" + "Press F to convert from Celsius to Fahrenheit.\n");
        String temp = input.nextLine();

        temp=temp.toUpperCase();

        System.out.println("Your choice: "+ temp);

        if(temp.equals("C")){

            s1= "Fahrenheit";
            s2 = "Celsius";
            System.out.print("Please enter the temperature in "+ s1 + ": ");

            temperature = Integer.parseInt(input.nextLine());

             conversion = (int) (5.0 / 9)*(temperature-32);

        }else{

            s1 = "Celsius";
            s2= "Fahrenheit";
            System.out.print("Please enter the temperature in "+ s1 + " : ");

            temperature = Integer.parseInt(input.nextLine());

            conversion = (int) (temperature * (9.0 / 5)) + 32;

        }


        System.out.print("The temperature in " + s2 + " is " + conversion + ".");







    }


}


