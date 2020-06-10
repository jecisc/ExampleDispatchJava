package rightWay;

import java.util.HashSet;

public class DiceHandle extends AbstractRollable {

    protected HashSet<Die> dice = new HashSet<Die>();

    public void addDie(Die die){
        this.dice.add(die);
    }

    public int roll(){
        int result = 0;
        for(Die die : this.dice){
            result = result + die.roll();
        }
        return result;
    }

}
