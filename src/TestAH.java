import java.util.Scanner;
public class TestAH {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Property type House:(Input the rent per month for 12 months: ");
        double[] h = new double[12];
        double sum = 0;
        for (int i =0;i<h.length;i++)
        {
            h[i] = inp.nextDouble();
            sum += h[i];
        }
        Property p = new House1(5,"House",sum,"Kualalumpur","1524");
        System.out.println("Property type Apartment:(Input the rent per month for 12 months: ");
        double[] h1 = new double[12];
        double sum1 = 0;
        for (int i =0;i<h.length;i++)
        {
            h1[i] = inp.nextDouble();
            sum1 += h1[i];
        }
        Property p1 = new House1(3,"Apartment",sum1,"Kualalumpur","1000");

        System.out.println(p.toString());
        System.out.println(p1.toString());

    }
}
