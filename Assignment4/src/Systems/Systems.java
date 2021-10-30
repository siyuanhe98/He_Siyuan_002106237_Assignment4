/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Systems;

import data.PatientDirectory;
import data.PersonDirectory;
import model.Community;
import model.Encounter;
import model.House;
import model.Person;
import model.VitalSigns;

/**
 *
 * @author Siyuan He
 */
public class Systems {

    private PersonDirectory personDirectory;
    private PatientDirectory patientDirectory;

    public Systems() {
        personDirectory = new PersonDirectory();
//        Person p1 = new Person(1,"Siyuan He",22,new House("Landmark"),new Community("Fenway"));
//        p1.getEncounterHistory().addEncounter(new Encounter(new VitalSigns(120,80)));
//        p1.getEncounterHistory().addEncounter(new Encounter(new VitalSigns(121,81)));
//        p1.getEncounterHistory().addEncounter(new Encounter(new VitalSigns(122,82)));
//        personDirectory.createPerson(p1);
//        Person p2 = new Person(2,"Mandy",27,new House("Queensberry"),new Community("Fenway"));
//        p1.getEncounterHistory().addEncounter(new Encounter(new VitalSigns(130,90)));
//        p1.getEncounterHistory().addEncounter(new Encounter(new VitalSigns(131,91)));
//        p1.getEncounterHistory().addEncounter(new Encounter(new VitalSigns(132,92)));
//        personDirectory.createPerson(p2);
//        Person p3 = new Person(3,"JiaJia",23,new House("Greenhouse"),new Community("Fenway"));
//        p1.getEncounterHistory().addEncounter(new Encounter(new VitalSigns(110,70)));
//        p1.getEncounterHistory().addEncounter(new Encounter(new VitalSigns(111,71)));
//        p1.getEncounterHistory().addEncounter(new Encounter(new VitalSigns(112,72)));
//        personDirectory.createPerson(p3);
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public PatientDirectory updatePatientDirectory() {
        patientDirectory = new PatientDirectory();
        for(Person p : personDirectory.getPersons()){
            int lastData = p.getEncounterHistory().getHistory().size() - 1;
            int highPressure = p.getEncounterHistory().getHistory().get(lastData).getBloodPressure().getHighPressure();
            int lowPressure = p.getEncounterHistory().getHistory().get(lastData).getBloodPressure().getLowPressure();
            if(highPressure > 140 || highPressure < 90 || lowPressure > 90 || lowPressure < 60){
                patientDirectory.add(p);
            }
        }
        return patientDirectory;
    }

    public void setPersonDirectory(PersonDirectory peresonDirectory) {
        this.personDirectory = peresonDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

}
