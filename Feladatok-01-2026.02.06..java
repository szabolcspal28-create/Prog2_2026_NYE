import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner beolvaso = new Scanner(System.in);

        System.out.println("1. Feladat: Hőmérséklet");
        System.out.print("Kérlek, add meg az aktuális hőmérsékletet: ");
        int homerseklet = beolvaso.nextInt();

        if (homerseklet < 0) {
            System.out.println("Fagypont alatti");
        } else if (homerseklet < 30) {
            System.out.println("Átlagos");
        } else {
            System.out.println("Túl meleg");
        }
        System.out.println();

        System.out.println("2. Feladat: Villámlás távolsága");
        int masodperc = -1;

        while (masodperc < 0) {
            System.out.print("Hány másodperccel a villámlás után hallottad a dörgést? ");
            masodperc = beolvaso.nextInt();
            
            if (masodperc < 0) {
                System.out.println("Hiba! Az idő nem lehet negatív. Próbáld újra!");
            }
        }

        int tavolsag = masodperc * 300;
        System.out.println("A villámlás " + tavolsag + " méterre történt tőled.");
        System.out.println();

        System.out.println("3. Feladat: Torta rajzolása");
        int eletkor = 0;

        while (eletkor < 1 || eletkor > 20) {
            System.out.print("Hány éves vagy? (1-20 között): ");
            eletkor = beolvaso.nextInt();
            
            if (eletkor < 1 || eletkor > 20) {
                System.out.println("Hiba! Kérlek 1 és 20 közötti számot adj meg!");
            }
        }

        System.out.println();

        for (int i = 0; i < eletkor; i++) {
            System.out.print("* ");
        }
        System.out.println();

        for (int i = 0; i < eletkor; i++) {
            System.out.print("| ");
        }
        System.out.println();

        for (int i = 0; i < (eletkor * 2 - 1); i++) {
            System.out.print("-");
        }
        System.out.println();

        beolvaso.close();
    }
}