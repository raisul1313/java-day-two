package classbasicstudent;

public class StudentGetSetMethod {
    private String name; 
    private int seid; 
    private String phone;

    public String getName() { //getter and setter;
        return name;
    }
    
    public void setName(String name) {
        if(name.length() >= 6){
            this.name = name;
        }
        else{
            System.out.println("Name Should be Six Characters long");
        }
    }

    public int getSeid() {
        return seid;
    }

    public void setSeid(int seid) {
        if(seid >= 1){
           this.seid = seid;
        }
        else{
            System.out.println("Seid Can't be Zero"); 
        }  
    }
    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if(phone.length() >= 11){
           this.phone = phone; 
        }
        else{
            System.out.println("Number Should be 11 Digit");
        }
    }
    
    public String StudentGetSetMethod(){
        return getName()+" "+getSeid()+" "+getPhone();
    }
} 
