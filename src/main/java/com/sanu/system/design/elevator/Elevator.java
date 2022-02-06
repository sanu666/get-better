package com.sanu.system.design.elevator;

import java.util.PriorityQueue;

public class Elevator {

    int currentFloor;
    Direction currentDirection;

    PriorityQueue<Request> upQueue;
    PriorityQueue<Request> downQueue;


    public Elevator(int currentFloor){
        this.currentFloor = currentFloor;
        this.currentDirection = Direction.IDLE;

        upQueue = new PriorityQueue<>((a,b)->a.destinationFloor-b.destinationFloor);
        downQueue = new PriorityQueue<>((a,b)->b.destinationFloor-a.destinationFloor);

    }

    public void sendUpRequest(Request upRequest){

        if(upRequest.location==Location.OUTSIDE_ELEVATOR){
            upQueue.offer(new Request(upRequest.currentFloor,upRequest.currentFloor,Direction.UP,Location.OUTSIDE_ELEVATOR));
            System.out.println("Append Request to Going Floor: "+upRequest.currentFloor+"->");
        }
        upQueue.offer(upRequest);
        System.out.println("Append Request to Going Floor: "+upRequest.destinationFloor);
    }

    public void sendDownRequest(Request downRequest){

        if(downRequest.location==Location.OUTSIDE_ELEVATOR){
            downQueue.offer(new Request(downRequest.currentFloor,downRequest.currentFloor,Direction.DOWN,Location.OUTSIDE_ELEVATOR));
            System.out.println("Append Request to Going Floor: "+downRequest.currentFloor+"->");
        }
        downQueue.offer(downRequest);
        System.out.println("Append Request to Going Floor: "+downRequest.destinationFloor);
    }

    public void run(){
        while(!upQueue.isEmpty() || !downQueue.isEmpty()){
           processRequests();
        }
        System.out.println("Finished All Requests");
        this.currentDirection=Direction.IDLE;
    }

    private void processRequests() {

        if(this.currentDirection==Direction.IDLE || this.currentDirection==Direction.UP){
            processUpRequests();
            processDownRequests();
        } else {
            processDownRequests();
            processUpRequests();
        }

    }

    private void processDownRequests() {
        while (!downQueue.isEmpty()){
            Request downRequest = downQueue.poll();
            //move elevator down
            this.currentFloor = downRequest.destinationFloor;
            System.out.println("Processing Down Requests, Elevator Stopped at: "+this.currentFloor);
        }
        if(!upQueue.isEmpty()){
            this.currentDirection=Direction.UP;
        } else{
            this.currentDirection=Direction.IDLE;
        }

    }

    private void processUpRequests() {
        while (!upQueue.isEmpty()){
            Request upRequest = upQueue.poll();
            //move elevator
            this.currentFloor=upRequest.destinationFloor;
            System.out.println("Processing Up Requests, Elevator stopped at: "+ this.currentFloor);
        }
        if(!downQueue.isEmpty()){
            this.currentDirection=Direction.DOWN;
        } else {
            this.currentDirection=Direction.UP;
        }

    }


}
