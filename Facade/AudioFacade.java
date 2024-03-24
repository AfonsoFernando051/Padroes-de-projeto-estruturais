package Facade;

// Classe de fachada para o sistema de áudio
class AudioFacade {
    private Amplifier amplifier;
    private CdPlayer cdPlayer;
    private Speakers speakers;

    public AudioFacade() {
        this.amplifier = new Amplifier();
        this.cdPlayer = new CdPlayer();
        this.speakers = new Speakers();
    }

    public void playMusic() {
        amplifier.on();
        cdPlayer.on();
        cdPlayer.play();
        speakers.on();
    }

    public void stopMusic() {
        amplifier.off();
        cdPlayer.off();
        speakers.off();
    }

    public void adjustVolume(int volume) {
        amplifier.setVolume(volume);
    }
}
