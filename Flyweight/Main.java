package Flyweight;

public class Main {
    public static void main(String[] args) {
        Tree tree1 = new TreeImpl(0, 0, "pine", "pine_texture", "green");
        Tree tree2 = new TreeImpl(10, 20, "oak", "oak_texture", "brown");

        tree1.render(0, 0);
        tree2.render(10, 20);
    }
}

