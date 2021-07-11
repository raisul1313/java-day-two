package classbasicstudent;

import java.util.ArrayList;

public class BasicClass {

    public static void main(String[] args) {
        StudentGetSetMethod sgs = new StudentGetSetMethod(); //normal class  get set output
        sgs.setName("Mr. Ratul");
        sgs.setSeid(4589);
        sgs.setPhone("99999999999");
        System.out.println(sgs.StudentGetSetMethod()); 
        
        System.out.println(" "); //constructor output
        StudentConstructorMethod sc = new StudentConstructorMethod("Mr. Raisul", 2016,"88888888888","@gmail.com");
        StudentConstructorMethod sc1 = new StudentConstructorMethod("Mr. Akkas",1235,"55555555555","@gmail.com");
        StudentConstructorMethod sc2 = new StudentConstructorMethod("Mr. Kuddus",8236,"66666666666","@gmail.com");
        
        //sc.setPhone("77777777777");         //if we want to change any imformation (mutable)
        System.out.println(sc.getStudentConstructorMethodiInfo());
        
        
        System.out.println(" "); //array outout
        ArrayList<StudentConstructorMethod> students = new ArrayList<>();       
        students.add(sc);
        students.add(sc1);
        students.add(sc2);
        
        System.out.println(" ");
        for(StudentConstructorMethod scm: students){
            System.out.println(scm.getStudentConstructorMethodiInfo());
        }
        
        System.out.println(" ");
        System.out.println(students.get(2).getStudentConstructorMethodiInfo()); //index output 
        
        System.out.println(" ");
        ArrayList<String> cities = new ArrayList<>();
        cities.add("1. Dhaka");
        cities.add("2. Chittagong");
        cities.add("3. Khulna");
        cities.add("4. Dhaka");
        cities.add("5. Rajshahi");
        cities.add("6. Barisal");
        cities.add(6, "7. Savar");
        cities.add(2, "8. Cox-Bazar");
        cities.remove(3); //by index
        cities.remove("4. Dhaka"); //by object

        for(String c : cities){
            System.out.println(c);
        }
        
        
    }
    
}
 