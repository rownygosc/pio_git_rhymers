package edu.kis.vh.nursery;
/**
 * Klasa implementująca stos (LIFO), który przechowuje liczby całkowite.
 * Klasa ta implementuje operacje na stosie takie jak:
 * - dodawanie elementów do stosu (countIn)
 * - usuwanie elementów ze stosu (countOut)
 * - sprawdzanie, czy stos jest pusty (callCheck)
 * - sprawdzanie, czy stos jest pełny (isFull)
 * - dostęp do elementu na szczycie stosu (peekaboo)
 */
public class DefaultCountingOutRhymer {

    /**
     * Tablica przechowująca elementy stosu.
     */
    private int[] numbers = new int[12];

    /**
     * Zmienna przechowująca indeks ostatniego elementu na stosie.
     * -1 oznacza pusty stos.
     */
    private int total = -1;

    /**
     * Zwraca aktualną liczbę elementów na stosie.
     *
     * @return liczba elementów na stosie
     */
    public int getTotal() {
        return total;
    }

    /**
     * Zwraca element na szczycie stosu, bez jego usuwania.
     *
     * @return element na szczycie stosu, lub -1 jeśli stos jest pusty
     */
    public int peekaboo() {
        if (callCheck()) return -1;
        return numbers[total];
    }

    /**
     * Dodaje element do stosu, jeśli stos nie jest pełny.
     *
     * @param in element do wstawienia na stos
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza, czy stos jest pusty.
     *
     * @return true jeśli stos jest pusty, false jeśli nie jest
     */
    protected boolean callCheck() {
        return total == -1;
    }

    /**
     * Sprawdza, czy stos jest pełny.
     *
     * @return true jeśli stos jest pełny, false jeśli nie jest
     */
    protected boolean isFull() {
        return total == 11;
    }

    /**
     * Usuwa element ze stosu i zwraca go.
     *
     * @return usunięty element ze stosu, lub -1 jeśli stos jest pusty
     */
    public int countOut() {
        if (callCheck()) return -1;
        return numbers[total--];
    }
}
