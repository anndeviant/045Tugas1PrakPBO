package KarakterMMORPG;

public class Kesatria extends KarakterMMORPG {
    public Kesatria(String nama) {
        super(nama, 1, 100, 1000, 5000, 100, "Not Owned");
    }

    @Override
    public void upLevel() {
        super.upLevel();
        level += 1;
        attack += 250;
        kesehatanHP += 2500;
        XPlevel += 5000;
        energi += 25;
        setSkill("Pemanggilan Hewan Langka");
    }
}
