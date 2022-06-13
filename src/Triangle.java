//subclasse de TwoDShape para triângulos
public class Triangle extends TwoDShape {

    String style;

    //cada construtor vai inicializar o seu objeto referente
    Triangle(String s, double w, double h) {
        setWidth(w);
        setHeight(h);

        style = s;
    }

    public Triangle() {
    }

    double area() {
        return getWidth(2) * getHeight(2) / 2;
    }

    void showStyle() {
        System.out.println("Triangle is" + style);
    }

}
