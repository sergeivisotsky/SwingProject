import javax.swing.*;
import java.awt.event.ActionEvent;

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
        firstModel.clear();
    }

    public void jButtonClearActionPerformed() {
        secondModel.clear();
    }

    public void jTextFieldAddTextActionPerformed(ActionEvent e) {
    }
}
