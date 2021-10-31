package model;

import data.EncounterHistory;

/**
 * @author Siyuan He
 * @create 2021-10-28 13:02
 */
public class Patient extends Person {
    public Patient() {

    }

    public Patient(String name, int age, House house, Community community) {
        super(name, age, house,community);
    }
}
