/**
 * @Author heyren
 * @Description //TODO
 * @Date 2019/7/10 1:51
 * @ClassName HelloFlowLayout
 * @Version 1.0
 **/

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class HelloFlowLayout {
    public static void main(String[] args){
        JFrame jf = new JFrame("Hello FlowLayout");
        jf.setLayout(new FlowLayout());
        for (int i=0;i<10;i++){
            jf.add(new JButton(i+""));
        }
        jf.setSize(640,200);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
