package FacadeLayer;

public class Telivision {
    public void switchOn(){
        System.out.println("Tv On");
    }
    public void switchOff(){
        System.out.println("Tv Off");
    }
}

class SoundSystem{
    public void soundOn(){
        System.out.println("Sound system on");
    }
    public void soundOff(){
        System.out.println("Sound system off");
    }
}

class RoomLight{
    public void lightOn(){
        System.out.println("light on");
    }
    public void lightOff(){
        System.out.println("Bright light off");
        System.out.println("Deem light on");
    }
}

class HomeThreaterFacad{
    Telivision tv;
    SoundSystem sound;
    RoomLight rl;

    public HomeThreaterFacad(Telivision tv, SoundSystem sound, RoomLight rl) {
        this.tv = tv;
        this.sound = sound;
        this.rl = rl;
    }

    public void watchMovie(){
        tv.switchOn();
        sound.soundOn();
        rl.lightOff();
    }
    public void stopwatching(){
        tv.switchOff();;
        sound.soundOff();
        rl.lightOn();
    }
}

class Main{
    public static void main(String[] args) {
        RoomLight rm =new RoomLight();
        SoundSystem sound = new SoundSystem();
        Telivision tv = new Telivision();
        HomeThreaterFacad homeThreater = new HomeThreaterFacad(tv,sound,rm);
        homeThreater.watchMovie();
        homeThreater.stopwatching();
    }
}