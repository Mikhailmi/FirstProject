package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(calc(5, 7));
        System.out.println("Круто!");
    }

    static int calc(int a, int b){
      return a+b;
    }
}
