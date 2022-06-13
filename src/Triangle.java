//subclasse de TwoDShape para triângulos
public class Triangle extends TwoDShape {

    private String style;

    //Construtor padrão
    Triangle() {
        super();
        style = "none";
    }

    //super() é responsável por executar o construtor de TwoSShape
    //Triangle não é mais responsável por inicializar width e height, só precisa
    //inicializar o valor que é exclusivo dela(style).
    public Triangle(double width, double height, String style) {
        super(width, height);
        this.style = style;
    }

    //Construtor com um argumento
    Triangle(double x) {
        super(x);

        style = "none";
    }

    double area() {
        return getWidth(2) * getHeight(2) / 2;
    }

    void showStyle() {
        System.out.println("Triangle is" + style);
    }

}
