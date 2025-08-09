package org.example;
import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception{

        int screenWidth = 900;
        int screenHeight = 900;

        JFrame frame = new JFrame();
        frame.setSize(screenWidth,screenHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Saving saving = new Saving(screenWidth,screenHeight);
        frame.add(saving);

        frame.setVisible(true);

        




    }
}