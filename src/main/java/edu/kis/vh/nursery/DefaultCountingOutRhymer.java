package edu.kis.vh.nursery;

/**
 * Klasa reprezentująca klasyczny stos liczbowy o stałej pojemności.
 * Udostępnia metody do dodawania i usuwania elementów ze stosu oraz sprawdzania
 * jego stanu.
 */
public class DefaultCountingOutRhymer {

    // Stałe definiujące pojemność stosu oraz wartości skrajne
    private static final int STACK_CAPACITY = 12;
    private static final int EMPTY_STACK_VALUE = -1;
    private static final int FULL_STACK_INDEX = STACK_CAPACITY - 1;

    // Tablica przechowująca elementy stosu
    private int[] numbers = new int[STACK_CAPACITY];

    // Indeks wskazujący na ostatni dodany element na stosie
    private int total = EMPTY_STACK_VALUE;

    /**
     * Dodaje liczbę do stosu, jeżeli stos nie jest pełny.
     *
     * @param in liczba do dodania do stosu
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza, czy stos jest pusty.
     *
     * @return true, jeśli stos jest pusty, false w przeciwnym przypadku
     */
    public boolean callCheck() {
        return total == -1;
    }

    /**
     * Sprawdza, czy stos jest pełny.
     *
     * @return true, jeśli stos jest pełny, false w przeciwnym przypadku
     */
    public boolean isFull() {
        return total == FULL_STACK_INDEX;
    }

    /**
     * Zwraca ostatni element stosu bez jego usuwania.
     * Jeśli stos jest pusty, zwraca wartość wskazującą na pusty stos.
     *
     * @return ostatni element stosu lub -1, jeśli stos jest pusty
     */
    protected int peekaboo() {
        if (callCheck())
            return EMPTY_STACK_VALUE;
        return numbers[total];
    }

    /**
     * Usuwa i zwraca ostatni element stosu.
     * Jeśli stos jest pusty, zwraca wartość wskazującą na pusty stos.
     *
     * @return ostatni element stosu lub -1, jeśli stos jest pusty
     */
    public int countOut() {
        if (callCheck())
            return EMPTY_STACK_VALUE;
        return numbers[total--];
    }
}