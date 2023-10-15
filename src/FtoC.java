import java.util.Scanner;
public class FtoC
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double fernInput;
        double celcInput;
        String trash = "";
        boolean done = false;

        System.out.print("Please enter the temperature in Fahrenheit: ");

        do
        {
            if(in.hasNextDouble())
            {
                fernInput = in.nextDouble();
                in.nextLine();
                celcInput = ((fernInput - 32) * 5/9);
                System.out.println("Your Fahrenheit temperature is " + fernInput + " degrees. That converted to Celsius is " + celcInput + " degrees.");
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.print("You entered " + trash + " Please enter a valid Fahrenheit input: ");
            }
        }while (!done);
    }
}