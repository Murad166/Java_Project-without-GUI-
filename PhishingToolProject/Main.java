public class Main {
    public static void main(String[] args) {
        System.out.println("Phishing Detecting Tool Started...");

        new analysis.URLAnalyzer().analyze("http://phishingsite.com");
        new analysis.EmailAnalyzer().analyze("From: fake@spoofed.com");
        new analysis.ClickAnalyzer().analyzeClick("http://example.com/redirect");
        new analysis.ImageAnalyzer().analyzeImage("fake_logo.png");
    }
}
