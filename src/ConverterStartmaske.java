import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class ConverterStartmaske implements ActionListener {
    private JButton buttonClose;
    private JButton buttonConvert;
    private JComboBox comboBox1;
    private JPanel mainPanel;
    private JTextArea textInput;
    private JTextArea textOutput;
    private static final String[] comboBoxes = { "Convert Celsius2Farenheit", "Convert Farenheit2Celsius" };
    private JFrame frame;

    ConverterStartmaske (){

       // comboBox1.addItem(comboBoxes[0]);
        //comboBox1.addItem(comboBoxes[1]);
                buttonConvert.addActionListener(this);
                buttonClose.addActionListener(this);
    }

    public void showForm() {
        frame = new JFrame();
        frame.setContentPane(mainPanel);
        frame.setBounds(100, 100, 500, 400);
        frame.setVisible(true);

    }

    private void createUIComponents() {
        comboBox1 = new JComboBox(comboBoxes);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if  (e.getSource() == buttonConvert) {
            if (comboBoxes[0].compareTo((String) comboBox1.getSelectedItem()) == 0) {

                textOutput.setText(Double.toString(GradConverter.toFarenheit(Double.parseDouble(textInput.getText()))));
            } else {
                textOutput.setText(Double.toString(GradConverter.toCelsius(Double.parseDouble(textInput.getText()))));
            }
        }
        else if  (e.getSource() == buttonClose) {
frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
        }
    }
}
