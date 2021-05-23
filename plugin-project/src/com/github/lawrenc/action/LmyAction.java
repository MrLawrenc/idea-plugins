package com.github.lawrenc.action;

import com.github.lawrenc.dialog.ApiGenerateDialog;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.SelectionModel;
import org.jetbrains.annotations.NotNull;

/**
 * 通过Pulgins Devkit创建的action继承了Ananction
 *
 * @author Lawrence
 */
public class LmyAction extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        Editor editor = e.getRequiredData(CommonDataKeys.EDITOR);
        SelectionModel selectionModel = editor.getSelectionModel();
        String selectedText = selectionModel.getSelectedText();
        String name = e.getRequiredData(CommonDataKeys.PSI_FILE).getViewProvider().getVirtualFile().getName();

        ApiGenerateDialog apiGenerateDialog = new ApiGenerateDialog(selectedText + "\n" + name);
        apiGenerateDialog.setVisible(true);
    }
}
