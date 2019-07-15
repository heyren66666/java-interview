/**
 * @Author heyren
 * @Description //TODO
 * @Date 2019/7/9 1:01
 * @ClassName HelloJFrame
 * @Version 1.0
 **/

import javax.swing.*;
import java.awt.*;

public class HelloJFrame {

    public static void main(String[] args){
        JFrame jf = new JFrame("hello swing");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(200,200);
        jf.setVisible(true);
        jf.setLayout(new FlowLayout());
        JLabel label = new JLabel( );
        label.setText("Hello this is one lable");
        jf.add(label);
        JButton btn = new JButton("MY BUTTON");
        jf.add(btn);
    }

}
