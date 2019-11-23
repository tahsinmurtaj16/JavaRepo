interface Edi
{
   String howToEat();
}
public class TestEdible{
    public static void main(String[] args) {
        Object[] objects = {new Tiger(),new Chicken(),new Apple(),new Orange()};
        for(int i = 0 ;i<objects.length;i++)
        {
            if(objects[i] instanceof Edi)
            {
                System.out.println(((Edi)objects[i]).howToEat());
            }
            if (objects[i] instanceof Animal)
            {
                System.out.println(((Animal)objects[i]).sound());
            }
        }
    }
}
abstract class Animal{
   public abstract String sound();
}
class Tiger extends Animal{
    @Override
    public String sound(){
        return "Tiger: Roarrr";
    }
}
class Chicken extends Animal implements Edi{
    @Override
    public String howToEat(){
        return "Chicken:Fry it";
    }
    @Override
    public String sound(){
        return "Chicken:Cock-doodle-doo";
    }
}
abstract class Fruit implements Edi{

}
class Apple implements Edi{
    @Override
    public String howToEat(){
        return "Apple:Make a cider";
    }
}
class Orange implements Edi{
    @Override
    public String howToEat() {
        return  " Orange:Make Orange Juice.";
    }
}