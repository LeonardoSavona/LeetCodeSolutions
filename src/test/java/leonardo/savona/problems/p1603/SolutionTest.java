package leonardo.savona.problems.p1603;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    @Test
    void addCar_bigCarFitsInBigSlot() {
        ParkingSystem ps = new ParkingSystem(1, 1, 1);
        assertTrue(ps.addCar(1));
    }

    @Test
    void addCar_bigSlotFullReturnsFalse() {
        ParkingSystem ps = new ParkingSystem(1, 0, 0);
        ps.addCar(1);
        assertFalse(ps.addCar(1));
    }

    @Test
    void addCar_mediumCarFitsInMediumSlot() {
        ParkingSystem ps = new ParkingSystem(0, 2, 0);
        assertTrue(ps.addCar(2));
        assertTrue(ps.addCar(2));
        assertFalse(ps.addCar(2));
    }

    @Test
    void addCar_smallCarFitsInSmallSlot() {
        ParkingSystem ps = new ParkingSystem(0, 0, 3);
        assertTrue(ps.addCar(3));
        assertTrue(ps.addCar(3));
        assertTrue(ps.addCar(3));
        assertFalse(ps.addCar(3));
    }

    @Test
    void addCar_zeroCapacityReturnsFalse() {
        ParkingSystem ps = new ParkingSystem(0, 0, 0);
        assertFalse(ps.addCar(1));
        assertFalse(ps.addCar(2));
        assertFalse(ps.addCar(3));
    }

    @Test
    void addCar_mixedTypesRespectIndividualCapacities() {
        ParkingSystem ps = new ParkingSystem(1, 1, 1);
        assertTrue(ps.addCar(1));
        assertTrue(ps.addCar(2));
        assertTrue(ps.addCar(3));
        assertFalse(ps.addCar(1));
        assertFalse(ps.addCar(2));
        assertFalse(ps.addCar(3));
    }
}
