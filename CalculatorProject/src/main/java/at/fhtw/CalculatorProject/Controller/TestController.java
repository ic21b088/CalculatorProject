package at.fhtw.CalculatorProject.Controller;

import at.fhtw.CalculatorProject.Service.TestService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final TestService service;

    public TestController(TestService service) {
        this.service = service;
    }

    @PostMapping("/Square/{number}")
    public Long getSquare(@PathVariable Long number)
    {
        return service.getSquare(number);
    }
}
