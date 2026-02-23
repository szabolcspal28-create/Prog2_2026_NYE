class Auto {
    String marka;
    String modell;
    int evjarat;

    public Auto(String marka, String modell, int evjarat) {
        this.marka = marka;
        this.modell = modell;
        this.evjarat = evjarat;
    }

    public void displayInfo() {
        System.out.println("Márka: " + marka + ", Modell: " + modell + ", Évjárat: " + evjarat);
    }

    public void startEngine() {
        System.out.println("Az autó indul!");
    }

    public void stopEngine() {
        System.out.println("Az autó megáll!");
    }
}

class Diak {
    String nev;
    double[] osztalyzatok;

    public Diak(String nev, double[] osztalyzatok) {
        this.nev = nev;
        this.osztalyzatok = osztalyzatok;
    }

    public double calculateAverage() {
        double osszeg = 0;
        for (int i = 0; i < osztalyzatok.length; i++) {
            osszeg += osztalyzatok[i];
        }
        return osszeg / osztalyzatok.length;
    }
}

public class Feladatok_02_2026_02_23 {
    public static void main(String[] args) {
        Auto kocsija = new Auto("Opel", "Astra", 2010);
        kocsija.displayInfo();
        kocsija.startEngine();
        kocsija.stopEngine();

        System.out.println("--------------------");

        double[] jegyek = {5, 4, 5, 3};
        Diak tanulo = new Diak("Kiss János", jegyek);
        System.out.println(tanulo.nev + " átlaga: " + tanulo.calculateAverage());
    }
}