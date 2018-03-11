import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        fields.jScrollPane1 = new JScrollPane();
        fields.jListAdd = new JList();
        fields.jScrollPane2 = new JScrollPane();
        fields.jListResult = new JList();
        fields.jButtonDelete = new JButton();
        fields.jButtonClear = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        fields.jButtonAdd.setText("Add");
        fields.jButtonAdd
                .addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        fieldsActivities
                                .jButtonAddActionPerformed(
                                        fields.jTextFieldAddText.getText());
                    }
                });

        fields.jButtonRun.setText("Run");
        fields.jButtonRun
                .addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        fieldsActivities
                                .jButtonRunActionPerformed(e);
                    }
                });

        fields.jScrollPane1.setViewportView(fields.jListAdd);

        fields.jScrollPane2.setViewportView(fields.jListResult);

        fields.jButtonDelete.setText("Delete");
        fields.jButtonDelete
                .addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        fieldsActivities
                                .jButtonDeleteActionPerformed(e);
                    }
                });

        fields.jButtonClear.setText("Clear");
        fields.jButtonClear
                .addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        fieldsActivities
                                .jButtonClearActionPerformed(e);
                    }
                });

        fields.jTextFieldAddText
                .addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        fieldsActivities
                                .jTextFieldAddTextActionPerformed(e);
                    }
                });


        /*fields.jListAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fieldsActivities.jTextFieldAddTextActionPerformed(e);
            }
        });

        fields.jTextFieldAddText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fieldsActivities.jTextFieldAddTextActionPerformed(e);
            }
        });*/

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(fields.jTextFieldAddText)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(fields.jScrollPane1, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(fields.jScrollPane2, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(fields.jButtonAdd, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(fields.jButtonRun, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(71, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fields.jButtonDelete, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(fields.jButtonClear, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(fields.jTextFieldAddText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(fields.jButtonAdd, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fields.jButtonRun, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(fields.jScrollPane1)
                                        .addComponent(fields.jScrollPane2, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(fields.jButtonDelete, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fields.jButtonClear, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrepareGUI().setVisible(true);
            }
        });
    }
}
