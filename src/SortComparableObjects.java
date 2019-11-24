import java.math.*;
public class SortComparableObjects {
    public static void main(String[] args) {
        String[] cities = {"Savannah","Boston","Atlanta","Tampa"};
        java.util.Arrays.sort(cities);
        for(String city:cities)
        {
            System.out.print(city+" ");
        }
        System.out.println();
        BigInteger[] hugeNumbers = {new BigInteger("2323231092923992"),new BigInteger("4322232323222952"),new BigInteger("5462315122861234")};
        java.util.Arrays.sort(hugeNumbers);
        for (BigInteger number:hugeNumbers
             ) {
            System.out.print(number+" ");
        }
    }
}
