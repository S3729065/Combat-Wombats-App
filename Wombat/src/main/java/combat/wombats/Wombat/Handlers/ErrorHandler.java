package combat.wombats.Wombat.Handlers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorHandler implements ErrorController {
    @RequestMapping(value = "/error")
    public String error() {
        return "\"/error\"";
    }

    public String getErrorPath() {
        return "/error";
    }
}

