package check;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * @ClassName CheckBoxFramw
 * @Description TODO
 * @Author ztc
 * @Date 2024/11/13 10:57
 */
public class CheckBoxFrame extends JFrame {
    private JLabel label;
    private JCheckBox bold;
    private JCheckBox italic;
    private static final int FONTSIZE = 24;

    public CheckBoxFrame()  {

        //添加标签
        label = new JLabel("The quick brown fox jumps over the lazy dog.");
        label.setFont(new Font("Serif",Font.BOLD,FONTSIZE));
        add(label,BorderLayout.CENTER);

        // 监听器的匿名内部内(使用lambda表达式)
        ActionListener listener = event ->{
            int mode = 0;
            if(bold.isSelected()){
                mode += Font.BOLD;
            }
            if(italic.isSelected()){
                mode += Font.ITALIC;
            }
            label.setFont(new Font("Serif",mode,FONTSIZE));
        };

        // 添加Button
        JPanel buttonPanel = new JPanel();
        bold = new JCheckBox("Bold");
        bold.addActionListener(listener);
        bold.setSelected(true);
        buttonPanel.add(bold);
        italic = new JCheckBox("Italic");
        italic.addActionListener(listener);
        italic.setSelected(true);
        buttonPanel.add(italic);

        add(buttonPanel);
        pack();
    }


}
