package Assignment_4NI21IS035;
import java.util.Scanner;

    public  class Main {
        static UGStudent[] obj_ug = new UGStudent[100];//creating array of objects for class UGStudent
        static PGStudent[] obj_pg = new PGStudent[100];//creating array of objects for class PGStudent
        static Scanner input = new Scanner(System.in);
        public static void main(String[] args) {

            while(true) {
                System.out.println("Select appropriate option : ");
                System.out.println("1.Enter UG student data\n2.Enter PG student data\n3.Display UG student data" +
                        "\n4.Display PG student data\n5.Exit");
                int select = input.nextInt();
                switch (select) {
                    case 1:
                        UGStudent_Data();
                        break;
                    case 2:
                        PGStudent_Data();
                        break;
                    case 3:
                        UGStudent_Data_Display();
                        break;
                    case 4:
                        PGStudent_Data_Display();
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Enter valid number ");
                        break;
                }
            }
        }
                //ug_student method helps to collect the data for UGStudent objects
        static void UGStudent_Data() {
            System.out.println("Enter no.of UG students : ");
            String Usn,name,branch;
            int sem;
            int size = input.nextInt();
            for (int i = 0; i < size; i++) {
                Scanner input=new Scanner(System.in);
                System.out.println("Enter the UG student "+(i+1)+" details");
                System.out.print("Enter the UG student name ");
                name=input.nextLine();
                System.out.println("Enter the UG student usn");
                Usn=input.nextLine();
                System.out.println("Enter the UG student branch");
                branch=input.nextLine();
                System.out.println("Enter the UG student semester");
                sem=input.nextInt();
                //UG Student ith object values are initialized using UGconstructor
                obj_ug[i] = new UGStudent(Usn, name, sem, branch);
            }
        }
        //pg_student method helps to collect the data for PGStudent objects
        static void PGStudent_Data() {
            System.out.println("Enter no.of PG students : ");
            String Usn,name,specialization,ug_degree;
            int size = input.nextInt();
            for (int i = 0; i < size; i++) {
                Scanner input=new Scanner(System.in);
                System.out.println("Enter the PG student "+(i+1)+" details");
                System.out.print("Enter the PG student name ");
                name=input.nextLine();
                System.out.println("Enter the PG student usn");
                Usn=input.nextLine();
                System.out.println("Enter the PG student Specialization");
                specialization=input.nextLine();
                System.out.println("Enter the PG student UG degree");
                ug_degree=input.nextLine();
                //PG Student ith object values are initialized using PGconstructor
                obj_pg[i] = new PGStudent(Usn, name, specialization, ug_degree);
            }

        }
        //helps to display data of UGStudent objects
        static void UGStudent_Data_Display()
        {
            for(int i=0;obj_ug[i]!=null;i++)
            {
                System.out.println("Displaying the data of UG student "+(i+1));
                System.out.println("UG Student name is : "+obj_ug[i].getName());
                System.out.println("UG Student usn is : "+obj_ug[i].getUSN());
                System.out.println("UG Student branch is : "+obj_ug[i].getBranch());
                System.out.println("UG Student semester is :" +obj_ug[i].getSemester());
                System.out.println("\n");
            }
        }

        //helps to display data of PGStudent objects
        static void PGStudent_Data_Display()
        {
            for(int i=0;obj_pg[i]!=null;i++)
            {
                System.out.println("Displaying the data of PG student "+(i+1));
                System.out.println("PG Student name is : "+obj_pg[i].getName());
                System.out.println("PG Student usn is : "+obj_pg[i].getUSN());
                System.out.println("PG Student specialization is : "+obj_pg[i].getSpecialization());
                System.out.println("PG Student ugdegree  is : "+obj_pg[i].getUGDegree());
                System.out.println("\n");
            }
        }

    }
