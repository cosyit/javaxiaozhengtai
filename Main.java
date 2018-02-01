package threadlocal;

public class Main {

    public static void main(String[] args) {

        Sequence sequence = new SenquenC();

        ClientThread t1= new ClientThread(sequence);
        ClientThread t2= new ClientThread(sequence);
        ClientThread t3= new ClientThread(sequence);

        t1.start();
        t3.start();
        t2.start();
    }
}
