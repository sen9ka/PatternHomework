package factory;

public class Americano extends Coffee{

    @Override
    void makeCoffee() {
        System.out.println("Готовим американо");
    }
}
