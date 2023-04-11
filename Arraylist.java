package Lab_cs102;
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        boolean s = true;
       Scanner sc = new Scanner(System.in);

        while (s) {
            int i = sc.nextInt();
           if(array.get(i) == 0){
               break;
           }

            array.add(i);
        }
        array.add(1);
        array.add(22);
        array.add(433);
    System.out.println(array);
    }
}
