
public class Hospital {
    public static final int MAX_PERSON = 3;
    int number = 0;
    Person[] persons = new Person[MAX_PERSON];

    public void add(Person person) {
        if (number < MAX_PERSON) {
            persons[number] = person;
            number++;
        } else {
            System.out.println("Brak miejsca w tablicy. MAX 3 osoby.");
        }
    }



    public String getInfo(){
        String result = "";
        for (int i = 0; i < number; i++) {
            result = result + persons[i].getInfo() + "\n";
        }
        return result;
    }

}





