package threadAndRunnable;


class MyThread extends Thread {
    private int count;

    public MyThread(int count) {
        this.count = count;
    }

    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.println("Thread extended - Running (Iteration: " + (i + 1) + ")");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class MyRunnable implements Runnable {
    private int count;

    public MyRunnable(int count) {
        this.count = count;
    }

    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.println("Runnable implemented - Running (Iteration: " + (i + 1) + ")");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadAndRunnable {
    public static void main(String[] args) {
        int iterationCount = 2; 
        
        new MyThread(iterationCount).start();

        
        new Thread(new MyRunnable(iterationCount)).start();
    }
}



	