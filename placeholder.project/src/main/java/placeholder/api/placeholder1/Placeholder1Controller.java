package placeholder.api.placeholder1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Placeholder1Controller {

    @RequestMapping("/")
    public String index() {
        return "Greetings";
    }

}
