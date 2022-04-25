import java.util.Map;
import java.util.Collection;
public class Catalogue {

    /**
     * Constructor
     */
    public Catalogue(){

    }

    private static Map<Integer, String> filter = Map.of(
        0, "AtoZ",
        1, "ZtoA",
        2, "LowtoHigh",
        3, "HightoLow"
    );

    //public enum filter{
    //    AtoZ,
    //    ZtoA,
    //    LowtoHigh,
    //    HightoLow;
    //}

    public void setFilter(int type){
        if (filter.containsKey(type)) {
            System.out.println("Filter Type: " + filter.get(type));
        } else {
            System.out.println("Invalid Filter Type: " + type);
        }
    }

    public void remove(Product p){

    }

    public Product get(Product p){

        return p;
    }
}
