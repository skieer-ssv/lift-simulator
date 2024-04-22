package com.siddhantv;

import com.siddhantv.lift.ILiftService;
import com.siddhantv.lift.Lift;
import com.siddhantv.lift.LiftService;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Integer currentFloor=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to SSV Lift");

        ILiftService liftService = new LiftService();

        liftService.createALift();
        liftService.createALift();
        liftService.createALift();

        System.out.println("Lifts: "+ liftService.getLifts().toString());
        System.out.println("What is your current floor?");
        currentFloor= sc.nextInt();

        System.out.printf("Pressing the call Lift Button from floor [%d]",currentFloor);
        Lift arrivinglift = liftService.callLift(currentFloor);

        System.out.printf("Lift [%s] will be arriving to floor [%d]",arrivinglift,currentFloor);

        System.out.println("Please select the floor you want to go: ");

    }
}