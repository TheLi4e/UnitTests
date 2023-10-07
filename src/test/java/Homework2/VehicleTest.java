package Homework2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class VehicleTest {
    private static Car car;
    private static Motorcycle motorcycle;

    VehicleTest() {
    }

    @BeforeAll
    public static void createObjets() {
        car = new Car("Porshe", "911", 2023);
        motorcycle = new Motorcycle("Kawasaki", "Ninja H2R", 2023);
    }

    @Test
    public void carIsVehicle() {
        Assertions.assertTrue(car instanceof Vehicle);
    }

    @Test
    public void carHave4Wheels() {
        int expectedWheels = 4;
        int currentWheels = car.getNumWheels();
        Assertions.assertEquals(expectedWheels, currentWheels, "У машины должно быть 4 колеса");
    }

    @Test
    public void motoHave2Wheels() {
        int expectedWheels = 2;
        int currentWheels = motorcycle.getNumWheels();
        Assertions.assertEquals(expectedWheels, currentWheels, "У мотоцикла должно быть 2 колеса");
    }

    @Test
    public void carSpeedIs60() {
        int expectedSpeed = 60;
        car.testDrive();
        int currentSpeed = car.getSpeed();
        Assertions.assertEquals(expectedSpeed, currentSpeed, "Машина должна ехать со скоростью 60");
    }

    @Test
    public void motoSpeedIs75() {
        int expectedSpeed = 75;
        motorcycle.testDrive();
        int currentSpeed = motorcycle.getSpeed();
        Assertions.assertEquals(expectedSpeed, currentSpeed, "Мотоцикл должен ехать со скоростью 75");
    }

    @Test
    public void carParkSpeedIs0() {
        int expectedSpeed = 0;
        car.testDrive();
        car.park();
        int currentSpeed = car.getSpeed();
        Assertions.assertEquals(expectedSpeed, currentSpeed, "Машина должна иметь скорость 0");
    }

    @Test
    public void motoSpeedIs0() {
        int expectedSpeed = 0;
        motorcycle.testDrive();
        motorcycle.park();
        int currentSpeed = motorcycle.getSpeed();
        Assertions.assertEquals(expectedSpeed, currentSpeed, "Мотоцикл должен иметь скорость 0");
    }
}