package radio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * @ClassName RadioButtonFrame
 * @Description TODO
 * @Author ztc
 * @Date 2024/11/15 15:51
 */
public class RadioButtonFrame extends JFrame {
    private JPanel buttonPanel;
    private ButtonGroup group;
    private JLabel label;
    private static final int DEFAULT_SIZE = 36;

    public RadioButtonFrame()  {
        //添加标签
        label = new JLabel("The quick brown fox jumps over the lazy dog.");
        label.setFont(new Font("Serif",Font.BOLD,DEFAULT_SIZE));
        add(label,BorderLayout.CENTER);

        //添加单选框
        buttonPanel =  new JPanel();
        group = new ButtonGroup();
        addRadioButton("a",4);
        addRadioButton("b",8);
        addRadioButton("c",16);
        addRadioButton("d",32);
        addRadioButton("e",36);
        add(buttonPanel,BorderLayout.SOUTH);
        pack();
    }

    private void addRadioButton(String name, int size){
        boolean selected = size == DEFAULT_SIZE;
        JRadioButton radioButton = new JRadioButton(name, selected);
        group.add(radioButton);
        buttonPanel.add(radioButton);
        ActionListener listener = e -> {
          label.setFont(new Font("Serif",Font.PLAIN,size));
        };
        radioButton.addActionListener(listener);
    }
}
