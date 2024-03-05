package KarakterMMORPG;

public class Prajurit extends KarakterMMORPG {
    public Prajurit(String nama) {
        super(nama, 1, 100, 1000, 5000, 100, "Not Owned");
    }

    @Override
    public void upLevel() {
        super.upLevel();
        level += 1;
        attack += 75;
        kesehatanHP += 2000;
        XPlevel += 5000;
        energi += 25;
        setSkill("Serangan Kritis");
    }
}
