package com.testtnr.demo.bdd;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Severin Mbekou <mbekou99@gmail.com>
 */
public class OtherStepDefinitions extends AbstractStepDefinitions {
  @When("the client calls version")
  public void theClientCallsVersion() {}

  @Then("the client receives status code of {string}")
  public void theClientReceivesStatusCodeOf(String arg0) {
    assertThat(arg0).isNotNull();
  }

  @And("the client receives server version {string}")
  public void theClientReceivesServerVersion(String arg0) {

  }
}
