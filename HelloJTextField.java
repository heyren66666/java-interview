/**
 * @Author heyren
 * @Description //TODO
 * @Date 2019/7/9 22:40
 * @ClassName HelloJTextField
 * @Version 1.0
 **/

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class HelloJTextField {
    public static void main(String[] args){
        JFrame jf = new JFrame("Hello Text");
        jf.setLayout(new FlowLayout());
        JTextField jtf = new JTextField(10);
        jtf.setText("初始化内容");
        jf.add(jtf);
        showMe(jf);
    }

    private static void showMe(JFrame jf){
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(200,200);
        jf.setVisible(true);
    }

}
