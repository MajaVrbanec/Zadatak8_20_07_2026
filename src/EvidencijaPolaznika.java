import java.util.*;

public class EvidencijaPolaznika {

//  private static Map<String, Polaznik> primjer1 = new HashMap<>();
    private static Map<String, Polaznik> primjer1 = new TreeMap<>();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int unos = 0;
        do {
            System.out.println("Odaberite opciju: \n1. Unesite polaznika: \n2. Ispis svih polaznika: \n3. Izlaz iz programa.");
            unos = input.nextInt();
            input.nextLine();

            switch (unos) {
                case 1:
                    System.out.println("1. Unesite polaznika: ");
                    System.out.println("Unesite ime polaznika: ");
                    String unesenoIme =  input.nextLine();
                    System.out.println("Unesite prezime polaznika: ");
                    String prezimePolaznika =  input.nextLine();
                    System.out.println("Unesite e-mail polaznika: ");
                    String emailPolaznika =  input.nextLine();

                    Polaznik noviPolaznik = new Polaznik(unesenoIme, prezimePolaznika, emailPolaznika);
                    if (primjer1.containsKey(emailPolaznika)) {
                        System.out.println("Polaznik s tom e-mail adresom već postoji, polaznik nije dodan!");
                    } else {
                        primjer1.put(emailPolaznika, noviPolaznik);
                        System.out.println("Polaznik je uspješno dodan!");
                    }
                    break;
                case 2:
                    System.out.println("2. Ispis svih polaznika: ");
                    for (Polaznik p : primjer1.values()) {
                        System.out.println(p.toString());
                    }
                    break;
                case 3:
                    System.out.println("3. Izlaz iz programa.");
                    break;
                default:
                    System.out.println("Pogrešan odabir!");
            }

        } while (unos != 3);

    }

}