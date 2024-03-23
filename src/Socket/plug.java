package Socket;

import java.net.Socket;

public class plug {
    private String s1,s2;
    private adapter a ;
    public String receivepower(){
        a = new adapter();
        return a.adapt(s1,s2);
    }
}
