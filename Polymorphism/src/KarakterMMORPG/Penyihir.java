package KarakterMMORPG;

public class Penyihir extends KarakterMMORPG {
    public Penyihir(String nama) {
        super(nama, 1, 100, 1000, 5000, 100, "Not Owned");
    }

    @Override
    public void upLevel() {
        super.upLevel();
        level += 1;
        attack += 75;
        kesehatanHP += 1500;
        XPlevel += 5000;
        energi += 100;
        setSkill("Explosion Boom");
    }
}
