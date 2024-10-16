package example2;

import com.sun.jdi.event.ThreadDeathEvent;

public class Main {
    public static void main(String[] args) {
        oddPrinter oddPrinter = new oddPrinter();
        evenPrinter evenPrinter = new evenPrinter();
        Thread oddThread = new Thread(oddPrinter);
        Thread evenThread = new Thread(evenPrinter);
        oddThread.start();
        evenThread.start();
    }
}
