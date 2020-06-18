package rightWay;

public class Main {

  public static void main(String[] args) {
        Die die = new Die(8);
        DiceHandle handle = new DiceHandle();

        handle.addDie(new Die(3));
        handle.addDie(new Die(8));

        System.out.println(Main.roll(die));
        System.out.println(Main.roll(handle));

        DiceHandle handle2 = die.with(handle);
        DiceHandle handle3 = die.with(die);
        DiceHandle handle4 = handle.with(die);
    }

     public static int roll(Rollable rollable){
       return rollable.roll();
    }
}
