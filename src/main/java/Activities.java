import javax.swing.*;
import java.awt.event.ActionEvent;

public class Activities {
    private DefaultListModel model = new DefaultListModel();
    private DefaultListModel secondModel = new DefaultListModel();

    public void jButtonAddActionPerformed(Object textToBeAdded) {
        PrepareGUI.fields.jListAdd.setModel(model);
        model.addElement(textToBeAdded);
    }

    public void jButtonRunActionPerformed(Object textToBeModified) {
        PrepareGUI.fields.jListResult.setModel(secondModel);
        Object modifiedText =
                textToBeModified
                        .toString()
                        .replaceAll("\\(.*\\)", " ");
        secondModel.addElement(modifiedText);
    }

    public void jButtonDeleteActionPerformed() {
        model.removeAllElements();
        secondModel.removeAllElements();
    }

    public void jButtonClearActionPerformed() {
        secondModel.removeAllElements();
    }

    public void jTextFieldAddTextActionPerformed(ActionEvent e) {
    }
}
