package threadlocal;

public class SenquenA implements Sequence{

    static int number = 0;

    @Override
    public int getNumber() {
        return ++number;
    }
}
