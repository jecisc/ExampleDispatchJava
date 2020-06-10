package rightWay;

public class Main {

  public static void main(String[] args) {
        Die die = new Die(8);
        DiceHandle handle = new DiceHandle();

        handle.addDie(new Die(3));
        handle.addDie(new Die(8));

        System.out.println(Main.roll(die));
        System.out.println(Main.roll(handle));
    }

     public static int roll(Rollable rollable){
       return rollable.roll();
    }
}
