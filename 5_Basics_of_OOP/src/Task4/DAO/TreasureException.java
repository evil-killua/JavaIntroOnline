package Task4.DAO;

import java.io.Serializable;


public class TreasureException extends Exception {

//    private static final long serialVersionUID = 8513819558689466738L;

    public TreasureException(){

    }

    public TreasureException(String message) {
        super(message);
    }

    public TreasureException(Exception e) {
        super(e);
    }
}
