package com.haitao.maventest;

import android.util.Log;

/**
 * @ClassName: LogUtil
 * @Description: java类作用描述
 * @Author: Pan
 * @CreateDate: 2019/12/4 9:00
 */
public class LogUtil {
    private static final String TAG = "LogUtil";

    public static void debug(String message) {
        Log.e(TAG, message);
    }
}
