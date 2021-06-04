package CloudControl.ChangeCalculator.dao;
import CloudControl.ChangeCalculator.model.Change;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.ArrayList;


@Repository("ChangeDao")
public class ChangeDataAccessService implements ChangeDao{

    private static List<Change> DB = new ArrayList<>();
    
    @Override
    public int calculation(Change change){
        DB.add(new Change(change.getDollarVal(), change.getCentVal()));
        return 1;
    }
}
