package org.example;

public class Patient {
    String name;
    int gravity;
    VisibleSymptom symptom;

    public Patient(String name, int gravity, VisibleSymptom symptom) {
        this.name = name;
        this.gravity = gravity;
        this.symptom = symptom;
    }

    int getGravity(){
        return gravity;
    }
}
