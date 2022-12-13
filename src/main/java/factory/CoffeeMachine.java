package factory;

public class CoffeeMachine {

    private final CoffeeFactory coffeeFactory;


    public CoffeeMachine(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee chooseCoffee(CoffeeType type) {
        Coffee coffee = coffeeFactory.createCoffee(type);
        coffee.makeCoffee();
        coffee.pourCoffee();

        System.out.println("Кофе готов");
        return coffee;
    }
}
