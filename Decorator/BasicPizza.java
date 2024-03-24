package Decorator;

public class BasicPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Pizza básica";
    }

    @Override
    public double cost() {
        return 5.0; // Preço base da pizza básica
    }
}
