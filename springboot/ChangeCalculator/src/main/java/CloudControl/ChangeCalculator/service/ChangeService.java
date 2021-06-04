package CloudControl.ChangeCalculator.service;
import CloudControl.ChangeCalculator.dao.ChangeDao;
import CloudControl.ChangeCalculator.model.Change;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ChangeService {
    private final ChangeDao changeDao;
    @Autowired
    public ChangeService(@Qualifier("changeDao") ChangeDao changeDao){
        this.changeDao = changeDao;
    }
}
