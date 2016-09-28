package com.broadsense.androidutils;

import android.text.TextUtils;
import android.util.Log;

import java.util.List;


/**
 * Log工具类
 */
public class LogUtils {
	/** 日志输出时的TAG */
	public static String mTag = "zx";
	/** 日志输出级别NONE */
	public static final int LEVEL_OFF = 0;
	/** 日志输出级别NONE */
	private static final int LEVEL_ALL = 7;
	/** 日志输出级别V */
	private static final int LEVEL_VERBOSE = 1;
	/** 日志输出级别D */
	private static final int LEVEL_DEBUG = 2;
	/** 日志输出级别I */
	private static final int LEVEL_INFO = 3;
	/** 日志输出级别W */
	private static final int LEVEL_WARN = 4;
	/** 日志输出级别E */
	private static final int LEVEL_ERROR = 5;
	/** 日志输出级别S,自定义一个级别 */
	private static final int LEVEL_SYSTEM = 6;

	/** 是否允许输出log */
	public static int mDebuggable = LEVEL_ALL;

	/** 用于记时的变量 */
	private static long mTimestamp = 0;

	/**---------------日志输出,已固定TAG  begin---------------**/
	/** 以级别为 d 的形式输出LOG */
	public static void v(String msg) {
		if (mDebuggable >= LEVEL_VERBOSE) {
			Log.v(mTag, formatMsg("", msg));
		}
	}

	/** 以级别为 d 的形式输出LOG */
	public static void d(String msg) {
		if (mDebuggable >= LEVEL_DEBUG) {
			Log.d(mTag, formatMsg("", msg));
		}
	}

	/** 以级别为 i 的形式输出LOG */
	public static void i(String msg) {
		if (mDebuggable >= LEVEL_INFO) {
			Log.i(mTag, formatMsg("", msg));
		}
	}

	/** 以级别为 w 的形式输出LOG */
	public static void w(String msg) {
		if (mDebuggable >= LEVEL_WARN) {
			Log.w(mTag, formatMsg("", msg));
		}
	}

	/** 以级别为 w 的形式输出Throwable */
	public static void w(Throwable tr) {
		if (mDebuggable >= LEVEL_WARN) {
			Log.w(mTag, "", tr);
		}
	}

	/** 以级别为 w 的形式输出LOG信息和Throwable */
	public static void w(String msg, Throwable tr) {
		if (mDebuggable >= LEVEL_WARN && null != msg) {
			Log.w(mTag, formatMsg("", msg), tr);
		}
	}

	/** 以级别为 e 的形式输出LOG */
	public static void e(String msg) {
		if (mDebuggable >= LEVEL_ERROR) {
			Log.e(mTag, formatMsg("", msg));
		}
	}

	/** 以级别为 s 的形式输出LOG,主要是为了System.out.println,稍微格式化了一下 */
	public static void sf(String msg) {
		if (mDebuggable >= LEVEL_ERROR) {
			System.out.println("----------" + msg + "----------");
		}
	}

	/** 以级别为 s 的形式输出LOG,主要是为了System.out.println */
	public static void s(String msg) {
		if (mDebuggable >= LEVEL_ERROR) {
			System.out.println(msg);
		}
	}

	/** 以级别为 e 的形式输出Throwable */
	public static void e(Throwable tr) {
		if (mDebuggable >= LEVEL_ERROR) {
			Log.e(mTag, "", tr);
		}
	}

	/** 以级别为 e 的形式输出LOG信息和Throwable */
	public static void e(String msg, Throwable tr) {
		if (mDebuggable >= LEVEL_ERROR && null != msg) {
			Log.e(mTag, formatMsg("", msg), tr);
		}
	}
	/**---------------日志输出,已固定TAG  end---------------**/

	/**---------------日志输出,未固定TAG  begin---------------**/
	/** 以级别为 d 的形式输出LOG */
	public static void v(String tag, String msg) {
		if (mDebuggable >= LEVEL_VERBOSE) {
			Log.v(tag, formatMsg(tag, msg));
		}
	}

	/** 以级别为 d 的形式输出LOG */
	public static void d(String tag, String msg) {
		if (mDebuggable >= LEVEL_DEBUG) {
			Log.d(tag, formatMsg(tag, msg));
		}
	}

	/** 以级别为 i 的形式输出LOG */
	public static void i(String tag, String msg) {
		if (mDebuggable >= LEVEL_INFO) {
			Log.i(tag, formatMsg(tag, msg));
		}
	}

	/** 以级别为 w 的形式输出LOG */
	public static void w(String tag, String msg) {
		if (mDebuggable >= LEVEL_WARN) {
			Log.w(tag, formatMsg(tag, msg));
		}
	}

	/** 以级别为 e 的形式输出LOG */
	public static void e(String tag, String msg) {
		if (mDebuggable >= LEVEL_ERROR) {
//			MyLog.d(tag, msg);
			Log.e(tag, formatMsg(tag, msg));
		}
	}


	private static String formatMsg(String tag, String msg){
		return "[" + getPid() + "]" + "[" + tag + "] [thread=" + Thread.currentThread().getId() + "] ====== " + msg;
	}

	/**
	 * @return 返回进程ID和调用该进程的ID
	 */
	private static String getPid(){
		return "pid:"+android.os.Process.myPid()+" tid:"+android.os.Process.myTid();
	}
	/**---------------日志输出,未固定TAG  end---------------**/


	/**
	 * 以级别为 e 的形式输出msg信息,附带时间戳，用于输出一个时间段起始点
	 * 
	 * @param msg
	 *            需要输出的msg
	 */
	public static void msgStartTime(String msg) {
		mTimestamp = System.currentTimeMillis();
		if (!TextUtils.isEmpty(msg)) {
			e("[Started：" + mTimestamp + "]" + msg);
		}
	}

	/** 以级别为 e 的形式输出msg信息,附带时间戳，用于输出一个时间段结束点* @param msg 需要输出的msg */
	public static void elapsed(String msg) {
		long currentTime = System.currentTimeMillis();
		long elapsedTime = currentTime - mTimestamp;
		mTimestamp = currentTime;
		e("[Elapsed：" + elapsedTime + "]" + msg);
	}

	public static <T> void printList(List<T> list) {
		if (list == null || list.size() < 1) {
			return;
		}
		int size = list.size();
		i("---begin---");
		for (int i = 0; i < size; i++) {
			i(i + ":" + list.get(i).toString());
		}
		i("---end---");
	}

	public static <T> void printArray(T[] array) {
		if (array == null || array.length < 1) {
			return;
		}
		int length = array.length;
		i("---begin---");
		for (int i = 0; i < length; i++) {
			i(i + ":" + array[i].toString());
		}
		i("---end---");
	}
}
