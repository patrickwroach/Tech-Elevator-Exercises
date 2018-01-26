package com.techelevator;

//## Elevator
//
//        ### Data Members
//
//        | Attribute | Data Type | Get | Set | Description |
//        |----------|-----------|-----|-----|-------------|
//        | currentFloor | int | X | | The current floor that the elevator is on.  |
//        | numberOfFloors | int | X |  | The number of floors available to the elevator. |
//        | doorOpen | boolean | X | | Whether the elevator door is open or not. |
//
//
//
//
//        ### Constructor
//
//        The `Elevator` class has a single constructor that takes one argument. New elevators start on floor 1.
//
//        Elevator(int totalNumberOffloors)
//
//        - `totalNumberOfFloors` indicates how many floors are available to the elevator
//
//        ### Methods
//
//        void openDoor()
//        void closeDoor()
//        void goUp(int desiredFloor)
//        void goDown(int desiredFloor)
//
//        **Notes**
//        - `openDoor()` opens the elevator door.
//        - `closeDoor()` closes the elevator door.
//        - `goUp(int desiredFloor)` sends the elevator upward to the desired floor as long as the door is not open. Cannot go past last floor.
//        - `goDown(int desiredFloor)` sends the elevator downward to the desired floor as long as the door is not open. Cannot go past floor 1.
//

public class Elevator {
    private int currentFloor = 1;
    private int numberOfFloors;
    private boolean doorOpen;

    public Elevator(int totalNumberOfFloors) {
        this.numberOfFloors = totalNumberOfFloors;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }

    public void openDoor() {
        doorOpen = true;
    }

    public void closeDoor() {
        doorOpen = false;
    }

    public void goUp(int desiredFloor) {
        if (!doorOpen) {
            if (desiredFloor <= numberOfFloors && desiredFloor > currentFloor) currentFloor = desiredFloor;

        }

    }

    public void goDown(int desiredFloor) {
        if (!doorOpen) {
            if (desiredFloor >=1 && desiredFloor < currentFloor) currentFloor = desiredFloor;

        }

    }
}
