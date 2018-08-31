package com.afym.manual.doc02.controller;

import com.afym.manual.doc02.MathApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {
    @Autowired
    private MathApplicationService mathApplicationServiceV1;
    private MathApplicationService mathApplicationServiceV2;
    private MathApplicationService mathApplicationServiceV3;

    @Autowired
    public MathController(MathApplicationService mathApplicationServiceV3) {
        this.mathApplicationServiceV3 = mathApplicationServiceV3;
    }

    @Autowired
    public void setMathApplicationServiceV2(MathApplicationService mathApplicationServiceV2) {
        this.mathApplicationServiceV2 = mathApplicationServiceV2;
    }

    @RequestMapping("/doc02/math-controller-sum-v1")
    public double getSumV1() {
        return this.mathApplicationServiceV2.add(2.22d, 12.d, 1212.d, 1.d);
    }

    @RequestMapping("/doc02/math-controller-sum-v2")
    public double getSumV2() {
        return this.mathApplicationServiceV1.add(2.3d, 12.d, 1212.d, 1.d);
    }

    @RequestMapping("/doc02/math-controller-sum-v3")
    public double getSumV3() {
        return this.mathApplicationServiceV3.add(1.3d, 45.d, 1332.d, 1.d);
    }
}
