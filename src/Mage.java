public class Mage {
    private String name;
    private int health;
    private int mana;
    private String favoriteSchoolOfMagic;

    public Mage(String name,  int health, int mana, String favoriteSchoolOfMagic) {
        this.favoriteSchoolOfMagic = favoriteSchoolOfMagic;
        this.health = health;
        this.mana = mana;
        this.name = name;
    }

    public void castSpell() {
         if (favoriteSchoolOfMagic.equals("Arcane")){
             System.out.println(name + " casts Magic missiles!");
             mana = mana - 20;
         } else if (favoriteSchoolOfMagic.equals("Frost")){
             System.out.println(name + " casts Frostbolt!");
             mana = mana - 15;
         } else {
             System.out.println(name + " casts a spell!");
             mana = mana - 10;
         }
    }

    public void drinkManaPot() {
        System.out.println(name + " drinks a mana potion!");
        mana = mana + 50;
    }

    public String getFavoriteSchoolOfMagic() {
        return favoriteSchoolOfMagic;
    }

    public void setFavoriteSchoolOfMagic(String favoriteSchoolOfMagic) {
        this.favoriteSchoolOfMagic = favoriteSchoolOfMagic;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Mage{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", mana=" + mana +
                ", favoriteSchoolOfMagic='" + favoriteSchoolOfMagic + "'"+
                '}';
    }
}
