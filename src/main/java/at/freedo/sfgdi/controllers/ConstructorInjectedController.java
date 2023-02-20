package at.freedo.sfgdi.controllers;

import at.freedo.sfgdi.services.GeetingServiceImpl;

public class ConstructorInjectedController {

    private final GeetingServiceImpl geetingService;


    public ConstructorInjectedController(GeetingServiceImpl geetingService) {
        this.geetingService = geetingService;
    }

    public String greetings(){
        return geetingService.geet()+"__constructorInjectedController";
    }
}
