package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import javax.xml.namespace.QName;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {


    @Test
    public void testSettingJobId() {

        Job job = new Job();
        Job job1 = new Job();
        assertNotEquals(job, job1);
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job2.getName() instanceof String);
        assertTrue(job2.getEmployer() instanceof Employer);
        assertTrue(job2.getLocation() instanceof Location);
        assertTrue(job2.getPositionType() instanceof PositionType);
        assertTrue(job2.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(job2.getName(), "Product tester");
        assertEquals(job2.getEmployer(), "ACME");
        assertEquals(job2.getLocation(), "Desert");
        assertEquals(job2.getPositionType(), "Quality control");
        assertEquals(job2.getCoreCompetency(), "Persistence");


        }

    }






