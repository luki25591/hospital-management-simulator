public class HospitalApp {
    public static void main(String[] args) {

        Hospital hospital = new Hospital();
        Person doctor = new Doctor("Jan", "Kowalski", 4500, 1000);
        Person nurse1 = new Nurse("Anna", "Nowak", 3500, 2);
        Person nurse2 = new Nurse("Maria", "Kowalska", 3600, 3);


        hospital.add(doctor);
        hospital.add(nurse1);
        hospital.add(nurse2);


       hospital.getInfo();





    }
}
