public class Sceleton extends Boss{
    private int arrowCount;

    public int getArrowCount() {
        return arrowCount;
    }

    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
    }

    public Sceleton(int damage, int health, Weapon weapon, int arrowCount) {
        super(damage, health, weapon);
        this.arrowCount = arrowCount;
    }

    public String printInfo() {
        return super.printInfo() + "Arrow Count: " + arrowCount;
    }
}
