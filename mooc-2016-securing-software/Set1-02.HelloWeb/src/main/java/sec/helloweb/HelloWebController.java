package sec.helloweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWebController {

   
    
    @RequestMapping("/greet")
    @ResponseBody
    public String greet(@RequestParam String user) {
        return "Hi " + user + ", how are you, and why are u so cute?";
    }
}
