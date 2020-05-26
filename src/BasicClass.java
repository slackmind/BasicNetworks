import java.io.Serializable;

public class BasicClass implements Serializable {

    private final int num;

    public BasicClass(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "The number is:  " + num;
    }

    public int getNum(){
        return num;
    }

}
