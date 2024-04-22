package com.siddhantv.building;

public class Building {
    private Integer id;
    private Integer totalFloors;

    private Integer totalLifts;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTotalFloors() {
        return totalFloors;
    }

    public void setTotalFloors(Integer totalFloors) {
        this.totalFloors = totalFloors;
    }

    public Integer getTotalLifts() {
        return totalLifts;
    }

    public void setTotalLifts(Integer totalLifts) {
        this.totalLifts = totalLifts;
    }
}
