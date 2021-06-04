package CloudControl.ChangeCalculator.model;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Change {
    private final int dollarVal;
    private final int centVal;

    public Change(int dollarVal, int centVal ){
        this.dollarVal = dollarVal;
        this.centVal = centVal;
    }


    public int getDollarVal(){
        return dollarVal;
    }

    public int getCentVal(){
        return centVal;
    }
}
