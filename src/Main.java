public class Main
{
    public static void main(String[] args)
    {
        //1
        for (int i = 0; i <= 30; i++)
        {
            System.out.println(i);
        }
        //2
        for (int i = 30; i >= 0; i--)
        {
            System.out.println(i);
        }
        //3
        for (int i = 0; i <= 18; i+=3)
        {
            System.out.println(i);
        }
        //4
        for (int i = 10; i >= 0; i-=2)
        {
            System.out.println(i);
        }
        //5
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //6
        for (int i = 5; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //7
        for (int i = 5; i >= 1; i--)
        {
            for (int j = 1; j <= 5; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //Extra Credit, My first inital is the letter A.
        int size = 7;
        for (int i = 0; i < size; i++)
        {
           for (int j = 0; j < size - i; j++)
           {
               System.out.print("*");
           }
           for (int j =0; j < 2 * i + 1; j++)
           {
               if (i == size / 2) {
                   System.out.print("*");
               } else if (j == 0 || j == 2 * i) {
                   System.out.print("*");
               } else {
                   System.out.print(" ");
               }
           }
           System.out.println();
        }
    }
}