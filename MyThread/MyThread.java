public class MyThread extends Thread{

	public static Thread mThread;


	public static void main(String args[]){
		mThread = new MyThread();	
		mThread.start();

		while(true){
			System.out.println("11111111111111111111");

			try {
                        	Thread.sleep(500);
	                    } catch (InterruptedException e) {
        	                // TODO Auto-generated catch block
				 System.out.println("11err");
                    	}	

		}
	}

	@Override
	public void run() {

	        while (true) {
        	        //SystemClock.sleep(5000);
			System.out.println("22222222222222222222222");
			
			try {
                        	Thread.sleep(50);
	                    } catch (InterruptedException e) {
        	                // TODO Auto-generated catch block
				 System.out.println("2err");
                    	}	
        	}
    	}

}
