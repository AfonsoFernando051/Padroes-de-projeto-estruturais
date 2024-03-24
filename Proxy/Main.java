package Proxy;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto RealImage
        Image realImage = new RealImage("big_image.jpg");

        // Exibindo a imagem (será carregada do disco)
        realImage.display();

        // Usando um ProxyImage para controlar o acesso à imagem
        Image proxyImage = new ProxyImage("small_image.jpg");

        // A imagem ainda não foi carregada do disco
        proxyImage.display();

        // A imagem será carregada do disco agora
        proxyImage.display();
    }
}

