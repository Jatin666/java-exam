package fr.epita.tests;
//Have a look to the sql file “base.sql”, it contains definitions and data about 2 tables “MEMBERS” and
//“FACILITIES”.
//- Prepare 2 java classes (datamodel) to represent the data structures.
//- Initialize 1 instance of each class with hardcoded values, then display them in the console.
//This code should be put in the class TestMVD2

import fr.epita.datamodels.Facilities;
import fr.epita.datamodels.Members;

public class TestMVD2 {
    public static void main(String[] args) throws Exception {
        //getting the info from member, facilities.java

        Members members = new Members(1, "Smith", "Darren", "8 Bloomsbury Close, Boston", "4321", "555-555-5555", 1, "2012-07-02 12:02:05");
        Facilities facilities = new Facilities(1, "Tennis Court 2", 5, 25, 8000, 200);
        System.out.println(members.toString());//printing members to string as mentioned in members.java
        System.out.println(facilities.toString());//printing facilities
    }
}
