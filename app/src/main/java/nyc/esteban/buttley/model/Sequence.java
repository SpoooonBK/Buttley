package nyc.esteban.buttley.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Spoooon on 11/29/2014.
 */
public class Sequence {

    private static int id = 0;
    private List<Integer> sequence;
    private Iterator<Integer> iterator;


    public Sequence(){
        sequence = new ArrayList<Integer>();
        id =++id;
    }

    public int getId(){
        return id;
    }

    public void add(Integer sequenceItem){
        sequence.add(sequenceItem);
    }

    public int next(){
        iterator = sequence.iterator();
        if(iterator.hasNext()){
            return iterator.next();
        }
        else return -1;
    }

}
