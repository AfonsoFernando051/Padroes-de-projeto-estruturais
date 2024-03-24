package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static final Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String texture, String color) {
        TreeType treeType = treeTypes.get(name);
        if (treeType == null) {
            treeType = new TreeType(name, texture, color);
            treeTypes.put(name, treeType);
        }
        return treeType;
    }
}
