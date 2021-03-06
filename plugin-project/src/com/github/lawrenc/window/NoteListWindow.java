package com.github.lawrenc.window;

import com.github.lawrenc.data.DataCenter;
import com.github.lawrenc.data.NoteData;
import com.github.lawrenc.dialog.NoteDialog;
import com.github.lawrenc.processor.DefaultSourceNoteData;
import com.github.lawrenc.processor.MDFreeMarkProcessor;
import com.github.lawrenc.processor.Processor;
import com.intellij.notification.Notification;
import com.intellij.notification.NotificationDisplayType;
import com.intellij.notification.NotificationGroup;
import com.intellij.notification.Notifications;
import com.intellij.openapi.fileChooser.FileChooser;
import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.MessageType;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.wm.ToolWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author Liu Mingyao
 */
public class NoteListWindow {
    private JTextField tfTopic;
    private JTable tbContent;
    private JButton btnCreate;
    private JButton btnClear;
    private JButton btnClose;
    private JPanel contentPanel;
    private JPopupMenu popupMenu;

    private void init() {
        tbContent.setModel(DataCenter.TABLE_MODEL);
        tbContent.setEnabled(false);
    }

    public NoteListWindow(Project project, ToolWindow toolWindow) {
        init();
        btnCreate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String topic = tfTopic.getText();
                String fileName = topic + ".md";
                if (topic == null || "".equals(topic)) {
                    tfTopic.requestFocus();
                    JOptionPane.showMessageDialog(null, "Please add the document title first!", "tips", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                VirtualFile virtualFile = FileChooser.chooseFile(FileChooserDescriptorFactory.createSingleFolderDescriptor(), project, project.getBaseDir());
                if (virtualFile != null) {
                    String path = virtualFile.getPath();
                    String fileFullPath = path + "/" + fileName;
                    Processor processor = new MDFreeMarkProcessor();
                    try {
                        processor.process(new DefaultSourceNoteData(fileFullPath, topic, DataCenter.NOTE_LIST));
                        NotificationGroup notificationGroup = new NotificationGroup("markbook_id", NotificationDisplayType.BALLOON, true);
                        Notification notification = notificationGroup.createNotification("Generate Document Success???" + fileFullPath, MessageType.INFO);
                        Notifications.Bus.notify(notification);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DataCenter.reset();
            }
        });
        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toolWindow.hide(null);
            }
        });
        tbContent.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);//???????????????????????????????????????
                Point p = e.getPoint();
                int row = tbContent.rowAtPoint(p);
                tbContent.setRowSelectionInterval(row, row);
                System.out.println(e.getButton());
                if (e.getButton() == MouseEvent.BUTTON3) {
                    //????????????????????????????????????????????????
                    createPopupMenu(row);
                    //????????????
                    popupMenu.show(tbContent, e.getX(), e.getY());
                    return;
                }
                if (e.getClickCount() == 2) {
                    NoteData noteData = DataCenter.NOTE_LIST.get(row);
                    NoteDialog dialog = new NoteDialog(row, noteData);
                    dialog.setVisible(true);
                }
            }
        });
    }

    //???????????????????????????
    private void createPopupMenu(int row) {
        popupMenu = new JPopupMenu();
        JMenuItem delMenItem = new JMenuItem();
        ImageIcon logo = new ImageIcon(getClass().getResource("/img/delete.png"));
        delMenItem.setIcon(logo);
        delMenItem.setText("delete");
        delMenItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                //????????????????????????
                DataCenter.delete(row);
            }
        });
        popupMenu.add(delMenItem);
    }

    public JPanel getContentPanel() {
        return contentPanel;
    }
}
