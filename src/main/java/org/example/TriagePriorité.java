package org.example;

import java.util.List;

import java.util.LinkedList;

public class TriagePriorité implements ITriage {

    LinkedList<Patient> patientQueue = new LinkedList<>();
    public void addNewPatient(Patient patient){
        if(patient.getGravity()> 5){
            patientQueue.addFirst(patient);
            return;
        }
        patientQueue.add(patient);
    }

    public Patient getNextPatient(){
        return patientQueue.removeFirst();
    }

    @Override
    public List<Patient> getPatientQueue() {
        return List.of();
    }
}
