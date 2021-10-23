package javatpoint.stateless;


import javax.naming.Context;
import javax.naming.InitialContext;

public class Main{
    public static void main(String[] args)throws Exception {
        Context cntext=new InitialContext();
      //  AdderImplRemote remote=(AdderImplRemote)context.lookup("st1"); //just calling sub implemnted method fron tag
        AdderImplRemote remote = (AdderImplRemote)cntext.lookup("st91");
        System.out.println(remote.add(32,32));
    }
}
