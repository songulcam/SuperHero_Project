package SuperHero_Project_Task;

public class WonderWoman extends SuperHeroes {
    private String lassoOfTruthAbility;
    public WonderWoman(String name, String gender, String aggression, String wisdom, String beauty,String lassoOfTruthAbility) {
        super(name, gender, aggression, wisdom, beauty);
        setLassoOfTruthAbility(lassoOfTruthAbility);
    }

    public String getLassoOfTruthAbility() {
        return lassoOfTruthAbility;
    }

    public void setLassoOfTruthAbility(String lassoOfTruthAbility) {
        this.lassoOfTruthAbility = lassoOfTruthAbility;
    }

    @Override
    public void exposeSecretPower() {
        System.out.println(getName()+" doğruluğu söylemeye zorlayan Truth Lasso'ya sahiptir.");
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Ayrıca, "+getName()+" Golden Lasso-güçlü Truth Lasso ile saldırabilir ve düşmanlarını doğruluğu söylemeye zoryabilir.");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("\nÖzel Güç\n------------------------\nTruth Lasso Yeteneği = "+getLassoOfTruthAbility()+"\n------------------------------\n");
    }
}
