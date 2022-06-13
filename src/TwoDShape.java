//classe para objetos de duas dimensões
public class TwoDShape {

    private double width;
    private double height;

    //Construtor padrão
    public TwoDShape() {
        width = height = 0.0;
    }

    //Construtor parametrizado
    public TwoDShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //Constrói o objeto com altura e largura iguais
    TwoDShape(double x) {
        width = height = x;
    }


    public double getWidth(double width) {
        return width;
    }

    public TwoDShape setWidth(double width) {
        this.width = width;
        return this;
    }

    public double getHeight(double height) {
        return height;
    }

    public TwoDShape setHeight(double height) {
        this.height = height;
        return this;
    }

    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }
}
