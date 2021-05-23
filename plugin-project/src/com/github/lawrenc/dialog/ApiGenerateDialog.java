package com.github.lawrenc.dialog;

import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import com.intellij.uiDesigner.core.*;

/**
 * @author : Lawrence
 * date  2021/5/23 9:44
 */
public class ApiGenerateDialog extends JDialog {

    public ApiGenerateDialog(String text) {
        initComponents();
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


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        mainPane = new JPanel();
        tempPane = new JTabbedPane();
        jsonPanel = new JPanel();
        var label1 = new JLabel();
        selectType = new JComboBox();
        var scrollPane1 = new JScrollPane();
        jsonText = new JTextArea();
        apiPane = new JPanel();
        请求示例TextField = new JTextField();
        响应示例TextField = new JTextField();
        var vSpacer1 = new Spacer();
        var vSpacer2 = new Spacer();
        var hSpacer1 = new Spacer();
        请求地址TextField = new JTextField();
        var hSpacer2 = new Spacer();
        requestTypeText = new JTextField();
        comboBox1 = new JComboBox();
        var hSpacer3 = new Spacer();
        url = new JTextField();
        var scrollPane2 = new JScrollPane();
        requestTemplate = new JTextArea();
        var scrollPane3 = new JScrollPane();
        responseTemplate = new JTextArea();

        //======== mainPane ========
        {
            mainPane.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.
            swing.border.EmptyBorder(0,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion",javax.swing.border
            .TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog"
            ,java.awt.Font.BOLD,12),java.awt.Color.red),mainPane. getBorder
            ()));mainPane. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java
            .beans.PropertyChangeEvent e){if("bord\u0065r".equals(e.getPropertyName()))throw new RuntimeException
            ();}});
            mainPane.setLayout(new GridLayoutManager(1, 1, new Insets(10, 10, 10, 10), -1, -1));

            //======== tempPane ========
            {

                //======== jsonPanel ========
                {
                    jsonPanel.setLayout(new GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));

                    //---- label1 ----
                    label1.setText("Json Type");
                    jsonPanel.add(label1, new GridConstraints(0, 0, 1, 1,
                        GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
                        GridConstraints.SIZEPOLICY_FIXED,
                        GridConstraints.SIZEPOLICY_FIXED,
                        null, null, null));
                    jsonPanel.add(selectType, new GridConstraints(0, 1, 1, 1,
                        GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL,
                        GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_FIXED,
                        null, null, null));

                    //======== scrollPane1 ========
                    {
                        scrollPane1.setViewportView(jsonText);
                    }
                    jsonPanel.add(scrollPane1, new GridConstraints(1, 0, 1, 2,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
                        null, null, null));
                }
                tempPane.addTab("Json Util", jsonPanel);

                //======== apiPane ========
                {
                    apiPane.setLayout(new GridLayoutManager(6, 7, new Insets(0, 0, 0, 0), -1, -1));

                    //---- 请求示例TextField ----
                    请求示例TextField.setText("\u8bf7\u6c42\u793a\u4f8b");
                    apiPane.add(请求示例TextField, new GridConstraints(1, 0, 1, 1,
                        GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL,
                        GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
                        GridConstraints.SIZEPOLICY_FIXED,
                        null, null, null));

                    //---- 响应示例TextField ----
                    响应示例TextField.setText("\u54cd\u5e94\u793a\u4f8b");
                    apiPane.add(响应示例TextField, new GridConstraints(3, 0, 1, 1,
                        GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL,
                        GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
                        GridConstraints.SIZEPOLICY_FIXED,
                        null, null, null));
                    apiPane.add(vSpacer1, new GridConstraints(2, 0, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK,
                        GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
                        null, null, null));
                    apiPane.add(vSpacer2, new GridConstraints(4, 0, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK,
                        GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
                        null, null, null));
                    apiPane.add(hSpacer1, new GridConstraints(0, 3, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                        GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK,
                        null, null, null));

                    //---- 请求地址TextField ----
                    请求地址TextField.setText("\u8bf7\u6c42\u5730\u5740");
                    apiPane.add(请求地址TextField, new GridConstraints(0, 4, 1, 1,
                        GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL,
                        GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
                        GridConstraints.SIZEPOLICY_FIXED,
                        null, null, null));
                    apiPane.add(hSpacer2, new GridConstraints(0, 5, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                        GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK,
                        null, null, null));

                    //---- requestTypeText ----
                    requestTypeText.setColumns(1);
                    requestTypeText.setEditable(false);
                    requestTypeText.setText("\u8bf7\u6c42\u65b9\u5f0f:");
                    apiPane.add(requestTypeText, new GridConstraints(0, 0, 1, 1,
                        GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL,
                        GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
                        GridConstraints.SIZEPOLICY_FIXED,
                        null, null, null));
                    apiPane.add(comboBox1, new GridConstraints(0, 2, 1, 1,
                        GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL,
                        GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_FIXED,
                        null, null, null));
                    apiPane.add(hSpacer3, new GridConstraints(0, 1, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                        GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK,
                        null, null, null));

                    //---- url ----
                    url.setText("www.baidu.com");
                    url.setToolTipText("\u8bf7\u6c42\u5730\u5740");
                    apiPane.add(url, new GridConstraints(0, 6, 1, 1,
                        GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL,
                        GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
                        GridConstraints.SIZEPOLICY_FIXED,
                        null, null, null));

                    //======== scrollPane2 ========
                    {
                        scrollPane2.setViewportView(requestTemplate);
                    }
                    apiPane.add(scrollPane2, new GridConstraints(1, 1, 2, 6,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
                        null, null, null));

                    //======== scrollPane3 ========
                    {
                        scrollPane3.setViewportView(responseTemplate);
                    }
                    apiPane.add(scrollPane3, new GridConstraints(3, 1, 2, 6,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
                        null, null, null));
                }
                tempPane.addTab("will del", apiPane);
            }
            mainPane.add(tempPane, new GridConstraints(0, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, new Dimension(200, 200), null));
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
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
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}