package analysis;
import utils.AlertManager;

public class EmailAnalyzer {
    public void analyze(String emailHeader) {
        if (emailHeader.toLowerCase().contains("spoofed") || emailHeader.toLowerCase().contains("unknown")) {
            AlertManager.sendAlert("Suspicious Email Header Detected: " + emailHeader);
        } else {
            System.out.println("Email Header OK: " + emailHeader);
        }
    }
}
