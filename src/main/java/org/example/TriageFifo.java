package org.example;
import java.util.LinkedList;


public class TriageFifo implements ITriage {

    LinkedList<Patient> patientQueue = new LinkedList<>();

    public void addNewPatient(Patient p){
        patientQueue.add(p);
    }

    public Patient getNextPatient(){
        return patientQueue.removeFirst();
    }
}
