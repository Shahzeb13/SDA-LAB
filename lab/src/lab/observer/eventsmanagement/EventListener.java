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

public interface EventListener {
    void update(String eventType, File file);
}
