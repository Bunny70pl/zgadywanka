import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //,git init ,git config user.name user.email,git add . ,git commit -m "",git remote add origin ,git push -u master
        System.out.println("hello world");
        System.out.println("Witaj na lekcji");

        int WylosowanaLiczba = (int)(Math.random()*10+1);//rzutowanie
        System.out.println(WylosowanaLiczba);
        /*
        typy proste z malych liter maja tylko wartosc
        logiczny = boolean
        calkowite -byte,short, int,long
        rzeczywiste - float, double
        znakowy - char

        złożone typu zawsze z duzej

        obikety ktore maja wlasnosci i metody
         */
        System.out.println("Zgadnij liczbe z zakresu 1-10: ");
        Scanner Klawiatura = new Scanner(System.in);
        int WpisanaLiczba = Klawiatura.nextInt();//wczytywanie z klawiatury liczby calkowitej
        System.out.println("Wpisana liczba: "+WpisanaLiczba);
    }
}