package eighteenrecursionpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparatorInterfaceTest {
    public static void main(String[] args) {
        List<ComparatorInterface> comparator=new ArrayList<>(10);
        comparator.add(new ComparatorInterface(100, "Vahit", 10));
        comparator.add(new ComparatorInterface(101, "Ismayil", 12));
        comparator.add(new ComparatorInterface(102, "Sibel", 8));
        comparator.add(new ComparatorInterface(103, "Esra", 16));
        comparator.add(new ComparatorInterface(104, "Nil", 19));
        Collections.sort(comparator, new AgeSorting());
        for(ComparatorInterface st: comparator){
            System.out.println(st.id+"\t"+st.name+"\t"+st.age);
        }
        Collections.sort(comparator, new IdSorting());
        Iterator<ComparatorInterface> iterator=comparator.iterator();
        ComparatorInterface temp;
        while(iterator.hasNext()){
            temp=iterator.next();
            System.out.println(temp.id+"\t"+temp.name+"\t"+temp.age);
        }
        Collections.sort(comparator, new NameSorting());
        for(ComparatorInterface std: comparator){
            System.out.println(std.id+"\t"+std.name+"\t"+std.age);
        }
    }
}
