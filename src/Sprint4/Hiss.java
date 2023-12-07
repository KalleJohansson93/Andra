package Sprint4;

public class Hiss { //Kalle

    private int maxWeight;
    private int grossWeight;
    private int loadWeight;
    private int currentFloor;
    private int destinationFloor;

    public Hiss() {
    }

    public Hiss(int maxWeight, int grossWeight, int loadWeight, int currentFloor, int destinationFloor, int depth, int height, int width) {
        this.maxWeight = maxWeight;
        this.grossWeight = grossWeight;
        this.loadWeight = loadWeight;
        this.currentFloor = currentFloor;
        this.destinationFloor = destinationFloor;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    private int depth;
    private int height;
    private int width;


    public void changeFloor(int floor) {
        currentFloor = destinationFloor;
    }

    public int getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(int grossWeight) {
        this.grossWeight = grossWeight;
    }

    public int getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(int loadWeight) {
        this.loadWeight = loadWeight;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getDestinationFloor() {
        return destinationFloor;
    }

    public void setDestinationFloor(int destinationFloor) {
        this.destinationFloor = destinationFloor;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
}
