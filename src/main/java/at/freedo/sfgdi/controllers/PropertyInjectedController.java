package at.freedo.sfgdi.controllers;

import at.freedo.sfgdi.services.GeetingService;

public class PropertyInjectedController {

    public GeetingService greetingService;

    public String getGreeting(){
        return greetingService.geet();
    }

}
