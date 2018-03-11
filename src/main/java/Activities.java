import javax.swing.*;
import java.awt.event.ActionEvent;

public class Activities {
    private DefaultListModel model = new DefaultListModel();


    public void jButtonAddActionPerformed(Object textToBeAdded) {
        PrepareGUI.fields.jListAdd.setModel(model);
        model.addElement(textToBeAdded);
    }

    public void jButtonRunActionPerformed(ActionEvent e) {
    }

    public void jButtonDeleteActionPerformed(ActionEvent e) {
    }

    public void jButtonClearActionPerformed(ActionEvent e) {
    }

    public void jTextFieldAddTextActionPerformed(ActionEvent e) {
    }
}
