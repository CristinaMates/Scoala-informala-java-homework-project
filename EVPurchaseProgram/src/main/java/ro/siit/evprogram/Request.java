package ro.siit.evprogram;

public class Request {

    public int numberOfReq = -1;
    private boolean available = false;

    public synchronized int receive() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        available = false;
        notifyAll();
        return numberOfReq;
    }

    public synchronized void send(int numberOfReq) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.numberOfReq = numberOfReq;
        available = true;
        notifyAll();
    }
}
