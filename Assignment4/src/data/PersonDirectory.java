package data;

import model.House;
import model.Person;

import java.util.ArrayList;
import model.Community;
import model.Encounter;
import model.VitalSigns;

/**
 * @author Siyuan He
 * @create 2021-10-28 13:17
 */
public class PersonDirectory {
    private ArrayList<Person> persons;

    public PersonDirectory() {
        persons = new ArrayList<>();
        
    }

    public void createPerson(Person person) {
        persons.add(person);
    }

    public boolean deletePerson(int id) {
        for (Person i : persons) {
            if (id == i.getId()) {
                persons.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean updatePerson(int id, String name, int age, House house) {
        for (int i = 0; i < persons.size(); i++) {
            if (id == persons.get(i).getId()){
                Person p = persons.get(i);
                p.setAge(age);
                p.setHouse(house);
                p.setName(name);
                return true;
            }
        }
        return false;
    }

    public Person RetrievePerson(int id){
        for (Person i:persons){
            if(id == i.getId()){
                return i;
            }
        }
        return null;
    }
    public Person RetrievePersonbyName(String name){
        for (Person i:persons){
            if(i.getName().equalsIgnoreCase(name)){
                return i;
            }
        }
        return null;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }
}
