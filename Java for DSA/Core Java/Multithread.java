class MyThread extends Thread {
    public void run() {
        int i = 1;
        while (true) { 
            System.out.println("Thread " + i + " is running.");
            i++;
        }
    }
}

class Multithread {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.start(); // Start the first thread
        int i = 1;
        while (true) { 
            System.out.println("Main thread is running.");
            i++;
        }
        // The main thread will run concurrently with the MyThread instance.
    }
}