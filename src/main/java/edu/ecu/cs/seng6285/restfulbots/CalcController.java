package edu.ecu.cs.seng6285.restfulbots;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
    private static String logClass = "CalcController";
    private Logger logger = LoggerFactory.getLogger(logClass);

    @GetMapping("/add")
    private String add(int n, int m) {
        logger.info(String.format("Adding %s and %s = %s ", n, m, n + m));
        return String.format("%s + %s = %s", n, m, n + m);
    }
    @GetMapping("/subtract")
    private String subtract(int n, int m) {
        logger.info(String.format("Subtracting %s and %s = %s ", n, m, n - m));
        return String.format("%s - %s = %s", n, m, n - m);
    }
    @GetMapping("/times")
    private String times(int n, int m) {
        logger.info(String.format("Multiplying %s and %s = %s ", n, m, n * m));
        return String.format("%s * %s = %s", n, m, n * m);
    }
    @GetMapping("/div")
    private String divide(int n, int m) {
        logger.info(String.format("Dividing %s and %s = %s ", n, m, n / m));
        return String.format("%s / %s = %s", n, m, n / m);
    }
    @GetMapping("/neg")
    private String negative(int n) {
        logger.info(String.format("Negative %s = %s ", n, -n));
        return String.format("Negative %s = %s ", n, n *= -1);
    }
}
