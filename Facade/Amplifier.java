package Facade;

// Classe para o amplificador
class Amplifier {
    void on() {
        System.out.println("Amplificador ligado");
    }

    void off() {
        System.out.println("Amplificador desligado");
    }

    void setVolume(int volume) {
        System.out.println("Volume do amplificador ajustado para " + volume);
    }
}
