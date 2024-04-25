import javax.swing.*;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        boolean continuarPrograma = true;

        while(continuarPrograma) {
            String[] options = new String[]{"Soles a Euros", "Soles a Dólares", "Soles a Libras Esterlinas", "Soles a Yen", "Soles a Won"};
            String choice = (String) JOptionPane.showInputDialog(null, "Elija una opción:", "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            String input = JOptionPane.showInputDialog("Ingrese la cantidad en soles peruanos: ");

            double soles;
            try {
                soles = Double.parseDouble(input);
            } catch (NumberFormatException var10) {
                JOptionPane.showMessageDialog(null, "Valor no válido.");
                return;
            }

            DecimalFormat FormatearDecimal = new DecimalFormat("#.##");
            double won;
            switch (choice) {
                case "Soles a Dólares" -> {
                    won = soles / 3.58;
                    JOptionPane.showMessageDialog(null, soles + " soles peruanos son " + FormatearDecimal.format(won) + " dólares.");
                }
                case "Soles a Euros" -> {
                    won = soles / 4.21;
                    JOptionPane.showMessageDialog(null, soles + " soles peruanos son " + won + " euros.");
                }
                case "Soles a Libras Esterlinas" -> {
                    won = soles / 4.92;
                    JOptionPane.showMessageDialog(null, soles + " soles peruanos son " + won + " libras esterlinas.");
                }
                case "Soles a Yen" -> {
                    won = soles / 0.03;
                    JOptionPane.showMessageDialog(null, soles + " soles peruanos son " + won + " yenes japoneses.");
                }
                case "Soles a Won" -> {
                    won = soles / 0.0027;
                    JOptionPane.showMessageDialog(null, soles + " soles peruanos son " + won + " wones surcoreanos.");
                }
            }

            int confirm = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Confirmar", JOptionPane.YES_NO_CANCEL_OPTION);
            if (confirm == 1 || confirm == 2) {
                continuarPrograma = false;
                JOptionPane.showMessageDialog(null, "Programa Finalizado");
            }
        }

    }
}
