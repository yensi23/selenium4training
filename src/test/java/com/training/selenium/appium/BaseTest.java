package com.training.selenium.appium;

import io.appium.java_client.service.local.AppiumDriverLocalService;

import java.io.IOException;
import java.net.URL;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public abstract class BaseTest {

    private static AppiumDriverLocalService service;

    @BeforeAll
    public void globalSetup () throws IOException {
        service = AppiumDriverLocalService.buildDefaultService();
        service.start();
    }

    @AfterAll
    public void globalTearDown () {
        if (service != null) {
            service.stop();
        }
    }

    public static URL getServiceUrl () {
        return service.getUrl();
    }

}