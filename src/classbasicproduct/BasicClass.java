package classbasicproduct;

public class BasicClass {

    public static void main(String[] args) {     
        System.out.println(" ");
        ProductGetandSetMethod pgs = new ProductGetandSetMethod();
        pgs.setName("Motherboard");
        pgs.setId(23564);
        pgs.setPrice(200000.0);
        System.out.println(pgs.getProductGetandSetMethodInfo());
    }
    
}
