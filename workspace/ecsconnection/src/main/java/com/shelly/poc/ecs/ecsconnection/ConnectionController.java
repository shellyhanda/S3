package com.shelly.poc.ecs.ecsconnection;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConnectionController {

	 
    @RequestMapping("/hello")
    public String hello() {
    	try {
			S3AWSSample.main(null);
		} catch (Exception e) {
			System.out.println("Error inside the controller....hello..");
			e.printStackTrace();
		}
        return "hello";
    }
    @RequestMapping("/ecs")
    public String ecs() {
    	try {
			S3AWSDellECS.main(null);
		} catch (Exception e) {
			System.out.println("Error inside the controller....ecs..");
			e.printStackTrace();
		}
        return "ecs";
    }
    @RequestMapping("/jet")
    public String jetSet() {
    	try {
			Jets3tSample.main(null);
		} catch (Exception e) {
			System.out.println("Error inside the controller....jetSet");
			e.printStackTrace();
		}
        return "jetSet";
    }
}
