public class Main {
    public static void main(String[] args) {
        Lnadline Link1=new Lnadline("123");
        Lnadline Link2=new Lnadline("456");

        Link1.callNo("456");
        Link2.receiveCall("123");
        System.out.println(Link2.answer());
    }
}