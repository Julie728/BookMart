/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.utils;

import java.util.UUID;

/**
 *
 * @author jeffwan
 */
public class WebUtils {
 
    public static String makeID() {
        return UUID.randomUUID().toString();
    }
}
