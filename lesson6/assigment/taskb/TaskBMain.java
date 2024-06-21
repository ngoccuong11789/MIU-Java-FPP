package lesson6.assigment.taskb;

//import lesson6.assignment.taska.DeptEmployee;
//import lesson6.assignment.taska.NameComparator;

import lesson6.assignment.taska.NameComparator;

import java.util.Arrays;
import java.util.Comparator;

public class TaskBMain {

    private class NameComparator implements Comparator<DeptEmployee> {

        @Override
        public int compare(DeptEmployee o1, DeptEmployee o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
    private NameComparator getNameComparator() { return new NameComparator();}


    public static void main(String[] args) {
        DeptEmployee[] data = DeptEmployeeData.getDeptData();
        TaskBMain taskBMain = new TaskBMain();

        System.out.println("Before sorting :");
        for(int i = 0; i < data.length; i++) {
            System.out.println(data[i].getName());
        }

        Arrays.sort(data, taskBMain.getNameComparator());
        //Arrays.sort(data, new NameComparator());
        System.out.println("After sorting");
        for(int i = 0; i < data.length; i++) {
            System.out.println(data[i].getName());
        }

    }
}
