package fr.epita.datamodels;

public class Facilities {
    //instance
    private int facid;
    private String name;
    private String membercost;
    private double guestcost;
    private double initialoutlay;
    private double monthlymaintenance;
    //creating constructor
    public Facilities(int facid, String name, int membercost, double guestcost, double initialoutlay, double monthlymaintenance) {
        this.facid = facid;
        this.name = name;
        this.membercost = String.valueOf(membercost);
        this.guestcost = guestcost;
        this.initialoutlay = initialoutlay;
        this.monthlymaintenance = monthlymaintenance;
    }
//use of getter and setter
    public int getFacid() {
        return facid;
    }

    public void setFacid(int facid) {
        this.facid = facid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMembercost() {
        return membercost;
    }

    public void setMembercost(String membercost) {
        this.membercost = membercost;
    }

    public double getGuestcost() {
        return guestcost;
    }

    public void setGuestcost(double guestcost) {
        this.guestcost = guestcost;
    }

    public double getInitialoutlay() {
        return initialoutlay;
    }

    public void setInitialoutlay(double initialoutlay) {
        this.initialoutlay = initialoutlay;
    }

    public double getMonthlymaintenance() {
        return monthlymaintenance;
    }

    public void setMonthlymaintenance(double monthlymaintenance) {
        this.monthlymaintenance = monthlymaintenance;
    }
    //if we dont use to string we are geeting this output fr.epita.datamodels.Facilities@22927a81
    //due to non usage of to string() we need to use tostring() to print the details entered.
  @Override
    public String toString() {
       return "Facilities{" +
              "facid=" + facid +
               ", name='" + name + '\'' +
                ", membercost='" + membercost + '\'' +
                ", guestcost=" + guestcost +
                ", initialoutlay=" + initialoutlay +
                ", monthlymaintenance=" + monthlymaintenance +
                '}';
    }
    //after using tostring(), we get this Facilities{facid=1, name='Tennis Court 2', membercost='5', guestcost=25.0, initialoutlay=8000.0, monthlymaintenance=200.0} as output
}

