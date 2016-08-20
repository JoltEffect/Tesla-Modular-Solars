package com.jolteffect.teslamodularsolars.utility;

import net.minecraftforge.fml.common.FMLLog;

import org.apache.logging.log4j.Level;

import com.jolteffect.teslamodularsolars.TeslaModularSolars;

public final class LogHelper {

    private static void log(Level level, String message) {
        FMLLog.log(level, "%s", "[" + TeslaModularSolars.MOD_NAME + "] " + message);
    }

    public static void logFatal(String message) {
        log(Level.FATAL, message);
    }

    public static void logInfo(String message) {
        log(Level.INFO, message);
    }

    public static void logDebug(String message) {
        log(Level.DEBUG, message);
    }
    
    public static void logError(String message) {
        log(Level.ERROR, message);
    }

    public static void logWarn(String message) {
        log(Level.WARN, message);
    }



}