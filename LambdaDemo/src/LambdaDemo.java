import javax.swing.*;
import java.util.Arrays;
import java.util.Date;

public class LambdaDemo {
    public static void main(String[] args) {
        String[] planets = new String[] {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        System.out.println(Arrays.toString(planets));
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));

        Timer timer = new Timer(1000, event -> System.out.println("The time is " + new Date()));
        timer.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
