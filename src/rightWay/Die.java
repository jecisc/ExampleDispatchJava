package rightWay;

import java.util.Random;

/**
 * I represent a Die.
 *
 * A Die can be rolled and will return its result.
 *
 * I can be configured to know the number of faces I have.
 *
 * ========================
 *
 * Example:
 *
 *  Dice die = new Dice(8);
 *  die.roll()
 */
public class Die extends Rollable {

    protected int value;

    public Die(int value){
        this.value = value;
    }


    public int roll(){
        return (new Random()).nextInt(this.value - 1) + 1;
    }

    @Override
    public DiceHandle with(Rollable rollable) {
        // I use double dispatch here by delegating to my parameter.
        return rollable.withDie(this);
    }

    @Override
    public DiceHandle withHandle(DiceHandle handle) {
        DiceHandle newHandle = new DiceHandle(handle.getDice());
        newHandle.addDie(this);
        return newHandle;
    }

    @Override
    public DiceHandle withDie(Die die) {
        DiceHandle newHandle = new DiceHandle();
        newHandle.addDie(this);
        newHandle.addDie(die);
        return newHandle;
    }
}
