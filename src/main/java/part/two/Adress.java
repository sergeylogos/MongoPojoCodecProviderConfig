package part.two;

public class Adress {

    private String city;
    private String street;
    private int number;


    public Adress(String city, String street, int number) {
        this.city = city;
        this.street = street;
        this.number = number;
    }

    public Adress() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Adress)) return false;

        Adress adress = (Adress) o;

        if (getNumber() != adress.getNumber()) return false;
        if (!getCity().equals(adress.getCity())) return false;
        return getStreet().equals(adress.getStreet());
    }

    @Override
    public int hashCode() {
        int result = getCity().hashCode();
        result = 31 * result + getStreet().hashCode();
        result = 31 * result + getNumber();
        return result;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    @Override
    public String toString() {
        return "Adress{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", number=" + number +
                '}';
    }
}
