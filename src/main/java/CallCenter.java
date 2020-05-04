public class CallCenter {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Item 1");
        Thread.sleep(4000);
        System.out.println("Item 2");

//        MyThread myThread = new MyThread();
//        MyThread myThread2 = new MyThread();
//        myThread.start();
//        myThread2.start();

//        Thread thread = new Thread(new NewThread());
//        thread.start();
    }
}

//class NewThread implements Runnable {
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(i);
//        }
//    }
//}

class MyThread extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Inner thread " + i);
        }
    }

}