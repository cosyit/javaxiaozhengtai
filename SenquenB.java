package threadlocal;

public class SenquenB implements Sequence {

    //get(),set(),remove();withInitialize();  protected void initiValue();
    private static ThreadLocal<Integer> numberContainer = new ThreadLocal<Integer>(){

        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    @Override
    public int getNumber() {
        numberContainer.set(numberContainer.get()+1);
        return numberContainer.get();
    }
}
