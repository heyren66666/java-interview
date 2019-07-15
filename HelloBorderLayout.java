/**
 * @Author heyren
 * @Description //TODO
 * @Date 2019/7/10 0:21
 * @ClassName HelloBorderLayout
 * @Version 1.0
 **/

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class HelloBorderLayout {
    public static void main(String[] args){
        JFrame jf = new JFrame("BorderLayout test");
        jf.setLayout(new BorderLayout());
        jf.add(new JButton("east"),BorderLayout.EAST);
        jf.add(new JButton("center"),BorderLayout.CENTER);
        jf.add(new JButton("south"),BorderLayout.SOUTH);
        jf.add(new JButton("north"),BorderLayout.NORTH);
        jf.add(new JButton("west"),BorderLayout.WEST);

        jf.setSize(300,200);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
