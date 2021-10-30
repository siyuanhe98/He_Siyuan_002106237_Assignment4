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
