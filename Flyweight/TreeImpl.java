package Flyweight;

public class TreeImpl implements Tree {
    private final int x;
    private final int y;
    private final TreeType treeType;

    public TreeImpl(int x, int y, String type, String texture, String color) {
        this.x = x;
        this.y = y;
        this.treeType = TreeFactory.getTreeType(type, texture, color);
    }

    @Override
    public void render(int x, int y) {
        treeType.render(x, y);
    }
}

