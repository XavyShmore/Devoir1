package org.example;

public class CommunityCenter {

    ITriage triageInfirmièreAlgo;

    public CommunityCenter(TriageType triageType) {
        if (triageType == TriageType.GRAVITY) {
            triageInfirmièreAlgo = new TriagePriorité();
        }

        triageInfirmièreAlgo = new TriageFifo();
    }

    public void triagePatient(String name, int gravity, VisibleSymptom symptom) {
        if(symptom == VisibleSymptom.CORONAVIRUS) return;

        Patient patient = new Patient(name, gravity, symptom);

        triageInfirmièreAlgo.addNewPatient(patient);
    }
}
