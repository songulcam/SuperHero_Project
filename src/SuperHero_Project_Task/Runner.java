package SuperHero_Project_Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        List<String> activeHeroes = new ArrayList<>();
        List<String> allHeroes = new ArrayList<>();

        allHeroes.add("Superman");
        allHeroes.add("Spiderman");
        allHeroes.add("Wolverine");
        allHeroes.add("Batman");
        allHeroes.add("WonderWoman");

        HeroFactory kahramanlar=new HeroFactory();
        Scanner scanner=new Scanner(System.in);


        while (true){
            System.out.println("Süper Kahramanlar gösterisine hoş geldiniz...\n" +
                    "Mevcut Süper Kahramanlar: " + allHeroes + "\nÇıkmak için q'ya basın...");

            System.out.print("Hangi süper kahramanı eklemek istiyorsunuz? : ");
            String secim=scanner.nextLine();

            if (secim.equalsIgnoreCase("q")){
                System.out.println("Süper kahraman dünyasından çıkış yaptınız. Görüşmek üzere...");
                break;
            }
            if (allHeroes.contains(secim)){
                if (!activeHeroes.contains(secim)){
                    SuperHeroes superHeroes=kahramanlar.produceSuperHero(secim);
                    if (superHeroes!=null){
                        activeHeroes.add(secim);
                        superHeroes.printInfo();
                        superHeroes.attack();
                        superHeroes.exposeSecretPower();
                        System.out.println(secim+" oyuna başarıyla eklendi.\n");

                        List<String>eklenmeyenKahramanlar=getRemainingHeroes(allHeroes,activeHeroes);
                        if (!eklenmeyenKahramanlar.isEmpty()){
                            System.out.println("\n----------------------\nOyunda aktif olan kahramanlar : "+activeHeroes);
                            System.out.println("Oyuna henüz girmemiş kahramanlar : "+eklenmeyenKahramanlar+"\n----------------------\n");
                        }else {
                            System.out.println("Tüm kahramanlar oyuna eklenmiştir.");
                        }
                    }else {
                        System.out.println(secim+" Geçerli bir kahraman ismi girin");
                    }
                }else {
                    System.out.println(secim+" zaten oyunda aktif!");
                }
                allHeroes.remove(secim);
            }else {
                System.out.println(secim+" Lütfen geçerli bir süper kahraman girin...");
            }
        }
    }
    private static List<String> getRemainingHeroes(List<String> allHeroes, List<String> activeHeroes) {
        List<String> remainingHeroes = new ArrayList<>(allHeroes);
        remainingHeroes.removeAll(activeHeroes);
        return remainingHeroes;
    }
}
