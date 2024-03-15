package Adapter;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe AdapteeImpl
        Adaptee adaptee = new AdapteeImpl();

        // Criando um adaptador para a interface Target
        Target adapter = new Adapter(adaptee);

        // Usando o método request() da interface Target
        adapter.request();
    }
}
