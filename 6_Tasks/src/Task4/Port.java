package Task4;

import java.util.concurrent.*;

public class Port {

    static ArrayBlockingQueue<Ship> arrayBlockingQueue = new ArrayBlockingQueue<Ship>(5);

    public Port(){

        ExecutorService executorService= Executors.newFixedThreadPool(3);
        for(int i=0;i<2;i++){
            executorService.submit(new Dock());
        }
        executorService.submit(new Move());

    }


}
