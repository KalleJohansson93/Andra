package Sprint4.Uppgift12;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class MultiWriter {
    List<PrintWriter> writersList = new ArrayList<>();

    public void addWriter(PrintWriter writer){
        writersList.add(writer);
    }
    public List<PrintWriter> getWriters(){
        return writersList;
    }
    public void removeWriter(PrintWriter writer){
        writersList.remove(writer);
    }
}
