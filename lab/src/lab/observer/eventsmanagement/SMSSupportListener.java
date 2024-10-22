/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.observer.eventsmanagement;

/**
 *
 * @author sp22-bse-073
 */
import java.io.File;

public class SMSSupportListener implements EventListener {
    private String phoneNumber;
    private static final int MAX_SMS_LENGTH = 160;

    public SMSSupportListener(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String eventType, File file) {
        String message = "File " + file.getName() + " has been processed.";
        
        if (message.length() > MAX_SMS_LENGTH) {
            System.out.println("Warning: SMS message exceeds " + MAX_SMS_LENGTH + " characters. Please define a valid SMS.");
        } else {
            sendSMS(phoneNumber, message);
        }
    }

    private void sendSMS(String phoneNumber, String message) {
        System.out.println("Sending SMS to " + phoneNumber + ": " + message);
    }
}