public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon(WeaponType.Gunshot, "AK-47");
        Weapon skeletonWeapon1 = new Weapon(WeaponType.BiologicalWeapon, "Virusus");
        Weapon skeletonWeapon2 = new Weapon(WeaponType.ColdWeapon, "Machete");

        Boss boss = new Boss ("Shadow", 600, 70, bossWeapon);
        boss.printInfo();
        System.out.println();

        Skeleton skeleton1 = new Skeleton("Skeleton Bio", 250, 50, skeletonWeapon1, 23);
        Skeleton skeleton2 = new Skeleton("Skeleton Sharp", 200, 30, skeletonWeapon2, 8);

        skeleton1.printInfo();
        System.out.println();
        skeleton2.printInfo();

    }
}

