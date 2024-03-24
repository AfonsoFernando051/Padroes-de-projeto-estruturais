package Decorator;

public class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", com queijo";
    }

    @Override
    public double cost() {
        return pizza.cost() + 1.0; // custo adicional para o queijo
    }
}
