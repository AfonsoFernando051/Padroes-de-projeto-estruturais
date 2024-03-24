package Flyweight;

public class TreeType {
    private final String name;
    private final String texture;
    private final String color;

    public TreeType(String name, String texture, String color) {
        this.name = name;
        this.texture = texture;
        this.color = color;
    }

    public void render(int x, int y) {
        System.out.println("Rendering " + name + " tree at (" + x + "," + y + ") with texture " + texture + " and color " + color);
    }
}
