package MyClass;

public class SleepAndWait {

    private static Object LOCK = new Object();
    public static void main(String args[]) throws InterruptedException
    {
        Thread.sleep(100);
        System.out.println("Thread '" + Thread.currentThread().getName() + "' is woken after sleeping for 5 second");
        synchronized (LOCK) 
        {
            LOCK.wait(1000);
            System.out.println("Object '" + LOCK + "' is woken after" + " waiting for 5 second");
        }
    }
}


	
