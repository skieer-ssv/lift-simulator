package com.siddhantv.lift;

import java.util.List;

public interface ILiftService {
    Lift callLift(Integer currentFloor);

    Lift goToFloor(Lift lift,Integer floor);

    Lift createALift();
    List<Lift> getLifts();
}
