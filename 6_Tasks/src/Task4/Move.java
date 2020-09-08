package Task4;

public class Move extends Thread {
    @Override
    public void run() {

        while (true) {
            Ship ship = new Ship();

            if(Port.arrayBlockingQueue.size()!=5){

                try {
                    System.out.println("Корабль " + ship + " прибыл в порт");
                    Port.arrayBlockingQueue.put(ship);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else {
                System.out.println("порт полон!!!");
                try {
                    Thread.sleep(15000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        }
    }
}
