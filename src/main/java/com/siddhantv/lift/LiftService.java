package com.siddhantv.lift;

import com.siddhantv.commons.Direction;

import java.util.ArrayList;
import java.util.List;

public class LiftService implements ILiftService{
private static Integer liftId=0;
  private List<Lift> lifts=new ArrayList<>();

    @Override
    public Lift callLift(Integer currentFloor) {
        int minFloorDifference=Integer.MAX_VALUE;
        Lift closestLift=null;
        for(Lift lift :lifts){
            if(minFloorDifference > Math.abs(lift.getCurrentFloor()-currentFloor)){
          closestLift=lift;
            }
        }
        if(closestLift!=null){

            closestLift.addTargetFloor(currentFloor);
            closestLift.setMoving(true);
        }
        return closestLift;
    }

    @Override
    public Lift goToFloor(Lift lift, Integer floor) {
        List<Integer> targetFloors = lift.getTargetFloors();
        //[3,5,7]
        if (!targetFloors.contains(floor)) {
            if(Direction.UP.equals(lift.getCurrentDirection()) ) {
                for (int i = 0; i < targetFloors.size(); i++) {
                    if (targetFloors.get(i) > floor) {
                        targetFloors.add(i, floor);
                    }
                }
            }
            else{
                for (int i = 0; i < targetFloors.size(); i++) {
                    if (targetFloors.get(i) < floor) {
                        targetFloors.add(i, floor);
                    }
                }
            }
        }
    return lift;
    }

    public List<Lift> getLifts() {
        return lifts;
    }

    @Override
    public Lift createALift() {
        liftId+=1;
        Lift newLift = new Lift(liftId,0);
        lifts.add(newLift);
        return newLift;
    }


}
