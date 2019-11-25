public class StackOfIntegers
{
    public int[] elements;
    private int size;

    public StackOfIntegers()
    {

        this(16);
    }
    public StackOfIntegers(int capacity)

    {
        elements = new int[capacity];
    }
    public void  push(int value)
    {
      if(size >= elements.length)
      {
          int[] temp = new int[elements.length * 2];
         System.arraycopy(elements,0,temp,0,elements.length);
          elements = temp;
      }
      elements[size] = value;
      ++size;

    }
    public int pop()
    {
        return elements[--size];
    }
    public int peek()
    {
        return elements[size-1];
    }
    public boolean empty()
    {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}