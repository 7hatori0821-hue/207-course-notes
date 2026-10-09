public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double w, double h){
        this.width = w;
        this.height = h;
    }

    public double area(){
        return width * height;
    }

    /**
     * scales the rectangle
     * @param factor the scaling factor
     */
    public void scale(double factor) {
      width *= factor;
      height *= factor;
    }

    public boolean isLargerThan(Rectangle other){
            return (area() > other.area());
    }
}
