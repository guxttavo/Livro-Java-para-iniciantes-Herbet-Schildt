public class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        //todos os membros de Triangle estão disponíveis para objetos Triangle,
        //mesmo os herdados do TwoDShape
        t1.setWidth(3.0);
        t1.setHeight(2.1);
        t1.style = "filled";

        t2.setWidth(2);
        t2.setHeight(2);
        t2.style = "outlined";

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());

        //OBS: Ainda que TwoDShape seja a superclasse de Triangle, ela também é uma
        //classe autônoma totalmente independente. Ser a superclasse de uma subclasse não significa
        //que não pode ser usada separadamente.


    }
}
