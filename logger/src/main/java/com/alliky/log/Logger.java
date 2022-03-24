package com.alliky.log;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.FormatStrategy;
import com.orhanobut.logger.PrettyFormatStrategy;

public final class Logger {

    private static final int VERBOSE = 1;
    private static final int DEBUG = 2;
    private static final int INFO = 3;
    private static final int WARN = 4;
    private static final int ERROR = 5;
    private static final int NOTHING = 6;

    //控制log等级
    private static int LEVEL = VERBOSE;
    private static boolean IS_SHOW = false;

    public static void init(boolean isShow) {
        IS_SHOW = isShow;
        FormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder()
                .showThreadInfo(false)  // (Optional) Whether to show thread info or not. Default true
                .methodCount(0)         // (Optional) How many method line to show. Default 2
                .methodOffset(7)        // (Optional) Hides internal method calls up to offset. Default 5
                .logStrategy(new CustomLogCatStrategy()) // (Optional) Changes the log strategy to print out. Default LogCat
                .tag("chonglaoban-")   // (Optional) Global tag for every log. Default PRETTY_LOGGER
                .build();

        com.orhanobut.logger.Logger.addLogAdapter(new AndroidLogAdapter(formatStrategy));
    }

    public static void v(String tag, String message) {
        if (IS_SHOW && LEVEL <= VERBOSE) {
            com.orhanobut.logger.Logger.t(tag).v(message);
        }
    }

    public static void d(String tag, Object message) {
        if (IS_SHOW && LEVEL <= DEBUG) {
            com.orhanobut.logger.Logger.t(tag).d(message);
        }
    }

    public static void d(Object message) {
        if (IS_SHOW && LEVEL <= DEBUG) {
            com.orhanobut.logger.Logger.d(message);
        }
    }

    public static void i(String tag, String message) {
        if (IS_SHOW && LEVEL <= INFO) {
            com.orhanobut.logger.Logger.t(tag).i(message);
        }
    }

    public static void w(String tag, String message) {
        if (IS_SHOW && LEVEL <= WARN) {
            com.orhanobut.logger.Logger.t(tag).w(message);
        }
    }

    public static void json(String tag, String message) {
        if (IS_SHOW && LEVEL <= WARN) {
            com.orhanobut.logger.Logger.t(tag).json(message);
        }
    }

    public static void e(String tag, String message) {
        if (IS_SHOW && LEVEL <= ERROR) {
            com.orhanobut.logger.Logger.t(tag).e(message);
        }
    }
}
