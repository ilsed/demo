package be.demo.solid.interfacesegregation.step1;

import org.junit.jupiter.api.Test;

public class WorkStationTest {

    @Test
    public void operateHuman() {
        HumanWorker manager = new HumanWorker();

        WorkStation workStation = new WorkStation();

        workStation.operate(manager);
    }

    @Test
    public void operateRobot() {
        Robot robot = new Robot();

        WorkStation workStation = new WorkStation();

        workStation.operate(robot); // Violation: Robot is forced to implement eat, which it doesn't need.
    }
}
