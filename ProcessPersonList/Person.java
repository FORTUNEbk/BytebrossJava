package ProcessPersonList;

class Person {
    String name;
    String id;
    String gender;
    String county;

    Person(String name, String id, String gender, String county) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.county = county;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', id='" + id + "', gender='" + gender + "', county='" + county + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return name.equals(person.name) || id.equals(person.id);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + id.hashCode();
    }
}
