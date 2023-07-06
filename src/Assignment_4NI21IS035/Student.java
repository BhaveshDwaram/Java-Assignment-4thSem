package Assignment_4NI21IS035;

public class Student {
   private String USN;
   private String name;

   //Student constructor helps us to initialize the objects
   public Student(String USN,String name)
   {
      this.setName(name);
      this.setUSN(USN);
   }
   //helps to display the objectvalues
   public String getUSN()
   {

      return this.USN;
   }
   public String setUSN(String USN)
   {
      this.USN=USN;
        return null;
   }
   //helps to display the objectvalues
   public  String getName()
   {

      return this.name;
   }
   public  void setName(String name)
   {
     this.name=name;
   }
}



