public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Magic(100, 20, "Invisibility"),
                new Medic(120, 15, "Heal", 50.0),
                new Warrior(150, 25, "Critical Damage")
        };

        for (Hero hero : heroes) {
            hero.applySuperAbility();

            // Проверяем, является ли текущий герой экземпляром Medic,
            // чтобы увеличить его лечебные способности на 10%.
            if (hero instanceof Medic) {
                Medic medic = (Medic) hero;
                medic.increaseExperience();
                System.out.println("Увеличение лечебных способностей Medic: " + medic.getHealPoints());
            }
        }
    }
}