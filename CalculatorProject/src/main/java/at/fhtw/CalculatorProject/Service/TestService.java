package at.fhtw.CalculatorProject.Service;

import org.springframework.stereotype.Service;

@Service
public class TestService {


    public Long getSquare(long number)
    {
        return number * number;
    }
}
 
