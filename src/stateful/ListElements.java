package stateful;

import javax.ejb.Stateful;
import java.util.ArrayList;
import java.util.List;

@Stateful
public class ListElements implements ListElementsRemote {
    List<Integer> values = new ArrayList<>();

    @Override
    public void addElement(int e) {
      values.add(e);
    }

    @Override
    public void removeElement(int e) {
         values.remove(new Integer(e));
    }

    @Override
    public List<Integer> getElements() {
        return values;
    }
}
