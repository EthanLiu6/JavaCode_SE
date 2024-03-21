package GUI;

import javax.swing.*;

public class _03_demo {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setTitle("聊天框");
        jf.setLocationRelativeTo(null);
        jf.setSize(400, 300);
        jf.setAlwaysOnTop(true);
        jf.setDefaultCloseOperation(3);
        jf.setLayout(null);

        JTextArea textArea = new JTextArea(); // 文本域对象
        textArea.setBounds(10, 10, 360, 200);
        jf.add(textArea);

        JTextField textField = new JTextField();
        textField.setBounds(10, 230, 180, 20);
        jf.add(textField);

        JButton sendButton = new JButton("发送");
        sendButton.setBounds(200, 230, 70, 20);
        jf.add(sendButton);

        JButton clearButton = new JButton("清空");
        clearButton.setBounds(280, 230, 70, 20);
        jf.add(clearButton);

        jf.setVisible(true);


    }
}
