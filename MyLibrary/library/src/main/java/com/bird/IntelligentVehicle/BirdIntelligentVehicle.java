/*[BIRD_INTELLIGENT_VEHICLE] wushiyong 20160726 begin*/
package com.bird.IntelligentVehicle;

import android.content.Context;
/*
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import android.util.Log;
import android.provider.Settings;
*/

public class BirdIntelligentVehicle {


	public void BirdOpenUartPort(int port) {
	}

	public void BirdCloseUartPort(int port) {
	}
	 
    /***************************************************Interface begin****************************************************/
    /*
     * Method: BirdReadDataFromUartPort
     * 从uart口读数据
     */
	public String BirdReadDataFromUartPort(int port) {
		return null;
	}
	
    /*
     * Method: BirdWriteDataToUartPort
     * 往uart口写数据
     */
	public void BirdWriteDataToUartPort(int port, String data) {

	}

	public void BirdWriteDataToUartPort(int port, byte [] data) {

	}
	
    /*
     * Method: BirdOpenExternalBluetooth
     * 打开外挂蓝牙设备
     */
	public void BirdOpenExternalBluetooth(Context context) {
	}

    /*
     * Method: BirdCloseExternalBluetooth
     * 关闭外挂蓝牙设备
     */
	public void BirdCloseExternalBluetooth(Context context) {
	}
	
    /*
     * Method: BirdSwitchExternalBluetoothToAudio
     * 外挂蓝牙耳机切换到音频模式
     */
	public void BirdSwitchExternalBluetoothToAudio(Context context) {
	}

    /*
     * Method: BirdSwitchExternalBluetoothToNomal
     * 外挂蓝牙切回正常模式
     */
	public void BirdSwitchExternalBluetoothToNomal(Context context) {
	}
	
    /*
     * Method: BirdGetElectronicDogOpenState
     * 获取蓝牙设备开启状态，返回1表示开启，0表示关闭状态
     */
	public int BirdGetExternalBluetoothOpenState(Context context) {
		return 0;
	}
    /*
     * Method: BirdGetExternalBluetoothMode
     * 获取蓝牙设备工作状态，返回1表示切到音频通路，0表示正常模式
     */
	public int BirdGetExternalBluetoothMode(Context context) {
        return 0;
	}
	
    /*
     * Method: BirdOpenElectronicDog
     * 打开电子狗设备
     */
	public void BirdOpenElectronicDog(Context context) {
	}

    /*
     * Method: BirdCloseElectronicDog
     * 关闭电子狗设备
     */
	public void BirdCloseElectronicDog(Context context) {
	}
	
    /*
     * Method: BirdGetElectronicDogOpenState
     * 获取电子狗设备开启状态，返回1表示开启，0表示关闭状态
     */
	public int BirdGetElectronicDogOpenState(Context context) {
        return 0;
	}
	
    /*
     * Method: BirdOpenExternalFM
     * 打开外挂FM设备
     */
	public void BirdOpenExternalFM(Context context) {
	}

    /*
     * Method: BirdCloseExternalFM
     * 关闭外挂FM设备
     */
	public void BirdCloseExternalFM(Context context) {
	}
	
    /*
     * Method: BirdGetExternalFMOpenState
     * 获取外挂FM设备开启状态，返回1表示开启，0表示关闭状态
     */
	public int BirdGetExternalFMOpenState(Context context) {
        return 0;
	}
	
    /*
     * Method: BirdGetExternalFMFrequency
     * 获取FM的频率 76MHz-108MHz --> 7600-10800
     */
	public int BirdGetExternalFMFrequency(Context context) {
        return 0;
	}

    /*
     * Method: BirdSetExternalFMFrequency
     * 设置FM的频率 76MHz-108MHz --> 7600-10800
     */
	public void BirdSetExternalFMFrequency(Context context, int frequency) {
	}
	
    /*
     * Method: SetGpioLightOn
     * 设置Gpio口控制的灯亮
     */
	public void BirdSetGpioLightOn(int gpioId) {
	}
	
    /*
     * Method: SetGpioLightOff
     * 设置Gpio口控制的灯灭
     */
	public void BirdSetGpioLightOff(int gpioId) {
	}
	
    /*
     * Method: SetGpioLightOn
     * 设置Isink控制的灯亮
     */
	public void BirdSetIsinkLightOn(int isinkId) {
	}
	
    /*
     * Method: SetGpioLightOff
     * 设置Isink控制的灯灭
     */
	public void BirdSetIsinkLightOff(int isinkId) {
	}
    /***************************************************Interface end****************************************************/
}
/*[BIRD_INTELLIGENT_VEHICLE] wushiyong 20160726 end*/

