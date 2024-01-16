public class Test{
    public static void main(String[] args) {

                            //dichiarazioni degli oggetti
        A a1, a2, a3, a4;
        B b;
        C c1, c2;
        D d;

                            //assegnazioni
        a1 = new A();
        a2 = new B();
        a3 = new C();
        a4 = new D();
        b = new B();
        c1 = new C();
        c2 = new D();
        d = new D();

                            //test da verificare

        //b = a3;           //errore a compilazione
        a1 = c1;            //funziona
        a1 = b;             //funziona
        //b = c2;           //errore a compilazione
        //d = (D) c1;       //errore runtime
        c2 = d;             //funziona
        c1 = (C) a3;        //funziona ma necessita di down casting
    }
}