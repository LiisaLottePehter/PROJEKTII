import java.util.ArrayList;

public class Küsimused {
    public boolean küsimus;
    String küsimused;
    String vastus;
    String valdkond;

    //Siin katsetasin kas saaks hea meetodi, et soutida küsimuste järgi valdkond aga ei tulnud välja
    public static String Valdkond(String[] küsimused) {
        return "Täpsustamata";
    }

    public Küsimused(String küsimused, String vastus, String valdkond){
        this.küsimused = küsimused;
        this.vastus = vastus;
        this.valdkond = valdkond;
    }
    public Küsimused(){
        super();
    }
    //teeme igale erialale oma meetodi, kus vastavalt küsimuse vastusele lisab tema Listi
    public ArrayList<String> informaatikaList(ArrayList<String> küsimused){
        ArrayList<String> informaatika = new ArrayList<>();
        int küsimusiKokku = 0;
        if(küsimused.get(küsimusiKokku) == "2")
            informaatika.add("2");
        küsimusiKokku++;
        if(küsimused.get(küsimusiKokku) == "3")
            informaatika.add("3");
        küsimusiKokku++;
        if(küsimused.get(küsimusiKokku) == "2")
            informaatika.add("2");
        küsimusiKokku++;
        if(küsimused.get(küsimusiKokku) == "2")
            informaatika.add("2");
        return informaatika;
    }

    //Teeks siia eraldi meetodi, mis loeb punkte
   /* public int majandus_kokku_punkte(ArrayList<String> küsimused){
        //Äkki teeks nüüd if lauseid, et kui küs1 vastab viis siis lisab need punktid loendurisse
        int majanduskokku = 0;
        //igal erialal võrdne arv küsimusi ja siis loeb need tsükli abi
        for (int i = 0; i < küsimused.size(); i++) {
            if (vastus == "1") {
                majanduskokku += 5;
            }
            if (vastus == "5") {
                majanduskokku += 1;
            }
        }
        //Ja jätkaks nii aga siis peame lihtsalt teadma, mis küsimus igal kohal asub
        return majanduskokku;
    }
    public int informaatika_kokku(ArrayList<String> küsimused){
        //Äkki teeks nüüd if lauseid, et kui küs1 vastab viis siis lisab need punktid loendurisse
        int itkokku = 0;
        //igal erialal võrdne arv küsimusi ja siis loeb need tsükli abi
        for (int i = 0; i < küsimused.size(); i++) {
            if (vastus == "1") {
                itkokku += 2;
            }
            if (vastus == "5") {
                itkokku += 5;
            }
        }
        //Ja jätkaks nii aga siis peame lihtsalt teadma, mis küsimus igal kohal asub
        return itkokku;
    }*/
}
