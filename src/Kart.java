import java.util.Random;

public class Kart extends Vehicle {

private  static Random rand = new Random();
private static SpecialItem[] item = new SpecialItem[3];
    public Kart(String brand, int speed) {
        super(brand, speed);
      item[0] = new SpecialItem("Green Shell",ConsoleColors.RED,7);
      item[1] = new SpecialItem("Boomerang",ConsoleColors.BLUE,5);
      item[2] = new SpecialItem("Banana",ConsoleColors.YELLOW,1);
    }

    public int Delayed(){
        return detailedAttack().getDelay();
    }
    /*
    returns a random attack from the attack array
    * @return
     */
    public SpecialItem detailedAttack(){
        int idx = rand.nextInt(item.length);
        return item[idx];
    }
}
