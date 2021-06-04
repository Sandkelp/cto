package CloudControl.ChangeCalculator.dao;


import CloudControl.ChangeCalculator.model.Change;

public interface ChangeDao {
    int calculation(int dollarVal, Change change);
    
    default int calculation(Change change){
        int dollarVal = change.getDollarVal()
        return calculation(dollarVal, change);
    }
}
