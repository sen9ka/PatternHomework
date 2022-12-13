package factory;

public class Main {
    public static void main(String[] args) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();

        CoffeeMachine coffeeMachine = new CoffeeMachine(coffeeFactory);
        coffeeMachine.chooseCoffee(CoffeeType.AMERICANO);
    }
}
