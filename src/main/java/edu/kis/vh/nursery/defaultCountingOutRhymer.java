package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int[] numbersArray = new int[12];

    public int totalIndex = -1;

    public void countIn(int in) {
        if (!isFull())
            numbersArray[++totalIndex] = in;
    }

    public boolean callCheck() {
        return totalIndex == -1;
    }

    public boolean isFull() {
        return totalIndex == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbersArray[totalIndex];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbersArray[totalIndex--];
    }

}
