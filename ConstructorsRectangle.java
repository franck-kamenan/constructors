package be.intecbrussel.hoofdstuk8.constructors;

public class ConstructorsRectangle
{
    private int height;
    private int width;

    public ConstructorsRectangle()
    {
        this(5, 5);
    }
    public ConstructorsRectangle(int heightP, int widthP)
    {
        setHeight(heightP);
        setWidth(widthP);
    }
    public ConstructorsRectangle(double heightP, double widthP)
    {
        this.setHeight((int) heightP);
        this.setWidth((int) widthP);
    }

     public int getHeight()
    {
        return height;
    }
    public void setHeight(int heightP)
    {
        this.height = heightP;
    }
    public int getWidth()
    {
        return width;
    }
    public void setWidth(int widthP)
    {
        this.width = widthP;
    }
}
