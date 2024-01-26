package com.testtnr.demo.bdd;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class ContextResetHook extends AbstractStepDefinitions {

  @Before
  public void before() {
    log.info("\nbefore--------------");
  }

  @After
  public void after() {
    log.info("\n-----------------after\n");
  }
}
