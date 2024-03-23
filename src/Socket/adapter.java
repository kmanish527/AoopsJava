package Socket;

public class adapter {
    private socket s;

    public String adapt(String s1, String s2) {
        s = new socket();
        return s.supplypower(Integer.parseInt(s1) + Integer.parseInt(s2));
    }
}