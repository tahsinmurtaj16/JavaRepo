public class TestTickte {
    public static void main(String[] args) {
        Ticket[] t = {new Walkup(),new Advance(10),new Advance(5),new StudentAdvance(10,1817537),new StudentAdvance(5,1818018)};
        for(int i = 0;i < t.length;i++)
        {
            disp(t[i]);
        }
    }

    public static void disp(Ticket o)
    {
        System.out.println(o.toString());
    }
}
