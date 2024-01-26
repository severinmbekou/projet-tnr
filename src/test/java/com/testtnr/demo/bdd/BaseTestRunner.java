package com.testtnr.demo.bdd;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * @author Severin Mbekou <mbekou99@gmail.com>
 */
@RunWith(Cucumber.class)
@CucumberOptions(
    glue = {"com.testtnr.demo.bdd"},
    plugin = {"pretty", "json:target/cucumber-reports/cucumber.json"})
public class BaseTestRunner {
  private void run() {
    //    Strings.isNotBlank()
  }
}
