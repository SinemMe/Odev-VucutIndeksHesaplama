import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int VucutIndeks;
        double Indeks, metre = 1.72, Kilo = 105;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        metre = inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz :");
        Kilo = inp.nextDouble();

        double IndeksFormül = Kilo / (metre * metre);
        System.out.print(IndeksFormül);
    }
}
