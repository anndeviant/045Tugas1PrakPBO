package KarakterMMORPG;

public class Pengintai extends KarakterMMORPG {
    public Pengintai(String nama) {
        super(nama, 1, 100, 1000, 5000, 100, "Not Owned");
    }

    @Override
    public void upLevel() {
        super.upLevel();
        level += 1;
        attack += 100;
        kesehatanHP += 2000;
        XPlevel += 5000;
        energi += 50;
        setSkill("Pengintaian Jarak Jauh");
    }
}
