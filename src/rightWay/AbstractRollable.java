package rightWay;

public abstract class AbstractRollable implements Rollable {

    public abstract int roll();

    public abstract DiceHandle with(AbstractRollable rollable);

    public abstract DiceHandle withHandle(DiceHandle handle);

    public abstract DiceHandle withDie(Die die);
}
