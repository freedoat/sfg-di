package at.freedo.sfgdi.controllers;

import at.freedo.sfgdi.services.GeetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    private ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GeetingServiceImpl());

    }

    @Test
    void greetings() {
        System.out.println(controller.greetings());
    }
}