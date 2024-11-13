package text;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName TextComponentFrame
 * @Description TODO
 * @Author ztc
 * @Date 2024/11/12 16:49
 */
public class TextComponentFrame extends JFrame {
    //组件到校
    private static final int TEXTAREA_ROWS = 8;
    private static final int TEXTAREA_COLUMNS= 20;

    public TextComponentFrame()  {
        //输入框
        JTextField textField = new JTextField();
        //密码输入框
        JPasswordField passwordField = new JPasswordField();
        //输入信息模块
        JPanel northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(2,2));
        northPanel.add(new JLabel("User Name：",SwingConstants.RIGHT));
        northPanel.add(textField);
        northPanel.add(new JLabel("Password：",SwingConstants.RIGHT));
        northPanel.add(passwordField);

        add(northPanel,BorderLayout.NORTH);

        //输出信息模块
        JTextArea textArea = new JTextArea(TEXTAREA_ROWS, TEXTAREA_COLUMNS);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane,BorderLayout.CENTER);

        //滑动模块
        JPanel southPanel = new JPanel();
        JButton insertButton = new JButton("Insert");
        southPanel.add(insertButton);
        insertButton.addActionListener(event ->{
             textArea.append("User Name：" + textField.getText()+
                    "  Password:" + new String(passwordField.getPassword()) + "\n");
        });
        add(southPanel,BorderLayout.SOUTH);
        pack();
    }
}
