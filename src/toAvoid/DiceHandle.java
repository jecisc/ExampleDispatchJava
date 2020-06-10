package toAvoid;

import java.util.HashSet;

public class DiceHandle implements Rollable {

    protected HashSet<Die> dice = new HashSet<Die>();

    public void addDie(Die die){
        this.dice.add(die);
    }

    public int rollHandle(){
        int result = 0;
        for(Die die : this.dice){
            result = result + die.rollDie();
        }
        return result;
    }

}
