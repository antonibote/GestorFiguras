
public class Rectangle extends Figura{
    private double l1;
    private double l2;
    public Rectangle(double l1, double l2){
        this.l1 = l1;
        this.l2 = l2;
    }
    public double area() {return this.l1 * this.l2;}


    public int compareTo(Figura figura) {return super.compareTo(figura);}
}
