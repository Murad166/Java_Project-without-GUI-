package analysis;
import utils.AlertManager;

public class ClickAnalyzer {
    public void analyzeClick(String link) {
        if (link.contains("redirect") || link.contains("tracker")) {
            AlertManager.sendAlert("Suspicious Click Activity Detected: " + link);
        } else {
            System.out.println("Click behavior normal: " + link);
        }
    }
}
