package at.freedo.sfgdi.controllers;

import at.freedo.sfgdi.services.GeetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {
    SetterInjectedController setterInjectedController;
    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGeetingService(new GeetingServiceImpl());
    }

    @Test
    void geet() {
        System.out.println(setterInjectedController.geet());
    }
}