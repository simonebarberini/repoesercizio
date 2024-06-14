public class NotificaApp {
    public static void main(String[] args) throws Exception {
        Sms s = new Sms("Simone", "Ciao Simone");
        s.invia();
        Email e = new Email("Mirko", "Ciao Mirko");
        e.invia();
    }
}
