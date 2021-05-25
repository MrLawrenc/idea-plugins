package com.github.lawrenc.dialog;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * @author : Lawrence
 * date  2021/5/23 9:44
 */
public class ApiGenerateDialog extends JDialog {
    private JPanel mainPane;
    private JTabbedPane tempPane;
    private JPanel jsonPanel;
    private JComboBox selectType;
    private JTextArea jsonText;
    private JPanel apiPane;
    private JTextField 请求示例TextField;
    private JTextField 响应示例TextField;
    private JTextField 请求地址TextField;
    private JTextField requestTypeText;
    private JComboBox comboBox1;
    private JTextField url;
    private JTextArea requestTemplate;
    private JTextArea responseTemplate;

    public ApiGenerateDialog(String text) {
        setModalityType(ModalityType.MODELESS);
        //距离屏幕左上角的其实位置
        setLocation(400, 200);
        setSize(800, 600);
        setContentPane(mainPane);

        selectType.addItem("Json");
        selectType.addItem("Java Obj");
        selectType.addItem("groovy Obj");

        //优先显示最前面的文字
        requestTypeText.setColumns(0);

        comboBox1.addItem("GET");
        comboBox1.addItem("POST");
        comboBox1.addItem("DELETE");
        mainPane.registerKeyboardAction(e -> dispose(), KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

        jsonText.setText(text);
    }


}