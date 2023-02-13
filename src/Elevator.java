public class Elevator {
    private int peopleNumber = 0;
    private int maxWeight = 400;
    Person[] people = new Person[4];

    void add(Person person) {
        if (peopleNumber < 4) {
            people[peopleNumber] = person;
            peopleNumber++;
        } else
            System.out.println("W windzie nie ma juz miejsca ");
    }

    private int getTotalWeight (){
        int totalWeight = 0;
        if (people[0] != null)
            totalWeight += people[0].getWeight();
        if (people[1] != null)
                totalWeight += people[1].getWeight();
        if (people[2] != null)
                    totalWeight += people[2].getWeight();
        if (people[3] != null)
                        totalWeight += people[3].getWeight();
        return totalWeight;
    }

    private boolean weightIsCorrect(){
        return getTotalWeight() <= maxWeight;

    }

    void start() {
        if (weightIsCorrect()) {
            System.out.println("Winda wystartowała");
        } else {
            int overeload = getTotalWeight() - maxWeight;
            System.out.println("Winda jest przeciążona o " + overeload + "kg");
        }


        }



        }
