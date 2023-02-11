package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        super.setName(name);
        super.setManual(isManual);
        //Use arbitrary values for parameters which are not mentioned
    }
    public int getCurrentDirection(){
        return super.getCurrentDirection();
    }
    public int getCurrentSpeed(){
        return super.getCurrentSpeed();
    }
    public void accelerate(int rate){
        int newSpeed = getCurrentSpeed()+rate; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed == 0) {
            super.stop();
            super.setCurrentGear(1);
            //Stop the car, set gear as 1
        }
        //for all other cases, change the gear accordingly

        if(newSpeed > 0) {
           super.changeSpeed(newSpeed, getCurrentDirection());
           if(newSpeed >=1 && newSpeed <= 50) super.setCurrentGear(1);
           else if(newSpeed>=51 && newSpeed <= 100) super.setCurrentGear(2);
           else if(newSpeed >= 101 && newSpeed <=150) super.setCurrentGear(3);
           else if(newSpeed >= 151 && newSpeed <= 200) super.setCurrentGear(4);
           else if(newSpeed >= 201 && newSpeed <= 250) super.setCurrentGear(5);
           else super.setCurrentGear(6);
        }
    }
    public void move(int speed,int direction){
        super.setCurrentSpeed(speed);
        super.setCurrentDirection(direction);
    }
}
