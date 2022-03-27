package com.alliky.log;

import androidx.annotation.NonNull;

import com.orhanobut.logger.Logger;
import com.orhanobut.logger.LoggerPrinter;
import com.orhanobut.logger.Printer;

public final class Print {

    @NonNull
    private static Printer printer = new LoggerPrinter();

    public static void v(String tag, String message) {
        Logger.t(tag).v(message);
    }

    public static void d(String tag, Object message) {
        Logger.t(tag).d(message);
    }

    public static void d(Object message) {
        Logger.d(message);
    }

    public static void i(String tag, String message) {
        Logger.t(tag).i(message);
    }

    public static void w(String tag, String message) {
        Logger.t(tag).w(message);
    }

    public static void json(String tag, String message) {
        Logger.t(tag).json(message);
    }

    public static void e(String tag, String message) {
        Logger.t(tag).e(message);
    }
}
