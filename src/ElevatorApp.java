public class ElevatorApp {
    public static void main(String[] args) {
        Person person1 = new Person(0,55);
        Person person2 = new Person(1,65);
        Person person3 = new Person(2,222);
        Person person4 = new Person(3,155);
        Person person5 = new Person(3,125);

        Elevator elevator = new Elevator();
        elevator.add(person1);
        elevator.add(person2);
        elevator.add(person3);
        elevator.add(person4);
        elevator.add(person5);
        elevator.start();


    }
}
