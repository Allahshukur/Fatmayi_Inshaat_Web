package build.tools.Fatmayi_inshaat_web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/documents")
    public String documents(){
        return "documents";
    }

    @RequestMapping("/list")
    public String questionnaire(){
        return "tableToolList";
    }

    @RequestMapping("/customers")
    public String tableCustomerAndFactory(){
        return "tableCustomerList";
    }

    @RequestMapping("/accounts")
    public String accounts(){
        return "accounts";
    }
}
