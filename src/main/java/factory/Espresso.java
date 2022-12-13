package factory;

public class Espresso extends Coffee{
    @Override
    void makeCoffee() {
        System.out.println("Готовим эспрессо");
    }
}
