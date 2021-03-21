package by.issoft.tempapp.webchild.controller;

import java.net.InetAddress;
import java.util.UUID;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class ChildController {

    @GetMapping("/child-msg")
    public String getMsg(){
        return String.format("Message from child ip: %s and UUID: %s", getIp(), UUID.randomUUID());
    }

    private String getIp(){
        try{
            return InetAddress.getLocalHost().getHostAddress();
        }catch (Exception e){
            return "UNKNOWN";
        }
    }
}
