package workshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/workshop")
public class WorkshopController {

    @Autowired
    private WorkshopRepository repository;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/message")
    public List<Workshop> getMessage() {
        return repository.findAll();
    }
}
