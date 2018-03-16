package part.two;

public class Person {
    private String name;
    private Adress adress;

    public Person(String name, Adress adress) {
        this.name = name;
        this.adress = adress;
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (!getName().equals(person.getName())) return false;
        return getAdress().equals(person.getAdress());
    }

//    @Override
//    public int hashCode() {
//        int result = getName().hashCode();
//        result = 31 * result + getAdress().hashCode();
//        return result;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", adress=" + adress +
                '}';
    }
}
