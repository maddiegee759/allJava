public class ch5_5_1 {
    public static void main(String[] args) {
        // Initialize variables - don't modify these!
        boolean motionDetected = true;
        boolean doorLocked = false;
        boolean windowsClosed = true;
        boolean alarmActive = true;
        boolean nightTime = true;
        
        // Create your security conditions
        boolean isSecure = !(!doorLocked && motionDetected);
        boolean needsAttention = !(windowsClosed || alarmActive);
        boolean isHighRisk = !(doorLocked && windowsClosed) && nightTime;
        boolean shouldAlert = !isSecure || needsAttention;
        
        // Don't modify the code below
        System.out.println("Smart Home Security Status:");
        System.out.println("-------------------------");
        System.out.println("Home is Secure: " + isSecure);
        System.out.println("Needs Attention: " + needsAttention);
        System.out.println("High Risk Situation: " + isHighRisk);
        System.out.println("Alert Required: " + shouldAlert);
    }
}
