package Task4;

public class Dock implements Runnable{

    Ship ship=null;

    @Override
    public void run() {

        System.out.println("Док " + Thread.currentThread().getName() + " активирован");

        while (true){
            try {
                ship=Port.arrayBlockingQueue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(ship.amountOfCargo==0){
                System.out.println("корабль пустой,началась загрузка " + ship);
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ship.amountOfCargo+=10;

                System.out.println("корабль загружен " + ship);
            }
            else {
                System.out.println("корабль полон,началась разгрузка " + ship);
                try {
                    Thread.sleep(12000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ship.amountOfCargo -= 10;

                System.out.println("корабль разгружен " + ship);
            }


        }


    }
}
