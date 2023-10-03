package work04;

public class Person {
    private int id;

    public Person(int id) {
        setId(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("Person(%d)", id);
    }
}
