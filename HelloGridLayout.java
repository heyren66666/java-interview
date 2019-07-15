/**
 * @Author heyren
 * @Description //TODO
 * @Date 2019/7/10 1:58
 * @ClassName HelloGridLayout
 * @Version 1.0
 **/
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
public class HelloGridLayout {
    public static void main(String[] args){
        JFrame jf = new JFrame("GridLayout test");
        GridLayout grid = new GridLayout(10,10);
        jf.setLayout(grid);
        for (int i=0;i<100;i++){
            jf.add(new JButton(""+i));
        }
        jf.setSize(640,480);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
