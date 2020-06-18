package rightWay;

import java.util.Random;

public class Die extends AbstractRollable {

    protected int value;

    public Die(int value){
        this.value = value;
    }


    public int roll(){
        return (new Random()).nextInt(this.value - 1) + 1;
    }

    @Override
    public DiceHandle with(AbstractRollable rollable) {
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
