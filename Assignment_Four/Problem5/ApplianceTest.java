package lesson5.Problem5.nonOO.ToOO;

//import lesson5.Problem5.nonOO.Microwave;
//import lesson5.Problem5.nonOO.Refrigerator;
//import lesson5.Problem5.nonOO.WashingMachine;

import lesson5.Folderclosedcurvegood.ClosedCurve;

public class ApplianceTest {
    public static void main(String[] args) {


        ClosedMachine washingMachine = new WashingMachine(7);

        ClosedMachine[] closeMachine = new ClosedMachine[3];
        System.out.println(closeMachine.length);

        ClosedMachine[] obj = {
                new AirCondition("Hitachi"),
                new Microware(10),
                new Refrigerator(20),
                new WashingMachine(30),
        };

        for (ClosedMachine c : obj) {
            System.out.println(c.getClass().getSimpleName());
            c.performFunction();
        }


    }

}
