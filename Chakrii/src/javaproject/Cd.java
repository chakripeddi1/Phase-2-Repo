package javaproject;


public class Cd extends Thread {
	
	int count;
	
	 public synchronized void  run() {
		 
	  for (int i=1;i<=10000;i++) {
		  this.count++;
		    }
		
	 }

	public static void main(String[] args) {
		
	Cd f = new Cd();
	
	
	Thread t1 = new Thread(f);
	Thread t2 = new Thread(f);
	
	t1.start();
	try {
		t1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	t2.start();
	System.out.println(f.count);

	

	
			
	}
}



	