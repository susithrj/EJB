package stateful;

import javax.ejb.Remote;
import java.util.List;
@Remote
public interface ListElementsRemote {
    void addElement(int e);
    void removeElement(int e);

    List<Integer> getElements();


}
