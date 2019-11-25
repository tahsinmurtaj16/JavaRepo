public class Fan {
    public static final int  SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    String color = "blue";

   Fan()
   {

   }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(final int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn( boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius( double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor( String color) {
        this.color = color;
    }


    public String toString() {
        if(isOn() == true)
        {
            return " the fan speed is "+getSpeed()+" ,color is "+getColor()+" ,and radius is "+getRadius();
        }
        else
        {
            return  "Color is "+getColor()+" ,radius is "+getRadius()+" ,and fan is off";
        }
    }
}

