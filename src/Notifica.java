public abstract class Notifica {

    protected String destinatario;
    protected String messaggio;

    public Notifica(String destinatario, String messaggio) {
        this.destinatario = destinatario;
        this.messaggio = messaggio;
    }

    public abstract void invia();

    
}