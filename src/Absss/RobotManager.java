package Absss;

import qwerty.RobotFrame;

import javax.swing.*;

public class RobotManager {
    public static void main (String[] args) {
        final int COUNT = 4;

        final int SIDE = 100;

        Robot robot = new Robot(200,50);

        SimpleRobotListener srl = new SimpleRobotListener();
        robot.setListener(srl);

        for (int i=0; i<COUNT;i++){
            robot.forward(SIDE);
            robot.setCourse(robot.getCourse()+360/COUNT);
        }

        RobotFrame rf = new RobotFrame(robot);
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rf.setVisible(true);
    }
}
