package it.uniba.app.FloydGame.Boundaries;

/**
 * <<Boundary>> Classe che si occupa di stampare dei messaggi.
 */
public final class Printer {

    /**
    * Modificatore di accesso che impedisce la creazione di oggetti di tipo.
    */
    private Printer() {

    }

    /**
     * Stampa una qualunque stringa.
     * @param txt stringa da stampare.
     */
    public static void print(final String txt) {
        System.out.print(txt);
    }
}
