package itmo.lesson2;

public class Triangle {

    double w; //ширина основания треугольника
    double h; //высота треугольника
    public Triangle(double w, double h){
        this.w = w;
        this.h = h;
    }
    public double area(){
        return w * h/2;
    }
}
