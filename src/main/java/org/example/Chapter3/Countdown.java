package org.example.Chapter3;

public class Countdown {

    public static void countdown(int i) {
        if (i <= 0) {
            System.out.println("Blastoff!"); // Print at the end for a more natural countdown flow
        } else {
            System.out.println(i);
            countdown(i - 1); // Recursive call to decrement and continue countdown
        }
    }
}
