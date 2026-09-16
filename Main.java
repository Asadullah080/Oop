class Student {

    String Name;
    String ID;
    String Section;
    String Degree;
    int Semester;
    double CGPA;
    String Fee_Status;
    String Email;

    public void Attend_class(){
        System.out.println("A student can attend class");
    }

    public void drop_course(){
        System.out.println("A student can drop a course");
    }

    public void Add_course(){
        System.out.println("A student can Add a course");
    }

    public void Pay_Fees(){
        System.out.println("A student can pay Fee");
    }

    public void Result(){
        System.out.println("A student can view Result");
    }



    public void display(){

        System.out.println("----------------------------------");
        System.out.println("Name       : "+ Name);
        System.out.println("ID         : "+ ID);
        System.out.println("Section    : "+ Section);
        System.out.println("Degree     : "+ Degree);
        System.out.println("Semester   : "+ Semester);
        System.out.println("CGPA       : "+ CGPA);
        System.out.println("Fee Status : "+ Fee_Status);
        System.out.println("Email      : "+ Email);

    }

    public static void main(String[] args) {

        Student s1= new Student();
        s1.Name= "M.Asadullah";
        s1.ID= "FA25-BSE-080";
        s1.Section= "B";
        s1.Degree= "Bachelors of Software Engineering";
        s1.Semester= 3;
        s1.CGPA= 3.2;
        s1.Fee_Status= "Paid";
        s1.Email= "asadullah123@gmail.com";

        Student s2= new Student();
        s2.Name= "Ali";
        s2.ID= "FA25-BCS-030";
        s2.Section= "A";
        s2.Degree= "Bachelors of Computer Science";
        s2.Semester= 2;
        s2.CGPA= 2.5;
        s2.Fee_Status= "Paid";
        s2.Email= "Ali123@gmail.com";

        s1.display();
        s2.display();




    }
}