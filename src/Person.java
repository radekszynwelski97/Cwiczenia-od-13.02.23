public class Person {
    private int id ; // identyfikator osoby
    private int weight; // waga osoby

    public Person(int id, int weight) {
        this.id = id;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
