package be.demo.solid.interfacesegragation.solution;

import org.junit.jupiter.api.Test;

public class WorkStationTest {

    @Test
    public void operateHuman() {
        HumanWorker manager = new HumanWorker();

        WorkStation workStation = new WorkStation();

        workStation.operate(manager);
        workStation.feed(manager);
    }

    @Test
    public void operateRobot() {
        Robot robot = new Robot();

        WorkStation workStation = new WorkStation();

        workStation.operate(robot);
        //   workStation.feed(robot); // Error: Robot does not eat
    }
}
