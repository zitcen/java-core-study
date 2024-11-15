package comboBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * @ClassName RadioButtonFrame
 * @Description TODO
 * @Author ztc
 * @Date 2024/11/15 15:51
 */
public class ComboBoxFrame extends JFrame {

    private JComboBox<String> faceCombo;
    private JLabel label;
    private static final int DEFAULT_SIZE = 24;

    public ComboBoxFrame()  {
        //添加标签
        label = new JLabel("The quick brown fox jumps over the lazy dog.");
        label.setFont(new Font("Serif",Font.BOLD,DEFAULT_SIZE));
        add(label,BorderLayout.CENTER);

        //添加单选框
        faceCombo = new JComboBox<>();
        faceCombo.addItem("Serif");
        faceCombo.addItem("SansSerif");
        faceCombo.addItem("Monospaced");
        faceCombo.addItem("Dialog");
        faceCombo.addItem("DialogInput");
        faceCombo.addActionListener( e -> {
            label.setFont(new Font(faceCombo.getItemAt(faceCombo.getSelectedIndex()),Font.PLAIN,DEFAULT_SIZE));
        });
        JPanel comboPanel = new JPanel();
        comboPanel.add(faceCombo);
        add(comboPanel,BorderLayout.SOUTH);
        pack();
    }


}
