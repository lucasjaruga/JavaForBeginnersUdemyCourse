package com.udayan.lec05.sol3;

public class Test {
	
    enum TrafficLight {
        private String message;
        GREEN("go"), AMBER("slow"), RED("stop");
        
        TrafficLight(String message) {
            this.message = message;
        }
        
        public String getMessage() {
            return message;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(TrafficLight.AMBER.getMessage().toUpperCase());
    }
}
