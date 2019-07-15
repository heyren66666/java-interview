/**
 * @Author heyren
 * @Description //TODO
 * @Date 2019/7/9 22:49
 * @ClassName HelloJTextArea
 * @Version 1.0
 **/

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;
public class HelloJTextArea {
    public static void main(String[] args){
        JFrame jf = new JFrame("Hello Text");
        jf.setLayout(new FlowLayout());
        JTextArea jta = new JTextArea(5,10);
        jta.setText("初始化内容");
        jf.add(jta);
        showMe(jf);
    }

    public static void showMe(JFrame jf){
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(200,200);
        jf.setVisible(true);
    }
}
