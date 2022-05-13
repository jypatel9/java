class Mobile {
    public void switchon() {
        System.out.println("Mobile Switch on.");
    }

    public void switchoff() {
        System.out.println("Mobile Switch off.");
    }
}

interface IMobilecamera {
    void camerastart();

    void camerazoom();
}

interface Imusicplayer {
    void startmusicplayer();

    void volume();

    void stopmusicplayer();
}

class smartphone extends Mobile implements IMobilecamera, Imusicplayer {
    public void video() {
        System.out.println("Videography start your phone.");
    }

    public void camerastart() {
        System.out.println("Camera start.");
    }

    public void camerazoom() {
        System.out.println("Camera zoom.");
    }

    public void startmusicplayer() {
        System.out.println("Musci player start.");
    }

    public void volume() {
        System.out.println("Volume increase of decrese.");
    }

    public void stopmusicplayer() {
        System.out.println("Stop music player.");
    }
}

public class two {
    public static void main(String args[]) {
        smartphone s = new smartphone();
        Mobilecamera m;
        musicplayer musicp;
        m = new smartphone();
        m.camerastart();
        m.camerazoom();
        musicp = new smartphone();
        musicp.startmusicplayer();
        musicp.volume();
        musicp.stopmusicplayer();
    }
}
