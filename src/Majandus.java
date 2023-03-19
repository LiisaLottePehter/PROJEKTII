public class Majandus extends Küsimused{
    public Majandus(String küsimused, String vastus, String valdkond) {
        super(küsimused, vastus, valdkond);
    }

    //Siin katsetasin kas saaks hea meetodi, et soutida küsimuste järgi valdkond aga ei tulnud välja
    public Majandus() {
        valdkond = "majandus";
    }

    //Siin katsetasin kas saaks hea meetodi, et soutida küsimuste järgi valdkond aga ei tulnud välja
    @Override
    public String toString() {
        return "Valdkonnas majandus sinu punktid: ";

    }
}
