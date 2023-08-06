package hillel.homework.lesson14.polymorphism;

public class MusicStyles {
    private String bandName;

    public String getBandName() {
        return bandName;
    }

    public MusicStyles(String bandName) {
        this.bandName = bandName;
    }

    public void playMusic() {
    }
}

class PopMusic extends MusicStyles {
    public PopMusic(String bandName) {
        super(bandName);
    }

    public void playMusic() {
        System.out.printf("Band \"%s\" - play pop music\n", getBandName());
    }
}

class RockMusic extends MusicStyles {
    public RockMusic(String bandName) {
        super(bandName);
    }

    public void playMusic() {
        System.out.printf("Band \"%s\" - play rock music\n", getBandName());
    }
}

class ClassicMusic extends MusicStyles {
    public ClassicMusic(String bandName) {
        super(bandName);
    }

    public void playMusic() {
        System.out.printf("Band \"%s\" - play classic music\n", getBandName());
    }
}

class Main {
    public static void main(String[] args) {
        RockMusic linkinPark = new RockMusic("Linkin Park");
        ClassicMusic austria = new ClassicMusic("Austria");
        PopMusic potapINastya = new PopMusic("Potap and Nastya Komenskih");

        MusicStyles[] musicBands = {linkinPark, austria, potapINastya};

        for (MusicStyles band : musicBands) {
            band.playMusic();
        }
    }
}