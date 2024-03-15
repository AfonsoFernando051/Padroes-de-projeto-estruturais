package Bridge;

class DrawingAPI2 implements DrawingAPI {
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("API2 desenha o círculo de centro (%.2f, %.2f) com raio %.2f%n", x, y, radius);
    }
}

