package za.ac.cput.mydavids.projectone;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static float floatingPoint(){
        return 1.2f;
    }

    public static int integers(){
        return 700;
    }

    public static Object objectEquality(){
        App objectOne = new App();
        return objectOne;
    }

    public static Object objectIdentity(){
        App objectTwo = new App();
        return objectTwo;
    }

    public static boolean truth(){
        return true;
    }

    public static boolean isFalse(){
        return false;
    }

    public static Object isNull(){
        App nullObj = new App();
        return nullObj;
    }

    public static Object nonNull(){
        App nonNullObj = new App();
        return nonNullObj;
    }

    public static String[] arraysContent(){
        String[] a = {"Justin", "Michael"};
        return a;

}
}


