package org.example;

import java.util.List;

public class Clinic {
    
    private ITriage doctorTriageAlgo;
    private ITriage radiologyTriageAlgo;
    
    public Clinic(TriageType doctorTriage, TriageType radiologyTriage) {
        if(doctorTriage == TriageType.FIFO){
            doctorTriageAlgo = new TriageFifo();
        } else if (doctorTriage == TriageType.GRAVITY) {
            doctorTriageAlgo = new TriagePriorité();
        }

        if(radiologyTriage == TriageType.FIFO){
            radiologyTriageAlgo = new TriageFifo();
        }else if (radiologyTriage == TriageType.GRAVITY) {
            radiologyTriageAlgo = new TriagePriorité();
        }
    }

    public void triagePatient(String name, int gravity, VisibleSymptom visibleSymptom) {
        if(visibleSymptom == VisibleSymptom.CORONAVIRUS) return;

        Patient patient = new Patient(name, gravity, visibleSymptom);

        doctorTriageAlgo.addNewPatient(patient);

        if(visibleSymptom == VisibleSymptom.BROKEN_BONE || VisibleSymptom.SPRAIN == visibleSymptom){
            radiologyTriageAlgo.addNewPatient(patient);
        }
    }

    public List<Patient> getDoctorQueue() {
        return doctorTriageAlgo.getPatientQueue();
    }

    public List<Patient> getRadiologyQueue() {
        return radiologyTriageAlgo.getPatientQueue();
    }
}
