package rightWay;

import java.util.HashSet;

/**
 * I represent a DiceHandle.
 *
 * A DiceHandle is a composition of dice. When I am rolled, I return the sum of the roll of all my dice.
 *
 * ========================
 *
 * Example:
 *
 *  DiceHandle handle = new DiceHandle();
 *  handle.addDie(new Die(3));
 *  handle.addDie(new Die(8));
 *  handle.roll()
 *
 */
public class DiceHandle extends Rollable {

    protected HashSet<Die> dice = new HashSet<Die>();

    public DiceHandle(){
        super();
    }

    public DiceHandle(HashSet<Die> dice){
        this.dice = dice;
    }

    /**
     * Add a die to my collection of dice
     * @param die Die to add
     */
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
    public DiceHandle with(Rollable rollable) {
        // I use double dispatch here by delegating to my parameter.
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
