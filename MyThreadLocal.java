package threadlocal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MyThreadLocal<T> {

    private Map<Thread,T> container = Collections.synchronizedMap(new HashMap<Thread,T>());

    public void set(T value){
        container.put(Thread.currentThread() ,value);
    }

    public T get(){
        Thread t =Thread.currentThread();

        T value = container.get(t);

        //懒加载
        if(value == null && !container.containsKey(t)){
            value = initValue();

            container.put(t,value);
        }

        return value;
    }

    protected T initValue(){
        return null;
    }

    public void remove(){
        container.remove(Thread.currentThread());
    }

}
