package KarakterMMORPG;

public class KarakterMMORPG {
    public String nama;
    public int level;
    public int attack;
    public int kesehatanHP;
    public int XPlevel;
    public int energi;
    private String skills;

    public KarakterMMORPG(String nama, int level, int attack, int kesehatanHP, int XPlevel, int energi, String skills) {
        this.nama = nama;
        this.level = level;
        this.attack = attack;
        this.kesehatanHP = kesehatanHP;
        this.XPlevel = XPlevel;
        this.energi = energi;
        this.skills = skills;
    }

    public String getSkillDefault() {
        return "Not Owned";
    }

    // Polimorfosi
    public void upLevel() {
        System.out.println("==>>>> Level Up Success! <<<<==");
    }

    public void setSkill(String skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return ".Nama  : " + nama + "\n.Level : " + level + "\n.Attack: " + attack + "\n.HP    : " + kesehatanHP
                + "\n.XP    : " + XPlevel + "\n.Energi: " + energi + "\n.Skill : " + skills + "\n";
    }
}
