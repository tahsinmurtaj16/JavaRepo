public class CastingDemo {
    public static void main(String[] args)
    {
        Object object1 = new CircleFromSimpleGeometricObject(1);
        Object object2 = new RectangleFromSimpleGeometricObject(1,1);

        displayObject(object1);
        displayObject(object2);
    }
    public static void displayObject(Object o)
    {
        if(o instanceof CircleFromSimpleGeometricObject)
        {
            System.out.println("The Area of the Circle is "+((CircleFromSimpleGeometricObject) o).getArea());
            System.out.println("The diameter of the Circle is "+((CircleFromSimpleGeometricObject) o).getDiameter());
        }
        else if(o instanceof RectangleFromSimpleGeometricObject)
        {
            System.out.println("The Area of the Rectangle is "+((RectangleFromSimpleGeometricObject) o).getArea());
        }
    }
}
