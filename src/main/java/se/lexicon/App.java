package se.lexicon;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(HelperClass.generateRandomNumber());
        StaticInstanceDemo instanceDemo = new StaticInstanceDemo("Mehrdad", "Javan"); // 1001
        instanceDemo.showInformation();

        StaticInstanceDemo instanceDemo2 = new StaticInstanceDemo("Test", "Test"); // 1002
        instanceDemo2.showInformation();
    }
}
