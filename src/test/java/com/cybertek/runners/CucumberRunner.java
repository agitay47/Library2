package com.cybertek.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
               // "rerun:target/rerun.txt",
                "json:target/cucumber.json",
                //"html:target/cucumber-report.html",
                "timeline:target/timeline-report"
        },
        features = {
                "src/test/resources/features"
        },
        glue = "com/cybertek/step_definitions",
        dryRun = false,
        tags = "",
        publish = true
)
public class CucumberRunner {
    //tags = "@s_o and @with_two_columns",
    // scenario must have BOTH tags
    //java logic if(@s_o && @with_two_columns)

    //tags = "@s_o or @with_two_columns",
    // scenario must have EITHER OR tags
    //java logic if(@s_o || @with_two_columns),
}