package be.intecbrussel.hoofdstuk8.constructors;

public class ConstructorsRectangleApp
{
    public static void main(String[] args)
    {
        ConstructorsRectangle r1 = new ConstructorsRectangle();
        ConstructorsRectangle r2 = new ConstructorsRectangle(6, 12);
        ConstructorsRectangle r3 = new ConstructorsRectangle(7.14, 8.4);
        System.out.println("H is " + r1.getHeight() + " and W is " + r1.getWidth());
        System.out.println("H is " + r2.getHeight() + " and W is " + r2.getWidth());
        System.out.println("H is " + r3.getHeight() + " and W is " + r3.getWidth());
    }
}
