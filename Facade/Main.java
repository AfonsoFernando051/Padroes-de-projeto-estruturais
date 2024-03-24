package Facade;

public class Main {
    public static void main(String[] args) {
        AudioFacade audioFacade = new AudioFacade();

        // Iniciar a reprodução de música
        audioFacade.playMusic();

        // Ajustar o volume
        audioFacade.adjustVolume(50);

        // Parar a reprodução de música
        audioFacade.stopMusic();
    }
}

