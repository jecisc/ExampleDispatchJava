package rightWay;

/**
 * I am an abstract class to represent an object that can roll and give a result.
 *
 * ===================================
 *
 * API:
 *
 * #roll() return the result of a roll.
 * #with(Rollable rollable) return a new DiceHandle will all my dice and the dices of my receiver.
 */
public abstract class Rollable {

    /**
     * Return the result of a roll.
     * @return result of the roll.
     */
    public abstract int roll();

    /**
     * I return a new DiceHandle composed of the dice I have and the dice of my parameter.
     * @param rollable Rollable to add to my dice in order to create a new dice handle.
     * @return A DiceHandle composed of my dice and of the dices of the parameter.
     */
    public abstract DiceHandle with(Rollable rollable);

    /**
     * I return a new DiceHandle composed of the dice I have and the dice of the handle in parameter.
     * @param handle DiceHandle to add to my dice in order to create a new dice handle.
     * @return A DiceHandle composed of my dice and of the dices of the handle parameter.
     */
    public abstract DiceHandle withHandle(DiceHandle handle);

    /**
     * I return a new DiceHandle composed of the dice I have and the die in parameter.
     * @param die Die to add to my dice in order to create a new dice handle.
     * @return A DiceHandle composed of my dice and of the die in parameter.
     */
    public abstract DiceHandle withDie(Die die);
}
