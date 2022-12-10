package fr.epita.datamodels;


public class Members {
    private int memid;
    private String surname;
    private String firstname;
    private String address;
    private String zipcode;
    private String telephone;
    private int recommendedby;
    private String joindate;
    //creating constructor
    public Members(int memid, String surname, String firstname, String address, String zipcode, String telephone, int recommendedby, String joindate) {
        this.memid = memid;
        this.surname = surname;
        this.firstname = firstname;
        this.address = address;
        this.zipcode = zipcode;
        this.telephone = telephone;
        this.recommendedby = recommendedby;
        this.joindate = joindate;
    }
    //use of getter and setter
    public int getMemid() {
        return memid;
    }
    public void setMemid(int memid) {
        this.memid = memid;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getZipcode() {
        return zipcode;
    }
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public int getRecommendedby() {
        return recommendedby;
    }
    public void setRecommendedby(int recommendedby) {
        this.recommendedby = recommendedby;
    }
    public String getJoindate() {
        return joindate;
    }
    public void setJoindate(String joindate) {
        this.joindate = joindate;
    }
    @Override
    //converting into tostring()
    public String toString() {
        return "Members{" +
                "memid=" + memid +
                ", surname='" + surname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", address='" + address + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", telephone='" + telephone + '\'' +
                ", recommendedby=" + recommendedby +
                ", joindate='" + joindate + '\'' +
                '}';
    }
}

