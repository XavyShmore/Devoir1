package org.example.test;

import org.example.ITriage;
import org.example.TriageFifo;
import org.example.TriagePriorité;
import org.junit.Before;

public class ITriageTest {
    private ITriage triageFifo;
    private ITriage triagePriorité;

    @Before
    public void setUp() {
        triageFifo = new TriageFifo();
        triagePriorité = new TriagePriorité();
    }
}
