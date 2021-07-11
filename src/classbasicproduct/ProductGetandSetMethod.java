 package classbasicproduct;

public class ProductGetandSetMethod {
    private int id;
    private String name; 
    private double price;

    public int getId() {                            // Getter And Setter
        return id;
    }

    public void setId(int id) {
        if(id > 0){
          this.id = id;  
        }
        else{
            System.out.println("Invalid Product ID");
        }
        
    }

    public String getName() {
        /*if(name == null){
            return "null";
        }                                         // We can use if-else or ternary operator       
        return name;*/
        return name == null ? "null" : name  ;    // Ternary operator 
    }

    public void setName(String name) {
        if(name.length() >= 6 && name.length() <=20){
          this.name = name;  
        }
        else{
            System.out.println("Invalid Product Name"); 
        }
        
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > 0.0){
            this.price = price;
        }
        else{
            System.out.println("Invalid Price");
        }
    }
    public String getProductGetandSetMethodInfo(){
        return getName()+" "+getId()+" "+getPrice();
    }
}
