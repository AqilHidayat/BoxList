package sg.edu.rp.c346.boxlist;

/**
 * Created by 16019623 on 23/7/2018.
 */

public class boxItem {

    private boolean isFirst;
    private boolean isSecond;
    private boolean isThird;

    public boxItem(boolean isFirst, boolean isSecond, boolean isThird) {
        this.isFirst = isFirst;
        this.isSecond = isSecond;
        this.isThird = isThird;
    }

    public boolean isFirst() {
        return isFirst;
    }

    public void setFirst(boolean first) {
        isFirst = first;
    }

    public boolean isSecond() {
        return isSecond;
    }

    public void setSecond(boolean second) {
        isSecond = second;
    }

    public boolean isThird() {
        return isThird;
    }

    public void setThird(boolean third) {
        isThird = third;
    }

    @Override
    public String toString() {
        return "boxItem{" +
                "isFirst=" + isFirst +
                ", isSecond=" + isSecond +
                ", isThird=" + isThird +
                '}';
    }
}
