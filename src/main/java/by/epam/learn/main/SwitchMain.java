package by.epam.learn.main;

import by.epam.learn.entity.SwitchTest;

public class SwitchMain {
    public static void main(String[] args) {
        SwitchTest st = new SwitchTest();
        int level = st.defineLevel("clientur");
        System.out.println("level = " + level);
    }
}
