import javax.swing.*;
import java.awt.event.ActionEvent;

public class Activities {
    private DefaultListModel model = new DefaultListModel();

    public void jButtonAddActionPerformed(Object textToBeAdded) {
        PrepareGUI.fields.jListAdd.setModel(model);
        model.addElement(textToBeAdded);
    }

    public void jButtonRunActionPerformed(Object textToBeModified) {
        PrepareGUI.fields.jListResult.setModel(model);
//        model.addElement(textToBeModified);
    }

    public void jButtonDeleteActionPerformed() {
        model.removeAllElements();
    }

    public void jButtonClearActionPerformed() {
    }

    public void jTextFieldAddTextActionPerformed(ActionEvent e) {
    }
}
