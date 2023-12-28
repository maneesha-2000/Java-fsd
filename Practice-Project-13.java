package synchronization;


		
			class SharedResource {
			    public void synchronizedMethod() {
			        synchronized (this) {
			            System.out.println("Synchronized Method: Start");
			            try {
			                Thread.sleep(100); // Simulating some work
			            } catch (InterruptedException e) {
			                e.printStackTrace();
			            }
			            System.out.println("Synchronized Method: End");
			        }
			    }
			}

			public class Synchronization  {
			    public static void main(String[] args) {
			        SharedResource sharedResource = new SharedResource();

			       
			        sharedResource.synchronizedMethod();
			        
			    }
			}