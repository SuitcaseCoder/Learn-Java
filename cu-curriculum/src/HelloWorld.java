// // "hello world class created
public class HelloWorld {

    // // program that outputs 'hello world' to the console
    public static void main (String[] args) {
        // // actually prints it out to the system in a new line
        // // an 'out' folder gets created
        System.out.println("hello, World!");

        /* Exercises */
        // // 1.
        int myFavoriteNumber = 18;
        System.out.println(myFavoriteNumber);

        // // 2.
        String myString = "The Lumineers is still one of my favorite bands";
        System.out.println(myString);

        // // 5. - 9
        long myNumber = 123L;
        System.out.println(myNumber);

        float myOtherNumber = 3.14f;
        // // adding the f to the end of the number says to read it as a float (?)
        System.out.println(myOtherNumber);

        // // 10.
        int x = 5;
        System.out.println(x++); // 5
        System.out.println(x); // 6

        int y = 5;
        System.out.println(++y); // 6
        System.out.println(y); // 6

        // // 12.
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        int three = (int) "three";

        //
        int z = 4;
//        z = z + 5;

        z += 5;
        System.out.println(z);

    }
}
