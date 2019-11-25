public class Test{
    public static void main(String[] args) {
        int[] array = {1,2,3,8,7,9};
        for(int i = 0;i<array.length-1;i++)
        {
            for(int j = 1;j<array.length;j++)
            {
                int temp;
                if(array[j-1]>array[j])
                {
                    temp = array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                }
            }
        }
        for (int i:array
             ) {
            System.out.print(i+" ");
        }
    }
}