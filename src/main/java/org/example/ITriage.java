package org.example;
import java.util.List;

public interface ITriage {
    public void addNewPatient(Patient p);
    public Patient getNextPatient();
    public List<Patient> getPatientQueue();
}
