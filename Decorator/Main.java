package Decorator;

public class Main {
    public static void main(String[] args) {
        Pizza basicPizza = new BasicPizza();
        basicPizza = new CheeseDecorator(basicPizza); // Adicionando queijo

        System.out.println("Descrição: " + basicPizza.getDescription());
        System.out.println("Custo: $" + basicPizza.cost());
    }
}
