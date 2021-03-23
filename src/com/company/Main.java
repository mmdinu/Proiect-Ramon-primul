package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

       // Ex. 0

        System.out.println("Hello World");
        System.out.println("Este OK");
        System.out.println("12+3=15 corect!");

        System.out.println("Gata exercitiul 0 ");

        //if we write numbers we don't have to write " or '!
        System.out.println("if we write numbers we don't have to write \" or '!");

        System.out.println(546);

        // Ex. 1 - how we use variables!

        int a = 2;
        int b = 5;
        int suma;

        suma = a + b;

        System.out.println("suma este:" + suma);

        System.out.println("Gata exercitiul 1");

        // Ex. 2

        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        System.out.println( myNum * myFloatNum );
        System.out.println("char myLetter este:  " + myLetter);
        System.out.println("Adevarat sau nu?, iata rezultatul:  " + myBool);
        System.out.println("Textul meu este:  " + myText);

        System.out.println("Gata cu exertitiul 2");


        // Ex. 3

        // creating string by java string literal

        String s1 = "java";

        // char...

        char ch[] = {'s', 't', 'r', 'i', 'n', 'g', 's'};

        // creating java string array to string

        String s2 = new String(ch);

        // creating java string by new keyword

        String s3 = new String("exemple");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("Am modificat codul");




    }
}
