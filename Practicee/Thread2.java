package Practicee;

class Demo extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
          try {
              System.out.println("JAVA");
              Thread.sleep(1000);
          }
          catch (java.lang.Exception e){
              System.out.println();
          }
        }
    }
}

public class Thread2 {
    public static void main(String[] args) throws java.lang.Exception {
        System.out.println("Main thread started");
        Demo d1 = new Demo();
        d1.start();
        d1.join();
        System.out.println("Main thread ended");

    }
}
