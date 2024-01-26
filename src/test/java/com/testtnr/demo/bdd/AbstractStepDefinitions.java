package com.testtnr.demo.bdd;

import com.testtnr.demo.TestTnrApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

/**
 * @author Severin Mbekou <mbekou99@gmail.com>
 */
@Slf4j
@SpringBootTest(classes = {TestTnrApplication.class})
@CucumberContextConfiguration
@TestPropertySource(locations = "classpath:test.properties")
public class AbstractStepDefinitions {}
