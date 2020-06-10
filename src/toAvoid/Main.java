package toAvoid;

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
        if(rollable instanceof Die){
           return  ((Die) rollable).rollDie();
        } else if (rollable instanceof DiceHandle){
           return ((DiceHandle) rollable).rollHandle();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
