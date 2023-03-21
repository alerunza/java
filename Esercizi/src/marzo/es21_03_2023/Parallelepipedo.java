package marzo.es21_03_2023;

public class Parallelepipedo extends Rettangolo{
    public double larghezza;

    public Parallelepipedo(double b, double h, double l) {
        super(b, h);
        this.larghezza = l;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }

    public double getVolume(){
        return (super.getArea() * this.larghezza);
    }
}
