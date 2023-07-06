package Assignment_4NI21IS035;

public class PGStudent extends Student{
    private String specialization;

    //UG degree attribute cant be changed by the program
    // its value is always equal to BE;
    private final String UGDegree="B.E.";

    public PGStudent(String USN,String name,String specialization,String UGDegree)
    {
        //super key word helps to access  the constructor of super class student
        super(USN,name);
      this.setSpecialization(specialization);
      this.setUGDegree(UGDegree);
    }

    //helps to display the objectvalues
    public  String getSpecialization()
    {

        return this.specialization;
    }
    public void setSpecialization(String specialization)
    {

        this.specialization=specialization;
    }
    //helps to display the objectvalues
    public  String getUGDegree()
    {

        return this.UGDegree;
    }
    public void setUGDegree(String UGDegree)
    {
        //UGDegree is immutable hence function dont have body

    }
}
