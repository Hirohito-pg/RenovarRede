import javax.swing.*;

public final class RenovarRede {
    public RenovarRede() {
        acaoIP();
    }

    public static void main(String[] args) throws InterruptedException {
        new RenovarRede();
    }

    public void acaoIP() {
        String[] comando = {"ipconfig /release", "ipconfig /release6", "ipconfig /flushdns", "ipconfig /setclassid", "ipconfig /setclassid6", "ipconfig /registerdns", "ipconfig /renew", "ipconfig /renew6", "ipconfig /flushdns", "ipconfig /setclassid", "ipconfig /setclassid6", "ipconfig /registerdns"};
        try {
            for (String comando_for : comando) {
                Process p = Runtime.getRuntime().exec("cmd /C " + comando_for);
                p.waitFor();
            }
            JOptionPane.showMessageDialog(null, "Rede renovada com êxito!");
            System.exit(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao\nrenovar o rndereço IP!", "Erro", 0);
            System.exit(0);
        }
    }
}