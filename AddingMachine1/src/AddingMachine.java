import java.util.Scanner;

public class AddingMachine
{
    public static void main( String[] args )
    {
        Scanner adderScanner = new Scanner(System.in);
        System.out.println( "Enter the first number:" );
        int x = adderScanner.nextInt();
        System.out.println( "Enter the second number:" );
        int y = adderScanner.nextInt();
        int result = add(x, y);
        System.out.println( "Your result is: " + result );
        adderScanner.close();
    }

    public static int add( int x, int y )
    {
        return x + y;
    }
}