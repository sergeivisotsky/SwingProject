import javax.swing.*;
import java.awt.*;

import static javax.swing.LayoutStyle.ComponentPlacement;

public class PrepareGUI extends JFrame {

    PrepareGUI() {
        prepareWindow();
    }

    public static GlobalFields fields = new GlobalFields();
    private Activities fieldsActivities = new Activities();

    private void prepareWindow() {

        fields.jTextFieldAddText = new JTextField();
        fields.jButtonAdd = new JButton();
        fields.jButtonRun = new JButton();
        fields.jScrollPaneForAdd = new JScrollPane();
        fields.jListAdd = new JList();
        fields.jScrollPaneResult = new JScrollPane();
        fields.jListResult = new JList();
        fields.jButtonDelete = new JButton();
        fields.jButtonClear = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        fields.jButtonAdd.setText("Add");
        fields.jButtonAdd
                .addActionListener(
                        e -> fieldsActivities
                                .jButtonAddActionPerformed());

        fields.jButtonRun.setText("Run");
        fields.jButtonRun
                .addActionListener(
                        e -> fieldsActivities
                                .jButtonRunActionPerformed());

        fields.jScrollPaneForAdd.setViewportView(fields.jListAdd);

        fields.jScrollPaneResult.setViewportView(fields.jListResult);

        fields.jButtonDelete.setText("Delete");
        fields.jButtonDelete
                .addActionListener(
                        e -> fieldsActivities
                                .jButtonDeleteActionPerformed());

        fields.jButtonClear.setText("Clear");
        fields.jButtonClear
                .addActionListener(
                        e -> fieldsActivities
                                .jButtonClearActionPerformed());

        fields.jTextFieldAddText
                .addActionListener(
                        e -> fieldsActivities
                                .jTextFieldAddTextActionPerformed(e));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(fields.jTextFieldAddText)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(fields.jScrollPaneForAdd,
                                                        GroupLayout.PREFERRED_SIZE, 142,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(fields.jScrollPaneResult,
                                                        GroupLayout.PREFERRED_SIZE, 0,
                                                        Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(fields.jButtonAdd,
                                        GroupLayout.PREFERRED_SIZE, 81,
                                        GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(fields.jButtonRun,
                                        GroupLayout.PREFERRED_SIZE, 80,
                                        GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(71, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fields.jButtonDelete,
                                        GroupLayout.PREFERRED_SIZE, 81,
                                        GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(fields.jButtonClear,
                                        GroupLayout.PREFERRED_SIZE, 80,
                                        GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(fields.jTextFieldAddText,
                                        GroupLayout.PREFERRED_SIZE,
                                        GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(fields.jButtonAdd,
                                                GroupLayout.PREFERRED_SIZE, 34,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fields.jButtonRun,
                                                GroupLayout.PREFERRED_SIZE, 34,
                                                GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(fields.jScrollPaneForAdd)
                                        .addComponent(fields.jScrollPaneResult,
                                                GroupLayout.DEFAULT_SIZE, 189,
                                                Short.MAX_VALUE))
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(fields.jButtonDelete,
                                                GroupLayout.PREFERRED_SIZE, 34,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fields.jButtonClear,
                                                GroupLayout.PREFERRED_SIZE, 34,
                                                GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(
                () -> new PrepareGUI().setVisible(true)
        );
    }
}
