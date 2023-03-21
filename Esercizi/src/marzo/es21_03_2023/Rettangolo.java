package marzo.es21_03_2023;

public class Rettangolo {
    public double base, altezza;

    public Rettangolo(double b, double h){
        this.base = b;
        this.altezza = h;
    }

    public double getAltezza() {
        return altezza;
    }

    public double getBase() {
        return base;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getArea(){
        return (this.base * this.altezza);
    }
}
