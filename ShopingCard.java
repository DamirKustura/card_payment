package myPackage;

public class ShopingCard implements Placanje {

    public String name;
    public String type;


   public ShopingCard(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void nacinPlacanja() {
        System.out.println("Placanje shooping karticom");
    }
}
