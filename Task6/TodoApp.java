package Task6;

import java.awt.*;
import javax.swing.*;

public class TodoApp {

    public static void main(String[] args) {

        JFrame frame = new JFrame("ToDo App");
        frame.setSize(700, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(215, 217, 222));

        // Header
        JLabel title = new JLabel("ToDo App");
        title.setBounds(0, 20, 700, 60);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 28));
        title.setForeground(Color.WHITE);
        title.setOpaque(true);
        title.setBackground(new Color(20, 105, 180));
        frame.add(title);

        // Task Label
        JLabel taskLabel = new JLabel("Task:");
        taskLabel.setBounds(15, 105, 60, 40);
        taskLabel.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(taskLabel);

        // Text Field
        JTextField textField = new JTextField();
        textField.setBounds(85, 105, 400, 40);
        frame.add(textField);

        // List
        DefaultListModel<String> model = new DefaultListModel<>();
        JList<String> taskList = new JList<>(model);
        taskList.setFont(new Font("Arial", Font.PLAIN, 16));

        JScrollPane scrollPane = new JScrollPane(taskList);
        scrollPane.setBounds(15, 170, 475, 310);
        frame.add(scrollPane);

        // Add Button
        JButton addButton = new JButton("Add Task");
        addButton.setBounds(505, 105, 150, 40);
        addButton.setBackground(new Color(35, 210, 90));
        addButton.setForeground(Color.WHITE);
        addButton.setFont(new Font("Arial", Font.BOLD, 16));
        addButton.setFocusPainted(false);
        frame.add(addButton);

        // Delete Button
        JButton deleteButton = new JButton("Delete Task");
        deleteButton.setBounds(505, 170, 150, 40);
        deleteButton.setBackground(new Color(220, 45, 70));
        deleteButton.setForeground(Color.WHITE);
        deleteButton.setFont(new Font("Arial", Font.BOLD, 16));
        deleteButton.setFocusPainted(false);
        frame.add(deleteButton);

        // Add Task
        addButton.addActionListener(e -> {
            String task = textField.getText().trim();

            if (!task.isEmpty()) {
                model.addElement(task);
                textField.setText("");
                textField.requestFocus();
            }
        });

        // Delete Task
        deleteButton.addActionListener(e -> {
            int index = taskList.getSelectedIndex();

            if (index != -1) {
                model.remove(index);
            }
        });

        // Press Enter to add
        textField.addActionListener(e -> addButton.doClick());

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}