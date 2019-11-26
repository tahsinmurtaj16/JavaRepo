/*You can invoke super.clone() when implementing the clone() methodif the class does not implement
 java.lang.Cloneable, as shown below:
 */
/*class Foo {
    int x = 5;
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}             
However, it does not actually clone the object. The following code will throw CloneNotSupportedException.*/
public class cloning {

    public static void main(String[] args) throws CloneNotSupportedException {
        Foo foo = (Foo)new Foo().clone();
        System.out.println(foo.x);
    }
}
 //   If the Foo class implements java.lang.Cloneable as follows, the Test1 class will run fine.
class Foo implements java.lang.Cloneable {
    int x = 5;
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}             