import javax.swing.*;
import java.awt.event.ActionEvent;

public class Activities {
    private DefaultListModel model = new DefaultListModel();
    private DefaultListModel secondModel = new DefaultListModel();

    public void jButtonAddActionPerformed(Object textToBeAdded) {
        PrepareGUI.fields.jListAdd.setModel(model);
        model.addElement(textToBeAdded);
    }

    public Object jButtonRunActionPerformed(Object textToBeModified) {
        PrepareGUI.fields.jListResult.setModel(secondModel);
        Object modifiedText =
                textToBeModified
                        .toString()
                        .replaceAll("\\s*\\([^\\)]*\\)\\s*", " ");
        secondModel.addElement(modifiedText);
        return modifiedText;
    }

    public void jButtonDeleteActionPerformed() {
        model.clear();
    }

    public void jButtonClearActionPerformed() {
        secondModel.clear();
    }

    public void jTextFieldAddTextActionPerformed(ActionEvent e) {
    }
}
