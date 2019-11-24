public class text {
    public static void main(String[] args) {
        Person[] persons = {new Person(3), new Person(4), new Person(1),new Person(2)};
        java.util.Arrays.sort(persons);
        for (Person p:persons
             ) {
            System.out.print(p+" ");
        }
    }
}

class Person implements Comparable<Person>{
    private int id;

    Person(int id) {
        this.id = id;
    }
    @Override
    public int compareTo(Person o)
    {
        if(id > o.id)
            return 1;
        else if (id < o.id)
            return -1;
        else
            return 0;
    }
    public String toString()
    {
        return "ID: "+this.id;
    }
}
