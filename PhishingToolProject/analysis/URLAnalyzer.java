package analysis;
import utils.AlertManager;

public class URLAnalyzer {
    public void analyze(String url) {
        if (url.contains("phish") || url.contains("login") || url.contains("verify")) {
            AlertManager.sendAlert("Suspicious URL Detected: " + url);
        } else {
            System.out.println("URL looks clean: " + url);
        }
    }
}
