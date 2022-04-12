package com.tryCloud.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/tryCloud/step_definition",
        plugin = {"pretty", "html:target/cucumber.html"
        } ,
        dryRun = true,
        publish = true,
        tags = "wip"
)
public class CukesRunner {
}
