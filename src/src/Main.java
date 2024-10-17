public class Main {
    public static void main(String[] args) {
        Weapon AK47 = new Weapon(WeaponType.AK47, "Ak47");
        Weapon BOW = new Weapon(WeaponType.BOW, "BOW");
        Weapon DAGGER = new Weapon(WeaponType.DAGGER, "DAGGER");

        Boss boss = new Boss(100, 200, AK47);
        System.out.println("Boss Info: \n" + boss.printInfo() );

        Sceleton sceleton1 = new Sceleton(50,100, BOW, 20);
        Sceleton sceleton2 =  new Sceleton(20, 70, DAGGER, 30);
        System.out.println("Skeleton 1 info: \n" + sceleton1.printInfo());
        System.out.println("Skeleton 2 info: \n" + sceleton2.printInfo());
    }
}