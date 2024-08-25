package SuperHero_Project_Task;

public class Superman extends SuperHeroes {
    private String flyingAbility;

    public Superman(String name, String gender, String aggression, String wisdom, String beauty,String flyingAbility) {
        super(name, gender, aggression, wisdom, beauty);
        setFlyingAbility(flyingAbility);
    }

    public String getFlyingAbility() {
        return flyingAbility;
    }

    public void setFlyingAbility(String flyingAbility) {
        this.flyingAbility = flyingAbility;
    }

    @Override
    public void exposeSecretPower() {
        System.out.println(getName()+" SuperSonic Flight hızında uçma yeteneğine sahiptir.");
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Ayrıca, "+getName()+" uçarken Süpersonic Flight-güçlü saldırılar gerçekleştirebilir.");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("\nÖzel Güç \n--------------------------\n Uçma yeteneği = "+getFlyingAbility()+"\n------------------------------\n");
    }
}
