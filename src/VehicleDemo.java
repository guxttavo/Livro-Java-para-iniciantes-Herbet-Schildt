public class VehicleDemo {

    public static void main(String[] args) {

        //minivan é uma instância da classe Vehicle, portanto, tem realidade "física"
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        //Tanto car1 quanto car2 referenciam ao mesmo objeto,
        //a atrinuição de de car1 a car2 simplesmente faz car2 referenciar o mesmo objeto que car1.
        Vehicle car1 = new Vehicle();
        Vehicle car2 = car1;


        int range1, range2;

        //o operador ponto vincula o nome de um objeto ao nome de um membro, podendo ser usado para acessar
        //variáveis de intância ou métodos.
        minivan.passengers = 6;
        minivan.fuelcap = 1;
        minivan.mpg = 22;

        sportscar.passengers = 2;
        sportscar.fuelcap = 3;
        sportscar.mpg = 12;

        range1 = minivan.fuelcap * minivan.mpg;
        range2 = minivan.fuelcap * minivan.mpg;

        System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range1);

        System.out.println("Minivan can carry " + sportscar.passengers + " with a range of " + range2);

    }
}