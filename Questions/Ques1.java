public class Ques1{
    public static void main(String[] args) {
        
        thread1 obj1 = new thread1();
        thread2 obj2 = new thread2();
        thread3 obj3 = new thread3();

        obj3.setPriority(10);
        obj2.setPriority(1);
        obj1.setPriority(1);
        obj1.start();
        obj2.start();
        obj3.start();

    }
}

class thread1 extends Thread{
      public void run(){
        int i = 0;
        while(i<10){
             System.out.println("Good Morning");
             try{
                Thread.sleep(400);
             }catch(InterruptedException e){
                System.out.println(e);
             }
             i++;

        }
          
      }
}

class thread2 extends Thread{
    public void run(){
        int i = 0;
        while(i<10){
             System.out.println("Welcome");
             i++;
        }
          
      }

}

class thread3 extends Thread{
    public void run(){
        int i = 0;
        while(i<10){
             System.out.println("Welcome Home");
             i++;
        }
          
      }

}