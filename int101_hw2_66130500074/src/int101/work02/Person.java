package int101.work02;

import int101.work01.Utilitor;

public class Person {
    private static int nextId = 1;
    private final int id;
    private String firstname;
    private String lastname;

    public Person(String firstname, String lastname) {
        this.firstname = Utilitor.testString(firstname);
        this.lastname = Utilitor.testString(lastname);
        id = nextId++;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = Utilitor.testString(firstname);
    }

    public void setLastname(String lastname) {
        this.lastname = Utilitor.testString(lastname);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Person(");
        stringBuilder.append(id);
        stringBuilder.append("," + firstname);
        stringBuilder.append("," + lastname);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this != obj) return false;
        return true;
    }
}