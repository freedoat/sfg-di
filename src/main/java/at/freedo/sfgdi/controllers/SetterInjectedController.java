package at.freedo.sfgdi.controllers;

import at.freedo.sfgdi.services.GeetingService;

public class SetterInjectedController {

    private GeetingService geetingService;

    public void setGeetingService(GeetingService geetingService) {
        this.geetingService = geetingService;
    }

    public String geet(){
        return geetingService.geet();
    }


}
