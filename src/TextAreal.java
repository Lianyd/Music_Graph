import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreal implements ActionListener {
    JTextArea text;

    public static void main (String[] args){
        TextAreal gui = new TextAreal();
        gui.go();
    }

    public void go(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JButton button = new JButton("Just Click It");
        button.addActionListener(this);
        text = new JTextArea(10,20); //设置行数，宽度
        text.setLineWrap(true); // 启动自动换行

        JScrollPane scroller = new JScrollPane(text); // 设置滚动条，将文本框设置在滚动条上
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS); // 开启垂直滚动
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER); // 关闭水滚动

        panel.add(scroller); // 将滚动条设置在面板上

        frame.getContentPane().add(BorderLayout.CENTER,panel);
        frame.getContentPane().add(BorderLayout.SOUTH,button);
        frame.setSize(350,300);
        frame.setVisible(true);
    }

    public void actionPerformed (ActionEvent ev){
        text.append("button clicked \n");
    }
}
