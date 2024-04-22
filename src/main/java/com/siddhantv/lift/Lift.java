package com.siddhantv.lift;

import com.siddhantv.building.Building;
import com.siddhantv.commons.Direction;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lift {
    private Integer id;
    private Integer currentFloor;

    private Direction currentDirection;
    private boolean moving;
    private Queue<Integer> targetFloors = new PriorityQueue<>();
    Building building;

    public Lift(Integer id, Integer currentFloor) {
        this.id = id;
        this.currentFloor = currentFloor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(Integer currentFloor) {
        this.currentFloor = currentFloor;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(Direction currentDirection) {
        this.currentDirection = currentDirection;
    }

    public boolean isMoving() {
        return moving;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public List<Integer> getTargetFloors() {
        return targetFloors.stream().toList();
    }
    public void addTargetFloor(Integer targetFloor){
        this.targetFloors.add(targetFloor);
    }
    public void removeTargetFloor(Integer targetFloor){
        this.targetFloors.remove(targetFloor);
    }

    @Override
    public String toString() {
        return "Lift{" +
                "id=" + id +
                ", currentFloor=" + currentFloor +
                ", targetFloors=" + targetFloors +
                '}';
    }
}
