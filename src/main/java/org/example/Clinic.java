package org.example;

public class Clinic {
    
    private ITriage doctorTriageAlgo;
    private ITriage radiologyTriageAlgo;
    
    public Clinic(TriageType doctorTriage, TriageType radiologyTriage) {
        if(doctorTriage == TriageType.FIFO){
            doctorTriageAlgo = new TriageFifo();
        }

        if(radiologyTriage == TriageType.FIFO){
            radiologyTriageAlgo = new TriageFifo();
        }
    }

    public void triagePatient(String name, int gravity, VisibleSymptom visibleSymptom) {
        Patient patient = new Patient(name, gravity, visibleSymptom);

        doctorTriageAlgo.addNewPatient(patient);

        if(visibleSymptom == VisibleSymptom.BROKEN_BONE || VisibleSymptom.SPRAIN == visibleSymptom){
            radiologyTriageAlgo.addNewPatient(patient);
        }


    }

    // D'autres méthodes peuvent être nécessaires

}
