package com.afym.manual.doc02;

import org.springframework.stereotype.Service;

@Service
// by the default the name of the service is : mathApplicationService
// rename the default name : @Service("mathApplicationServiceV1")
public class MathApplicationService implements MathService {
    @Override
    public double add(double... numbers) {
        double result = 0.0d;
        if (numbers.length > 0) {
            for (double number : numbers) {
                result += number;
            }
        }

        return result;
    }
}
