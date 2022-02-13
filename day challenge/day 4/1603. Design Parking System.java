class ParkingSystem {
private int big;

private int medium;

private int small;

    public ParkingSystem(int big, int medium, int small) {
        
        this.big = big;
    this.medium = medium;
    this.small = small;
    }
    
    public boolean addCar(int carType) {
         switch (carType) {
    case 1:
        this.big -= 1;
        return this.big > -1;
    case 2:
        this.medium -= 1;
        return this.medium > -1;
    case 3:
        this.small -= 1;
        return this.small > -1;
    default:
        return false; 
    }
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */