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
        assertEquals(job2.getEmployer().getValue(), "ACME");
        assertEquals(job2.getLocation().getValue(), "Desert");
        assertEquals(job2.getPositionType().getValue(), "Quality control");
        assertEquals(job2.getCoreCompetency().getValue(), "Persistence");

    }
@Test

   public void testJobsForEquality(){
    Job job3 = new Job("TA", new Employer("LaunchCode"), new Location("Philadelphia"), new PositionType("Teachers Assistant"),new CoreCompetency("Awesome"));
    Job job4 = new Job("TA", new Employer("LaunchCode"), new Location("Philadelphia"), new PositionType("Teachers Assistant"), new CoreCompetency("Awesome"));

    assertFalse(job3.equals(job4));



//    assertNotEquals(job, job1);

}
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String job = job5.toString();
        assertEquals(job.charAt(0), '\n');
        assertEquals(job.charAt(job.length()-1), '\n');

    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String job = job5.toString();
        String expected = "\nID: " + job5.getId() + "\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n";
       assertEquals(job, expected);


    }
    @Test
    public void testToStringHandlesEmptyField(){
        Job emptyJob = new Job();
        emptyJob.setName("IceCream tester");
        assertEquals("\n" +
                "ID: " + emptyJob.getId() + '\n' +
                "Name: IceCream tester\n" +
                "Employer: Data not available\n" +
                "Location: Data not available\n" +
                "Position Type: Data not available\n" +
                "Core Competency: Data not available" +
                "\n", emptyJob.toString());

    }


}









