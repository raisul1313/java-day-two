package classbasicstudent;

public class StudentConstructorMethod {
    private String name; 
    private int seid; 
    private String phone;
    private String email;

    public StudentConstructorMethod(String name, int seid) {
        if(name.length() >= 6){
            this.name = name;
        }
        else{
            System.out.println("Name Should be 6 Characters long");
        }
        if(seid > 0){
           this.seid = seid;
        }
        else{
            System.out.println("Seid Can't be Zero"); 
        }     }
    
    public StudentConstructorMethod(String name, int seid, String phone, String email) { //constructor
        this(name,seid);               //same conditon apply latter, for that we call previous confition
         
        /*if(name.length() >= 6){
            this.name = name;
        }
        else{
            System.out.println("Name Should be 6 Characters long");
        }
        if(seid >= 1){
           this.seid = seid;
        }
        else{
            System.out.println("Seid Can't be Zero"); 
        }  */
        if(phone.length() == 11){
           this.phone = phone; 
        }
        else{
            System.out.println("Number Should be 11 Digit");
        }
        
        this.email = email;
    }

    public String getEmail() {
        return email == null ? "set email" : email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setPhone(String phone) {    // number can be change thats why we need extra seter
        if(phone.length() >= 11){
           this.phone = phone; 
        }
        else{
            System.out.println("Number Should be 11 Digit");
        }
    }
  
    public String getName() { 
        return name;
    }
    
    public int getSeid() { 
        return seid;
    }

    public String getPhone() {
        return phone == null ? "set phone number" : phone;
    }
    
    public String getStudentConstructorMethodiInfo(){
        return getName()+" "+getSeid()+" "+getPhone()+" "+getEmail();
    }
} 
