package javatpoint.stateless;

import javax.ejb.Stateless;

@Stateless(mappedName="st91")
public class AdderImpl implements AdderImplRemote {
    @Override
    public int add(int i, int i1) {
        return i+i1;
    }
}
