package rightWay;

import java.util.HashSet;

public class DiceHandle extends AbstractRollable {

    protected HashSet<Die> dice = new HashSet<Die>();

    public DiceHandle(){
        super();
    }

    public DiceHandle(HashSet<Die> dice){
        this.dice = dice;
    }

    public void addDie(Die die){
        this.dice.add(die);
    }

    @Override
    public int roll(){
        int result = 0;
        for(Die die : this.dice){
            result = result + die.roll();
        }
        return result;
    }

    @Override
    public DiceHandle with(AbstractRollable rollable) {
        return rollable.withHandle(this);
    }

    @Override
    public DiceHandle withHandle(DiceHandle handle) {
        DiceHandle newHandle = new DiceHandle(this.dice);
        for(Die die : this.dice){
            newHandle.addDie(die);
        }
        return newHandle;
    }

    @Override
    public DiceHandle withDie(Die die) {
        DiceHandle newHandle = new DiceHandle(this.dice);
        newHandle.addDie(die);
        return newHandle;
    }

    public HashSet<Die> getDice() {
        return this.dice;
    }
}
