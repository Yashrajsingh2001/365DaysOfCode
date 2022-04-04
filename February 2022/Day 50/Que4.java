// Que link: https://leetcode.com/problems/design-parking-system/
// 1603. Design Parking System


class ParkingSystem {
    int[] arr;
    public ParkingSystem(int big, int medium, int small) {
        arr = new int[]{big, medium, small};
    }
    
    public boolean addCar(int carType) {
        return arr[carType-1]-- >0;
    }
}