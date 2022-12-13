package factory;

public abstract class Coffee{

    abstract void makeCoffee();

    public void pourCoffee(){
        System.out.println("Наливаем кофе...");
    }

}
