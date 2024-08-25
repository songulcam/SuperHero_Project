package SuperHero_Project_Task;

public class SuperHeroes {
    private String name;
    private String gender;
    private String aggression;
    private String wisdom;
    private String beauty;

    public SuperHeroes(String name, String gender, String aggression, String wisdom, String beauty) {
        setName(name);
        setAggression(aggression);
        setBeauty(beauty);
        setGender(gender);
        setWisdom(wisdom);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAggression(String aggression) {
        this.aggression = aggression;
    }

    public void setWisdom(String wisdom) {
        this.wisdom = wisdom;
    }

    public void setBeauty(String beauty) {
        this.beauty = beauty;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getAggression() {
        return aggression;
    }

    public String getWisdom() {
        return wisdom;
    }

    public String getBeauty() {
        return beauty;
    }

    public void printInfo() {
        System.out.println("**************************************************");
        System.out.println("Bilgi\n-------------------------\nİsim = " + name + "\n" +
                "Cinsiyet = " + gender + "\n" +
                "Agresyon = " + aggression + "\n" +
                "Bilgelik = " + wisdom + "\n" +
                "Güzellik = " + beauty);
        System.out.println("**************************************************");
    }

    public void attack() {
        if (gender.equals("kadın"))
            System.out.println("* Kahraman " + name + ", " + aggression + " agresyon, " + wisdom + " bilgelik ve " + beauty + " güzellik ile saldırıyor.");
        else if (gender.equals("erkek"))
            System.out.println("* Kahraman " + name + ", " + aggression + " agresyon, " + wisdom + " bilgelik ve " + beauty + " güzellik ile saldırıyor.");
    }

    public void exposeSecretPower() {
        if (gender.equals("kadın")) System.out.println("Bu kahramanın gizli bir gücü yok.");
        else if (gender.equals("erkek")) System.out.println("Bu kahramanın gizli bir gücü yok.");
    }
}
