package com.mycompany.app;

/**
 * Hello 10 july 7.32pm world!
 *
 */
public class App 
{
    public static void main( String args[])
    {
        System.out.println( "Hello World! 5.32pm 12 july" );

        System.out.println("A NullPointerException is a drag...");
        Object myObject = null;
        /**
         * Checker prevents this from compiling...
         */
//        System.out.println("myObject: " + myObject.toString());
        /**
         * ... which is simply fantastic. It shows:
         *
         * error: [dereference.of.nullable] dereference of possibly-null
         * reference myObject
         *
         * http://checkerframework.org
         */
        System.out.println("... but thankfully, Checker has our back: http://checkerframework.org");
    }
}
