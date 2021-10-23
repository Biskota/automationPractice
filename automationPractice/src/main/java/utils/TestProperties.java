package utils;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:test.properties")
public interface TestProperties extends Config {

    @Key("chromeDriverVersion")
    String chromeDriverVersion();

    @Key("baseURL")
    String baseURL();

    @Key("headless")
    Boolean headless();

    @Key("browserSize")
    String browserSize();
}
