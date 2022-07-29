import java.util.Scanner;

public class tutorialFirst3
{
    public static void main(String args[])
    {
        int postivecount=0, negativecount=0, zeroscount=0, i;
        int arr[] = new int[10];
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 10 Numbers : ");
        for(i=0; i<10; i++)
        {
            arr[i] = scan.nextInt();
        }
        for(i=0; i<10; i++)
        {
            if(arr[i] < 0)
            {
                negativecount++;
            }
            else if(arr[i] == 0)
            {
                zeroscount++;
            }
            else
            {
                postivecount++;
            }
        }

        System.out.print( "Numbers of positives are " + postivecount);
        System.out.print("\n" + "Numbers of negatives are " +  negativecount);
        System.out.print("\n" +  "Number of zeros are " + zeroscount);
    }
}