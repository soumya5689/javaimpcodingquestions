package Practicee;

class family implements Runnable{
    String resource1 = "controller";
    String resource2 = "playstation";
    public void run(){
        String name = Thread.currentThread().getName();
        if(name.equals("rohit")== true){
            rohitAccquiredResource();
        }
        else{
            vijayaAccquiredResource();
        }
    }

    private void vijayaAccquiredResource(){
        synchronized (resource1){
           try {
               System.out.println("vijay accquired contoller");
               Thread.sleep(1000);
               synchronized (resource2){
                   System.out.println("vijaya accquired playstation");
                   Thread.sleep(1000);
               }
           }
           catch (java.lang.Exception e){
               System.out.println("vijaya failed");
           }


        }

    }
    private void rohitAccquiredResource() {
        synchronized (resource2) {
            try {
                System.out.println("rohit accquired playstation");
                Thread.sleep(1000);
                synchronized (resource1) {
                    System.out.println("rohit accquired controller");
                    Thread.sleep(1000);
                }
            } catch (java.lang.Exception e) {
                System.out.println("rohit failed");
            }

        }
    }
}

public class Thread1 {
    public static void main(String[] args) throws java.lang.Exception {
        family f = new family();
        Thread t1 = new Thread(f);
        Thread t2 = new Thread(f);

        t1.setName("rohit");
        t2.setName("vijay");

        t1.start();
        t2.start();
    }

}
