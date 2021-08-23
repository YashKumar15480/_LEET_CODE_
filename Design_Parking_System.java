class ParkingSystem {
    int[] parkingCount;

    public ParkingSystem(int big, int medium, int small) {
        this.parkingCount = new int[] { big, medium, small };
    }

    public boolean addCar(int carType) {
        return parkingCount[carType - 1]-- > 0;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small); boolean param_1 =
 * obj.addCar(carType);
 */
public class Design_Parking_System {
    public static void main(String[] args) {

    }
}
