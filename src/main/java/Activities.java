import javax.swing.*;

public class Activities {
    private DefaultListModel<String> firstModel = new DefaultListModel<>();
    private DefaultListModel<String> secondModel = new DefaultListModel<>();

    public void jButtonAddActionPerformed() {
        PrepareGUI.fields.jListAdd.setModel(firstModel);
        firstModel.addElement(
                PrepareGUI.fields.jTextFieldAddText.getText());
        PrepareGUI.fields.jTextFieldAddText.setText(null);
    }

    public void jButtonRunActionPerformed() {
        PrepareGUI.fields.jListResult.setModel(secondModel);
        String modifiedText = null;
        for (int i = 0; i < PrepareGUI.fields.jListAdd.getModel().getSize(); i++) {
            modifiedText = PrepareGUI.fields.jListAdd
                    .getModel()
                    .getElementAt(i)
                    .toString()
                    .replaceAll("\\s*\\([^)]*\\)\\s*", " ");
        }
        secondModel.addElement(modifiedText);
    }

    public void jButtonDeleteActionPerformed() {
        int selectIndex = PrepareGUI.fields.jListAdd.getSelectedIndex();
        if (selectIndex != -1) {
            firstModel.remove(selectIndex);
        }
    }

    public void jButtonClearActionPerformed() {
        secondModel.clear();
    }
}