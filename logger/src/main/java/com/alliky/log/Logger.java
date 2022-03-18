package com.alliky.log;

import android.text.TextUtils;
import android.util.Log;

public class Logger {

    public static boolean IS_SHOW_LOG = false;
    public static String TAG = Logger.class.getSimpleName();

    public static void init(boolean isShowLog) {
        IS_SHOW_LOG = isShowLog;
    }

    public static void i(String msg, Object... args) {
        print(Log.INFO, TAG, msg, args);
    }

    public static void i(String tag, String msg, Object... args) {
        print(Log.INFO, tag, msg, args);
    }

    public static void d(String msg, Object... args) {
        print(Log.DEBUG, TAG, msg, args);
    }

    public static void d(String tag, String msg, Object... args) {
        print(Log.DEBUG, tag, msg, args);
    }

    public static void e(String msg, Object... args) {
        print(Log.ERROR, TAG, msg, args);
    }

    public static void e(String tag, String msg, Object... args) {
        print(Log.ERROR, tag, msg, args);
    }

    public static void w(String msg, Object... args) {
        print(Log.WARN, TAG, msg, args);
    }

    public static void w(String tag, String msg, Object... args) {
        print(Log.WARN, tag, msg, args);
    }

    public static void json(String json){
        json(Log.DEBUG, TAG, json);
    }

    public static void json(String tag,String json) {
        json(Log.DEBUG, tag, json);
    }

    public static void json(int logLevel, String tag, String json) {
        if (IS_SHOW_LOG) {
            String formatJson = LogFormat.formatBorder(new String[]{LogFormat.formatJson(json)});
            XPrinter.println(logLevel, TextUtils.isEmpty(tag) ? TAG : tag, formatJson);
        }
    }

    public static void xml(String xml) {
        xml(Log.DEBUG, null, xml);
    }


    public static void xml(int logLevel, String tag, String xml) {
        if (IS_SHOW_LOG) {
            String formatXml = LogFormat.formatBorder(new String[]{LogFormat.formatXml(xml)});
            XPrinter.println(logLevel, TextUtils.isEmpty(tag) ? TAG : tag, formatXml);
        }
    }

    public static void error(Throwable throwable) {
        error(null, throwable);
    }

    public static void error(String tag, Throwable throwable) {
        if (IS_SHOW_LOG) {
            String formatError = LogFormat.formatBorder(new String[]{LogFormat.formatThrowable(throwable)});
            XPrinter.println(Log.ERROR, TextUtils.isEmpty(tag) ? TAG : tag, formatError);
        }
    }

    private static void print(int logLevel, String tag, String format, Object... args) {
        if (IS_SHOW_LOG) {
            String formatMsg = LogFormat.formatBorder(new String[]{LogFormat.formatArgs(format, args)});
            XPrinter.println(logLevel, TextUtils.isEmpty(tag) ? TAG : tag, formatMsg);
        }
    }
}
