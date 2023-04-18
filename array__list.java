import java.util.*;

class arr_list
{
    private int[] arr;        
    //public int array_size=0;

    public arr_list(int initialsize)
    {
        arr=new int[initialsize];
    }

    public void set(int num,int index)
    {
        arr[index]=num;
    }

    public int get(int index)
    {
        if(arr[index]!=0)
        {
            return(arr[index]);
        }
        else
        {
            return(-1);
        }
    }

    void display()
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("index "+i+1+"  "+ arr[i]);
        }
    }
}

public class array__list
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("\n\nArray list data type\n\n");
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();

        System.out.println("Enter the size of the array: ");

        arr_list arr;
        arr = new arr_list(size);

        int user_choice=sc.nextInt();

        while (user_choice!=0)
        {
        //System.out.print("\033[H\033[2J");
        //System.out.flush();
        System.out.println("Array List Data type");
        System.out.println("1 -> to set data");
        System.out.println("2 -> to display data");
        System.out.println("3 -> to display array");
        System.out.println("0 -> to exit program");
        //System.out.print("4 -> to insert data\n");
        System.out.print("Enter the choice:");

        user_choice=sc.nextInt();

        switch (user_choice)
        {
        case 1:
            System.out.println("Enter the index: ");
            int index=sc.nextInt();
            if(index<0||index>=size)
            {
                System.out.println("Incorrect index!!!.");
                break;
            }
            System.out.println("Enter the data to be inserted at index "+index+": ");
            int data=sc.nextInt();

            arr.set(data, index);
            System.out.println("Inserted data: "+data+" at index "+index+": ");
            break;

        case 2:

            System.out.println("Enter the index: ");
            index=sc.nextInt();
            
            if(index<0||index>=size)
            {
                System.out.println("Incorrect index!!!.");
                break;
            }

            System.out.println("Data: at index "+index+" is:"+arr.get(index));
            break;

        case 3:
            
            System.out.println("The Array is");
            arr.display();
            break;

        case 0:
            System.out.print("\033[H\033[2J");
            System.out.flush(); 
            System.out.println("\n\nExiting program.\n\n");
            break;

        default:
            System.out.println("Inavlid Input.");
            break;
        }
        }
    }
}