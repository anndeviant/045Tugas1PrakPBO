package polymorphism;

//import KarakterMMORPG.Kesatria;
//import KarakterMMORPG.Prajurit;
//import KarakterMMORPG.Penyihir;
//import KarakterMMORPG.Pengintai;
//import KarakterMMORPG.KarakterMMORPG;
import KarakterMMORPG.*;

public class Polymorphism {

    public static void main(String[] args) {
        KarakterMMORPG Karakter[] = new KarakterMMORPG[5];
        
        Karakter[0] = new KarakterMMORPG("MMORPG 1", 1, 100, 1000, 5000, 100, "Not Owned");
        Karakter[1] = new Kesatria("Kesatria");
        Karakter[2] = new Penyihir("Penyihir");
        Karakter[3] = new Pengintai("Pengintai");
        Karakter[4] = new Prajurit("Prajurit");
        
        System.out.println("Default Statistik Karakter MMORPG: ");
        System.out.println(".Nama  : " + Karakter[0].nama);
        System.out.println(".Level : " + Karakter[0].level);
        System.out.println(".Attack: " + Karakter[0].attack);
        System.out.println(".HP    : " + Karakter[0].kesehatanHP);
        System.out.println(".XP    : " + Karakter[0].XPlevel);
        System.out.println(".Energi: " + Karakter[0].energi);
        System.out.println(".Skill : " + Karakter[0].getSkillDefault());
        System.out.println();
        
        System.out.println("Karakter MMORPG Berdasarkan Role-nya: ");
        for (int i = 1; i < 5; i++) {
            System.out.println(Karakter[i]);
        }
        
        System.out.println("All Role Upgraded to Next Level");
        for (int i = 1; i < 5; i++) {
            Karakter[i].upLevel();
            System.out.println(Karakter[i]);
        }
        
        System.out.println("All Role Upgraded to Next Level");
        for (int i = 1; i < 5; i++) {
            Karakter[i].upLevel();
            System.out.println(Karakter[i]);
        }
    }
}
