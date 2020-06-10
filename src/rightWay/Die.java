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
}
