package model;

import data.EncounterHistory;

/**
 * @author Siyuan He
 * @create 2021-10-28 13:04
 */
public class Person {

    private EncounterHistory encounterHistory = new EncounterHistory();
    private String name;
    private int age;
    private House house;
    private Community community;
    private int id;
    private static int count = 1;

    public Person(String name, int age, House house, Community community) {
        id = count++;
        this.name = name;
        this.age = age;
        this.house = house;
        this.community = community;
//        encounterHistory = new EncounterHistory();

    }

    public Person() {
        id = count++;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    @Override
    public String toString() {
        return "Person{" + "encounterHistory=" + encounterHistory + ", name=" + name + ", id=" + id + ", age=" + age + ", house=" + house + ", community=" + community + '}';
    }

}
