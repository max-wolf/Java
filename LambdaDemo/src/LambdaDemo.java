import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class LambdaDemo {
    public static void main(String[] args) {
        String[] planets = new String[] {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        System.out.println(Arrays.toString(planets));
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));

        //lambda
        Arrays.sort(planets, (o1, o2) -> o1.length() - o2.length());

        //anonymous inner class
        /*Arrays.sort(planets, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });*/

        System.out.println(Arrays.toString(planets));

        //lambda
        Timer timer = new Timer(1000, event -> System.out.println("The time is " + new Date()));

        //anonymous inner class
        /*Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("The time is " + new Date());
            }
        });*/

        timer.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
