import java.util.Objects;

public class Polaznik {
    private String ime;
    private String prezime;
    private String email;

    // konstruktor
    public Polaznik(String ime, String prezime, String email) {
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
    }

    // setter
    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // getter
    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getEmail() {
        return email;
    }

    // toString metoda
    @Override
    public String toString() {
        return "Polaznik: " + ime + ", " + prezime + ", " + email;
    }

    // metoda equals()
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Polaznik polaznik = (Polaznik) o;
        return Objects.equals(email, polaznik.email);
    }

    // metoda hashCode()
    @Override
    public int hashCode() {
        return Objects.hashCode(email);
    }


}