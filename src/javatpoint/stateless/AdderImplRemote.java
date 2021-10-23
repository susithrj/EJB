package javatpoint.stateless;
import javax.ejb.Remote;

@Remote
public interface AdderImplRemote {

    public int add(int i, int i1);
}
