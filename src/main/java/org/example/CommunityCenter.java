package org.example;

public class CommunityCenter {

    ITriage triageInfirmièreAlgo;

    public CommunityCenter(TriageType triageType) {
        if (triageType == TriageType.GRAVITY) {
            triageInfirmièreAlgo = new TriagePriorité();
        }

        triageInfirmièreAlgo = new TriageFifo();
    }

    public void triagePatient(String name, int gravity) {
        Patient patient = new Patient(name, gravity, VisibleSymptom.NONE);

        triageInfirmièreAlgo.addNewPatient(patient);
    }
}
