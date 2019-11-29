public class MyInteger {
    private int value;

    public static void main(String[] args) {
        MyInteger v1= new MyInteger(23);
        System.out.println(v1.isEven());
        System.out.println(v1.isOdd());
        System.out.println(v1.isPrime());
        System.out.println(v1.equals(v1.value));
        System.out.println(v1.equals(v1));
        System.out.println(MyInteger.parseInt(new char[] {'1','2','3'}));
        System.out.println(MyInteger.parseInt("123"));

    }

    public MyInteger(int mValue)
    {
        value = mValue;
    }
    public int getValue()
    {
        return value;
    }
    public  boolean isEven(){
        return (this.value % 2 == 0);
    }
    public boolean isPrime(){
        return (this.value % 2 != 0 && this.value % 3 !=  0);
    }
    public boolean isOdd()
    {
        return (this.value % 2 != 0);
    }
    public static boolean isEven(int Mvalue)
    {
        return (Mvalue % 2 == 0);
    }
    public static boolean isPrime(int value1){
        return (value1 % 3 != 0 && value1 % 2 != 0 );
    }
    public static boolean isOdd(int value2)
    {
        return (value2 % 2 != 0);
    }
    public static boolean isEven(MyInteger v){
        return v.isEven();
    }
    public static boolean iOdd(MyInteger v){
        return v.isEven();
    }
    public static boolean isPrime(MyInteger v){
        return v.isPrime();
    }
    public boolean equals(int v)
    {
        return this.value == v;
    }
    public boolean equals(MyInteger v){
        return this.value == v.getValue() ;

    }
    public static int parseInt(char[] values)
    {
        int s = 0;
     for(char i: values){
         s += Character.getNumericValue(i);
     }
     return s;
    }
    public static int parseInt(String pValue){

        return  Integer.parseInt(pValue);
    }


}
