public class RPGWorld {
    public static void main(String[] args) {


        Mage medivh =  new Mage("Medivh", 100, 200, "Arcane");
        Mage jaina =  new Mage("Jaina", 80, 150, "Frost");

        System.out.println("Mage name: " + medivh.getName() + " and the school of magic is: " + medivh.getFavoriteSchoolOfMagic());

        System.out.println(medivh.getMana());
        medivh.castSpell();
        System.out.println(medivh.getMana());
        medivh.drinkManaPot();
        System.out.println(medivh.getMana());


        jaina.castSpell();
        jaina.setName("Jaina Proudmoore");

        System.out.println(jaina.getName());

        System.out.println(medivh);

    }
}
