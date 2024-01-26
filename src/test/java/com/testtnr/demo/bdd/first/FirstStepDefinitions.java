package com.testtnr.demo.bdd.first;

import com.testtnr.demo.bdd.AbstractStepDefinitions;
import io.cucumber.java.en.And;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Severin Mbekou <mbekou99@gmail.com>
 */
public class FirstStepDefinitions extends AbstractStepDefinitions {
  @And("the client receives first version {string}")
  public void theClientReceivesFirstVersion(String arg0) {
    assertThat(arg0).isNotNull();
  }
}
