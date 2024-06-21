package Lab6JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MetricConvertionAssistant extends JFrame {
    private JPanel myPanel;
    private JTextField txtMile;
    private JTextField txtKilometer;
    private JLabel mileLbl;
    private JLabel kilometerLbl;
    private JTextField txtPounds;
    private JTextField txtKilogram;
    private JLabel poundsLbl;
    private JLabel kilogramLbl;
    private JTextField txtGallon;
    private JTextField txtLiters;
    private JTextField txtFahrenheit;
    private JTextField txtCentrigrade;
    private JLabel gallonLbl;
    private JLabel litersLbl;
    private JLabel fahrenheit;
    private JLabel centrigradeLbl;
    private JButton btnConvert;

    public MetricConvertionAssistant() {
        myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(5, 4));
       // GridBagConstraints c = new GridBagConstraints();


        myPanel.add(mileLbl);
        //txtMile.setPreferredSize(new Dimension(150,5));
        myPanel.add(txtMile);
        myPanel.add(kilometerLbl);
        myPanel.add(txtKilometer);
        myPanel.add(poundsLbl);
        myPanel.add(txtPounds);
        myPanel.add(kilogramLbl);
        myPanel.add(txtKilogram);

        myPanel.add(gallonLbl);
        myPanel.add(txtGallon);
        myPanel.add(litersLbl);
        myPanel.add(txtLiters);
        myPanel.add(fahrenheit);
        myPanel.add(txtFahrenheit);
        myPanel.add(centrigradeLbl);
        myPanel.add(txtCentrigrade);
        myPanel.add(btnConvert);

        setContentPane(myPanel);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Metric Convertion Assistant");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setResizable(false);

        btnConvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if(txtMile.getText().isEmpty() && !txtKilometer.getText().isEmpty()) {
                    txtMile.setText((kilometersToMiles(txtKilometer.getText())));
                }
                if(!txtMile.getText().isEmpty() && txtKilometer.getText().isEmpty()) {
                    txtKilometer.setText(milesToKilometers(txtMile.getText()));
                }

                if(txtPounds.getText().isEmpty() && !txtKilogram.getText().isEmpty()) {
                    txtPounds.setText(kilogramsToPounds(txtKilogram.getText()));
                }
                if(!txtPounds.getText().isEmpty() && txtKilogram.getText().isEmpty()) {
                    txtKilogram.setText(poundsToKilograms(txtPounds.getText()));
                }

                if(!txtGallon.getText().isEmpty() && txtLiters.getText().isEmpty()) {
                    txtLiters.setText(gallonsToLiters(txtPounds.getText()));
                }

                if(!txtLiters.getText().isEmpty() && txtGallon.getText().isEmpty()) {
                    txtGallon.setText(litersToGallons(txtLiters.getText()));
                }

                if(!txtFahrenheit.getText().isEmpty() && txtCentrigrade.getText().isEmpty()) {
                    txtCentrigrade.setText(fahrenheitToCelsius(txtFahrenheit.getText()));
                }

                if(!txtCentrigrade.getText().isEmpty() && txtFahrenheit.getText().isEmpty()) {
                    txtFahrenheit.setText(celsiusToFahrenheit(txtCentrigrade.getText()));
                }


            }
        });
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MetricConvertionAssistant metricConvertionAssistant = new MetricConvertionAssistant();
            }
        });
    }

    public static String milesToKilometers(String miles) {
        double milesValue = parseInput(miles);
        double kilometers = milesValue * 1.60934;
        return formatDouble(kilometers);
    }

    public static String kilometersToMiles(String kilometers) {
        double kilometersValue = parseInput(kilometers);
        double miles = kilometersValue / 1.60934;

        return formatDouble(miles);
    }

    public static String poundsToKilograms(String pounds) {
        double poundsValue = parseInput(pounds);
        double kilograms = poundsValue * 0.453592;

        return formatDouble(kilograms);
    }

    public static String kilogramsToPounds(String kilograms) {
        double kilogramsValue = parseInput(kilograms);
        double pounds = kilogramsValue / 0.453592;

        return formatDouble(pounds);
    }

    public static String gallonsToLiters(String gallons) {
        double gallonsValue = parseInput(gallons);
        double liters = gallonsValue * 3.78541;

        return formatDouble(liters);
    }

    public static String litersToGallons(String liters) {
        double litersValue = parseInput(liters);
        double gallons = litersValue / 3.78541;
        return formatDouble(gallons);
    }

    public static String fahrenheitToCelsius(String fahrenheit) {
        double fahrenheitValue = parseInput(fahrenheit);
        double celsius = (fahrenheitValue - 32) * 5.0 / 9.0;
        return formatDouble(celsius);
    }

    public static String celsiusToFahrenheit(String celsius) {
        double celsiusValue = parseInput(celsius);
        double fahrenheit = ((celsiusValue * 9.0) / 5.0) + 32.0;
        return formatDouble(fahrenheit);
    }

    public static String formatDouble(double value) {
        return String.format("%.2f", value);
    }

    public static double parseInput(String input) {
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            return 0;
        }

    }

}
