package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    // change this to:?? double check
    // public class Job extends JobField {
    //public Job(String value) {super(value);}

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;


    public int getId() {
        return id;
    }

    public Job () {
       id = nextId;
        nextId++;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;

   }
   @Override
    public String toString() {


       String output = "\nID: " + this.getId() + "\n";
       if (this.name == null || this.name.equals("")){
       output += "Name: Data not available\n";
       }else{
           output += "Name: " + this.name + '\n';
       }

       if (this.employer == null || this.employer.getValue().equals("")){
       output += "Employer: Data not available\n";
       }else{
           output += "Employer: " + getEmployer().getValue() + "\n";
       }
       if (this.location == null || this.location.getValue().equals("")){
       output += "Location: Data not available\n";
       }else{
           output += "Location: " + getLocation().getValue() + "\n";
       }
       if (this.positionType == null || this.positionType.getValue().equals("")){
       output += "Position Type: Data not available\n";
       }else{
           output += "Position Type: " + getPositionType().getValue() + "\n";
       }
       if (this.coreCompetency == null || this.coreCompetency.getValue().equals("")){
       output += "Core Competency: Data not available";
       }else{
           output += "Core Competency: " + getCoreCompetency().getValue();

       }




        output += "\n";
        return output;

   }

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
