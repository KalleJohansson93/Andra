package Sprint4.Uppgift15;

import java.util.ArrayList;
import java.util.List;

public class Generic<T>{
    private List<T> innerList= new ArrayList<>();

    public void Generic(){}

    public void Put(T t){
        innerList.add(t);
    }

    public int Size(){
       return innerList.size();
    }

    public T Take(){
        T temp = innerList.get(0);
        innerList.remove(0);
        return temp;
    }

}
