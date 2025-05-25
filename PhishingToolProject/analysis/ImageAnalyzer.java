package analysis;
import utils.AlertManager;

public class ImageAnalyzer {
    public void analyzeImage(String imagePath) {
        if (imagePath.toLowerCase().contains("fake") || imagePath.toLowerCase().contains("logo")) {
            AlertManager.sendAlert("Suspicious Logo/Image Found: " + imagePath);
        } else {
            System.out.println("Image seems safe: " + imagePath);
        }
    }
}
