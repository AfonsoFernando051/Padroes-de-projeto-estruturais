package Composite;
import java.util.ArrayList;
import java.util.List;

class ContainerElement implements HTMLComponent {
    private List<HTMLComponent> children = new ArrayList<>();

    public void add(HTMLComponent component) {
        children.add(component);
    }

    public void remove(HTMLComponent component) {
        children.remove(component);
    }

    public void draw() {
        for (HTMLComponent component : children) {
            component.draw();
        }
    }
}