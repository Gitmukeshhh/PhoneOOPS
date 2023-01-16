public interface Phone {
    void powerOn();
    void callNo(String phoneNo);
    void receiveCall(String phoneNo);
    boolean answer();
    boolean isRinging();
}
