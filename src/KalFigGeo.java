import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KalFigGeo extends JFrame{
    private JRadioButton kwadratRadioButton;
    private JRadioButton sześcianRadioButton;
    private JRadioButton prostopadłościanRadioButton;
    private JRadioButton prostokątRadioButton;
    private JRadioButton walecRadioButton;
    private JRadioButton trójkątRadioButton;
    private JRadioButton kulaRadioButton;
    private JRadioButton trapezRadioButton;
    private JTextField textFielda;
    private JTextField textFieldb;
    private JTextField textFieldh;
    private JTextField textFieldr;
    private JTextField textPole;
    private JTextField textObw;
    private JTextField textObj;
    private JPanel main_panel;
    private JButton obliczButton;
    private JButton wyczyśćButton;



    public void resetFields(){
        textFielda.setEnabled(false);
        textFieldb.setEnabled(false);
        textFieldh.setEnabled(false);
        textFieldr.setEnabled(false);
        textPole.setEnabled(false);
        textObw.setEnabled(false);
        textObj.setEnabled(false);
        kwadratRadioButton.setSelected(false);
        prostokątRadioButton.setSelected(false);
        trójkątRadioButton.setSelected(false);
        trapezRadioButton.setSelected(false);
        sześcianRadioButton.setSelected(false);
        prostopadłościanRadioButton.setSelected(false);
        walecRadioButton.setSelected(false);
        kulaRadioButton.setSelected(false);
        textObw.setText("");
        textPole.setText("");
        textObj.setText("");
        textFielda.setText("");
        textFieldb.setText("");
        textFieldh.setText("");
        textFieldr.setText("");
        validateFields();
    }

    public boolean validateFields(){
        int w = 0;
        if (!textFielda.isEnabled()){
            textFielda.setBackground(Color.white);
        } else if (textFielda.isEnabled()) {
            try {
                if (Double.valueOf(textFielda.getText()) < 0) {
                    w = 1;
                    textFielda.setBackground(Color.red);
                } else textFielda.setBackground(Color.white);
            } catch (NumberFormatException e) {
                w = 1;
                textFielda.setBackground(Color.red);
            }
        }

        if (!textFieldb.isEnabled()){
            textFieldb.setBackground(Color.white);
        }else if (textFieldb.isEnabled()){
            try {
                if (Double.valueOf(textFieldb.getText()) < 0) {
                    w = 1;
                    textFieldb.setBackground(Color.red);
                } else textFieldb.setBackground(Color.white);
            } catch (NumberFormatException e) {
                w = 1;
                textFieldb.setBackground(Color.red);
            }
        }

        if (!textFieldh.isEnabled()){
            textFieldh.setBackground(Color.white);
        }else if (textFieldh.isEnabled()){
            try {
                if (Double.valueOf(textFieldh.getText()) < 0) {
                    w = 1;
                    textFieldh.setBackground(Color.red);
                } else textFieldh.setBackground(Color.white);
            } catch (NumberFormatException e) {
                w = 1;
                textFieldh.setBackground(Color.red);
            }
        }

        if (!textFieldr.isEnabled()){
            textFieldr.setBackground(Color.white);
        }else if (textFieldr.isEnabled()){
            try {
                if (Double.valueOf(textFieldr.getText()) < 0) {
                    w = 1;
                    textFieldr.setBackground(Color.red);
                } else textFieldr.setBackground(Color.white);
            } catch (NumberFormatException e) {
                w = 1;
                textFieldr.setBackground(Color.red);
            }
        }


        if (w == 0){
            return true;
        }
        return false;
    }

    public KalFigGeo (){
        super("Figury geometryczne - kalkulator");
        this.setContentPane(this.main_panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object ob1 = e.getSource();
                if (ob1 == kwadratRadioButton) {
                    resetFields();
                    kwadratRadioButton.setSelected(true);
                    textFielda.setEnabled(true);
                } else if (ob1 == prostokątRadioButton) {
                    resetFields();
                    prostokątRadioButton.setSelected(true);
                    textFielda.setEnabled(true);
                    textFieldb.setEnabled(true);
                } else if (ob1 == trójkątRadioButton) {
                    resetFields();
                    trójkątRadioButton.setSelected(true);
                    textFielda.setEnabled(true);
                    textFieldh.setEnabled(true);
                } else if (ob1 == trapezRadioButton) {
                    resetFields();
                    trapezRadioButton.setSelected(true);
                    textFielda.setEnabled(true);
                    textFieldb.setEnabled(true);
                    textFieldh.setEnabled(true);
                } else if (ob1 == sześcianRadioButton) {
                    resetFields();
                    sześcianRadioButton.setSelected(true);
                    textFielda.setEnabled(true);
                } else if (ob1 == prostopadłościanRadioButton) {
                    resetFields();
                    prostopadłościanRadioButton.setSelected(true);
                    textFielda.setEnabled(true);
                    textFieldb.setEnabled(true);
                    textFieldh.setEnabled(true);
                } else if (ob1 == walecRadioButton) {
                    resetFields();
                    walecRadioButton.setSelected(true);
                    textFieldr.setEnabled(true);
                    textFieldh.setEnabled(true);
                } else if (ob1 == kulaRadioButton) {
                    resetFields();
                    kulaRadioButton.setSelected(true);
                    textFieldr.setEnabled(true);
                } else if (ob1 == wyczyśćButton) {
                    resetFields();
                    validateFields();

                } else if (ob1 == obliczButton && kwadratRadioButton.isSelected()) {
                    if (validateFields()) {
                        textPole.setEnabled(true);
                        textObw.setEnabled(true);
                        textPole.setText(String.valueOf(Figury.PoleKwadratu(Double.valueOf(textFielda.getText()))));
                        textObw.setText(String.valueOf(Figury.ObwodKwadratu(Double.valueOf(textFielda.getText()))));
                    }
                } else if (ob1 == obliczButton && prostokątRadioButton.isSelected()) {
                    if (validateFields()) {
                        textPole.setEnabled(true);
                        textObw.setEnabled(true);
                        textObw.setText(String.valueOf(Figury.ObwodProstokata(Double.valueOf(textFielda.getText()), Double.valueOf(textFieldb.getText()))));
                        textPole.setText(String.valueOf(Figury.PoleProstokata(Double.valueOf(textFielda.getText()), Double.valueOf(textFieldb.getText()))));
                    }
                } else if (ob1 == obliczButton && trójkątRadioButton.isSelected()) {
                    if (validateFields()) {
                        textPole.setEnabled(true);
                        textPole.setText((String.valueOf(Figury.poleTrojkata(Double.valueOf(textFielda.getText()), Double.valueOf(textFieldh.getText())))));
                    }
                } else if (ob1 == obliczButton && trapezRadioButton.isSelected()) {
                    if (validateFields()) {
                        textPole.setEnabled(true);
                        textPole.setText(String.valueOf((Figury.poleTrapezu(Double.valueOf(textFielda.getText()), Double.valueOf(textFieldb.getText()), Double.valueOf(textFieldh.getText())))));
                    }
                } else if (ob1 == obliczButton && sześcianRadioButton.isSelected()) {
                    if (validateFields()) {
                        textPole.setEnabled(true);
                        textObj.setEnabled(true);
                        textPole.setText(String.valueOf(Figury.poleSzescianu(Double.valueOf(textFielda.getText()))));
                        textObj.setText(String.valueOf(Figury.objetoscSzescianju(Double.valueOf(textFielda.getText()))));
                    }
                } else if (ob1 == obliczButton && prostopadłościanRadioButton.isSelected()) {
                    if (validateFields()) {
                        textPole.setEnabled(true);
                        textObj.setEnabled(true);
                        textPole.setText(String.valueOf(Figury.poleProstopadloscianu(Double.valueOf(textFielda.getText()), Double.valueOf(textFieldb.getText()), Double.valueOf(textFieldh.getText()))));
                        textObj.setText(String.valueOf((Figury.objetoscProstopadloscianu(Double.valueOf(textFielda.getText()), Double.valueOf(textFieldb.getText()), Double.valueOf(textFieldh.getText())))));
                    }
                } else if (ob1 == obliczButton && walecRadioButton.isSelected()) {
                    if (validateFields()) {
                        textPole.setEnabled(true);
                        textObj.setEnabled(true);
                        textPole.setText(String.valueOf(Figury.PoleWalca(Double.valueOf(textFieldr.getText()), Double.valueOf(textFieldh.getText()))));
                        textObj.setText(String.valueOf(Figury.ObjetoscWalca(Double.valueOf(textFieldr.getText()), Double.valueOf(textFieldh.getText()))));
                    }
                } else if (ob1 == obliczButton && kulaRadioButton.isSelected()) {
                    if (validateFields()) {
                        textPole.setEnabled(true);
                        textObj.setEnabled(true);
                        textPole.setText(String.valueOf(Figury.poleKuli(Double.valueOf(textFieldr.getText()))));
                        textObj.setText(String.valueOf(Figury.objetoscKuli(Double.valueOf(textFieldr.getText()))));
                    }
                }
            }

        };
        kwadratRadioButton.addActionListener(listener);
        prostokątRadioButton.addActionListener(listener);
        trójkątRadioButton.addActionListener(listener);
        trapezRadioButton.addActionListener(listener);
        sześcianRadioButton.addActionListener(listener);
        prostopadłościanRadioButton.addActionListener(listener);
        walecRadioButton.addActionListener(listener);
        kulaRadioButton.addActionListener(listener);
        obliczButton.addActionListener(listener);
        wyczyśćButton.addActionListener(listener);

    }

    public static void main(String[] args) {
        KalFigGeo kalFigGeo = new KalFigGeo();
        kalFigGeo.setVisible(true);
    }
}