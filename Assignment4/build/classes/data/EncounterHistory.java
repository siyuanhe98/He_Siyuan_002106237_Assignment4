package data;

import model.Encounter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Siyuan He
 * @create 2021-10-28 12:50
 */
public class EncounterHistory {

    private ArrayList<Encounter> history = new ArrayList<Encounter>();
    private ArrayList<String> list;
    
    public EncounterHistory() {
        history = new ArrayList<Encounter>();
        list = new ArrayList<>();
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    public void addEncounter(Encounter encounter) {
        history.add(encounter);
    }

    public ArrayList<Encounter> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Encounter> history) {
        this.history = history;
    }

    @Override
    public String toString() {
        return "EncounterHistory{" + "history=" + history + ", list=" + list + '}';
    }


}
