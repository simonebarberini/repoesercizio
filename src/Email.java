public class Email extends Notifica {

    public Email(String destinatario, String messaggio) {
        super(destinatario, messaggio);
    }

    @Override
    public void invia() {
        System.out.println("Email da: "+ destinatario+"\nTesto: "+messaggio);
    }
    
}
