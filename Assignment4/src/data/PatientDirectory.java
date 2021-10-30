package data;

import model.Patient;

import java.util.ArrayList;
import model.Person;

/**
 * @author Siyuan He
 * @create 2021-10-28 13:16
 */
public class PatientDirectory {

    private ArrayList<Person> patients = new ArrayList<>();

    public PatientDirectory() {
        patients = new ArrayList<>();
    }

    public void add(Person person) {
        patients.add(person);
    }

    public ArrayList<Person> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Person> patients) {
        this.patients = patients;
    }

}
