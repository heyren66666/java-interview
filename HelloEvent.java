/**
 * @Author heyren
 * @Description //TODO
 * @Date 2019/7/9 23:55
 * @ClassName HelloEvent
 * @Version 1.0
 **/

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class HelloEvent {
    private static  JTextField text = new JTextField(10);
    public static void main(String[] args){
        JFrame jf = new JFrame("Hello Text");
        jf.setLayout(new FlowLayout());
        jf.add(text);
        JButton btn = new JButton("my button");
        jf.add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HelloEvent.text.setText("按钮被点击了");
            }
        });
        showMe(jf);
    }
    private static void showMe(JFrame jf){
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(200,200);
        jf.setVisible(true);
    }
}
