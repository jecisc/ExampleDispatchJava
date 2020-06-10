package toAvoid;

import java.util.Random;

public class Die implements Rollable {

    protected int value;

    public Die(int value){
        this.value = value;
    }

    public int rollDie(){
        return (new Random()).nextInt(this.value - 1) + 1;
    }
}
