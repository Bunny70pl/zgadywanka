import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //git init, git config user.name user.email,git add ., git commit -m "",git remote add origin link, git push -u master
        System.out.println("hello world");
        System.out.println("Witaj na lekcji");

        int WylosowanaLiczba = (int)(Math.random()*100+1);//rzutowanie
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
        if(WpisanaLiczba == WylosowanaLiczba){
            System.out.println("Trafiona liczba");
        }else{
            System.out.println("Nie trafiono spróboj ponownie");
        }
        String komunikat = WylosowanaLiczba == WpisanaLiczba ? "Poprawnie":"Nie poprawnie";//wyrazenie warunkowe
        System.out.println(komunikat);
        int roznica = WylosowanaLiczba > WpisanaLiczba? WylosowanaLiczba - WpisanaLiczba : WpisanaLiczba - WylosowanaLiczba;
        roznica /= 10;//dzielenie calkowite bo wynik typu int
        switch (roznica){//insturkacja switch
            case 0:
                System.out.println("Brawo");
                break;
            case 1:
                System.out.println("Bardzo blisko");
                break;
            case 2:
                System.out.println("Dość blisko");
                break;
            default:
                System.out.println("lepiej nie proboj");
        }
        //wyrazenie switch
        System.out.println(
                switch (roznica){
                    case 0 -> "brawo";
                    case 1 -> "bardzo blisko";
                    case 2-> "dość blisko";
                    default -> "słabo";
                }
        );
    }
}