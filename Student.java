class Study{
    String name;
    int age;
    String dob;

    Study(String n,int a,String d){
        this.name=n;
        this.age=a;
        this.dob=d;
    }
     void display(){
        System.out.println("name of the student: "+name);
        System.out.println("age of the student:" +age);
        System.out.println("Date of birth of the student:" +dob);

    }

}

public class Student {
    public static void main(String[] args) {
        Study s1=new Study("anjum",22,"05-05-2002");
        s1.display();
        }
    }
