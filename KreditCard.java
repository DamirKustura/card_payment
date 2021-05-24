package myPackage;

public class KreditCard implements Placanje {
    public String name;
    public String type;


    public KreditCard(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void nacinPlacanja() {
        System.out.println("Placanje kreditnom karticom");
    }
}
