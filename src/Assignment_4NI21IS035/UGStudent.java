package Assignment_4NI21IS035;

public class UGStudent extends Student {
    private  int semester;
    private String branch;

    //UGStudent constructor helps us to initialize the objects
    public UGStudent(String USN,String name,int semester,String branch)
    {
        //super key word helps to access  the constructor of super class student
        super(USN,name);
        this.setSemester(semester);
        this.setBranch(branch);
    }

    //helps to display the objectvalues
    public int getSemester() {

        return this.semester;
    }

    public void setSemester(int semester) {
        this.semester=semester;

    }
    //helps to display the objectvalues
    public  String getBranch()
    {

        return this.branch;
    }
    public void setBranch(String branch)
    {

        this.branch=branch;
    }
}
