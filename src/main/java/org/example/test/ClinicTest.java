package org.example.test;

import org.example.Clinic;
import org.example.Patient;
import org.example.TriageType;
import org.example.VisibleSymptom;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ClinicTest {
    private Clinic clinic;

    @Before
    public void setUp() {
        clinic = new Clinic(TriageType.FIFO, TriageType.FIFO);
    }

    @Test
    public void whenPatientTriage_withMigraine_shouldAddToDoctorQueue() {
        clinic.triagePatient("John", 4, VisibleSymptom.MIGRAINE);

        // Check doctor queue has the patient
        List<Patient> doctorQueue = clinic.getDoctorQueue();
        assertEquals("John", doctorQueue.getFirst().getName());
    }

    @Test
    public void whenPatientTriage_withMigraine_shouldNotAddToRadiologyQueue() {
        clinic.triagePatient("John", 4, VisibleSymptom.MIGRAINE);

        List<Patient> radiologyQueue = clinic.getRadiologyQueue();
        assertTrue(radiologyQueue.isEmpty());
    }
}
