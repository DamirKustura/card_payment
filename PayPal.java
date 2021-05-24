package myPackage;

public class PayPal implements Placanje {
   public String name;
   public String type;


   public PayPal(String name,String type){
        this.name = name;
        this.type = type;
    }

    @Override
    public void nacinPlacanja() {
        System.out.println("placamo bez paypale");
    }
}
