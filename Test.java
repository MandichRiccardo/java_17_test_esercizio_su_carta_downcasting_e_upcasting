public class Test{
    public static void main(String[] args) {

                            //dichiarazioni degli oggetti
        Animale animale1, animale2, animale3, animale4;
        Cane cane;
        Gatto gatto1, gatto2;
        Persiano persiano;

                            //assegnazioni
        animale1 = new Animale();
        animale2 = new Cane();
        animale3 = new Gatto();
        animale4 = new Persiano();
        cane = new Cane();
        gatto1 = new Gatto();
        gatto2 = new Persiano();
        persiano = new Persiano();

                            //test da verificare

        //cane = animale3;                  //errore a compilazione
        animale1 = gatto1;                  //funziona
        animale1 = cane;                    //funziona
        //cane = gatto2;                    //errore a compilazione
        //persiano = (Persiano) gatto1;     //errore runtime
        Gatto2 = persiano;                  //funziona
        gatto1 = (Gatto) animale3;          //funziona ma necessita di down casting
    }
}