package com.sanu.system.design.elevator;

public class ElevatorRunner {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(0);

        Request upRequest = new Request(elevator.currentFloor,4,Direction.UP,Location.OUTSIDE_ELEVATOR);
        Request upRequest2 = new Request(elevator.currentFloor,5,Direction.UP,Location.INSIDE_ELEVATOR);

        elevator.sendUpRequest(upRequest);
        elevator.sendUpRequest(upRequest2);
        elevator.run();

    }
}
