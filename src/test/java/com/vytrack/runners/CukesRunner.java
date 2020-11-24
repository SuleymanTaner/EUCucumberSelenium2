package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "com/vytrack/step_definitions",
        dryRun = false,
        tags = "@smoke"
        //REMOTE ONE ASDASDASDASASDASDASDASD
        //"@store_manager or @driver" iki tagdan hangisi varsa o caselari calistir
        // @driver and @VYT-123" eger bu iki tag ayni anda varsa o caselari calistir
        //"@login" tag "Feature" ifadesinin ustune konup calistirilirsa tum caselari calistiri
        // @wip => work in progress
        // tag isimlerini kendi is sirasina gore koy
        //"@login and not @wip" tum @login taglarini calistir ama @wip olani calistirma
        //"@login and not @wip and not @store_manager" tum @login taglarini calistir
        // ama @wip ve @store_manager olani calistirma
)
public class CukesRunner {

}


