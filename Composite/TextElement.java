package Composite;

class TextElement implements HTMLComponent {
    private String text;

    public TextElement(String text) {
        this.text = text;
    }

    public void draw() {
        System.out.println(text);
    }
}
