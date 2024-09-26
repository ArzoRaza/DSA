interface Vehicle{
    void startEngine();
}

class Car implements Vehicle{
    @Override
    public void startEngine(){
        System.out.println("Car engine started");
    }
}

class Bike implements Vehicle{
    @Override
    public void startEngine(){
        System.out.println("Bike engine started");
    }
}

class Truck implements Vehicle{
    @Override
    public void startEngine(){
        System.out.println("Truck engine Started");
    }
}

class VehicleFactory{
    public static Vehicle getVehicle(String vehicleType){
        if (vehicleType == null){
            return null;
        }
        if(vehicleType.equalsIgnoreCase("CAR")) {
            return new Car();
        }else if(vehicleType.equalsIgnoreCase("BIKE")){
            return new Bike();
        }else if(vehicleType.equalsIgnoreCase("TRUCK")){
            return new Truck();
        }
        return null;
    }
}

public class Main{
    public static void main(String[] args) {

        Vehicle car = VehicleFactory.getVehicle("CAR");
        car.startEngine();

        Vehicle bike = VehicleFactory.getVehicle("BIKE");
            bike.startEngine();

        Vehicle truck = VehicleFactory.getVehicle("TRUCK");
            truck.startEngine();

    }
}