package Homework2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    private Car car;
    private  Motorcycle moto;

    @BeforeEach
    void init() {
        car = new Car("Koenigsegg", "Agera", 2023);
        moto = new Motorcycle("Kawasaki", "h2r", 2022);

    }

    // Проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    @Test
    void instanceOf() {
        assertTrue(car instanceof Vehicle);
    }

    //Проверить, что объект Car создается с 4-мя колесами.
    @Test
    void WheelsCar() {
        assertEquals(4, car.getNumWheels());
    }

    //Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    void MotorcycleWheels() {
        assertEquals(2, moto.getNumWheels());
    }

    //Проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    void testDriveCar() {
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    //Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения
    //(используя метод testDrive()).
    @Test
    void testDriveMotorcycle() {
        moto.testDrive();
        assertEquals(75, moto.getSpeed());
    }

    //Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения
    //транспорта) машина останавливается (speed = 0)
    @Test
    void testSpeedInParkCar() {
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    //Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения
    //транспорта) мотоцикл останавливается (speed = 0).
    @Test
    void testSpeedInParkMoto() {
        moto.testDrive();
        moto.park();
        assertEquals(0, moto.getSpeed());
    }

    //- проверить, что в режиме парковки (сначала testDrive, потом park
    // т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    @Test
    void parkMotorcycle() {
        Car car = null;
        assertThrows(NullPointerException.class, () -> car.testDrive(),
                "Can`t do testDrive without car initializing");
    }
}