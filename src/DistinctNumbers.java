import java.util.ArrayList;
import java.util.Scanner;
public class DistinctNumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter number and enter 0 to ends it : ");
        int value;
        do
        {
             value = inp.nextInt();
            if(!list.contains(value) && value != 0)
            {
                list.add(value);
            }
        } while (value != 0 );

        for(int i = 0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

    }
}
