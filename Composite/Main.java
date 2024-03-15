package Composite;

public class Main {
    public static void main(String[] args) {
        ContainerElement form = new ContainerElement();
        form.add(new TextElement("<form>"));
        ContainerElement fieldset = new ContainerElement();
        fieldset.add(new TextElement("<fieldset>"));
        fieldset.add(new TextElement("<legend>Personal Info</legend>"));
        fieldset.add(new TextElement("<input type=\"text\" name=\"name\">"));
        fieldset.add(new TextElement("<input type=\"text\" name=\"email\">"));
        form.add(fieldset);
        form.add(new TextElement("</form>"));

        form.draw();
    }
}
