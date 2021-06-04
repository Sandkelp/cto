package CloudControl.ChangeCalculator.api;
import CloudControl.ChangeCalculator.model.Change;
import CloudControl.ChangeCalculator.service.ChangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;





@RestController
@RequestMapping("api/v1/change")
public class ChangeController {
    private final ChangeService changeService;
    @Autowired
    public ChangeController(ChangeService changeService){
        this.changeService = changeService;
    }
}
