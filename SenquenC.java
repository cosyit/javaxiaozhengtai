package threadlocal;

public class SenquenC implements Sequence{

    private static MyThreadLocal<Integer> numberContainer = new MyThreadLocal<Integer>(){
        @Override
        protected Integer initValue() {
            return 0;
        }
    };


    @Override
    public int getNumber() {

        numberContainer.set(numberContainer.get()+1);
        return numberContainer.get();
    }
}
