public class Medic extends Hero {
    private double healPoints; // Используем double для точности при увеличении на 10%

    public Medic(int health, int damage, String superAbility, double healPoints) {
        super(health, damage, superAbility);
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность: " + superAbility);
    }

    public void increaseExperience() {
        healPoints *= 1.1; // Увеличиваем на 10%
    }

    public double getHealPoints() {
        return healPoints;
    }
}