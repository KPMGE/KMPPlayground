package org.kpmge.kmpplayground
import platform.UIkit.UIDevice

actual class BatteryManager {
    actual fun getBatteryLevel(): Int {
       UIDevice.currentDevice.batteryMonitorEnabled = true
        val batteryLevel = UIDevice.currentDevice.batteryLevel
        return (batteryLevel * 100).roundToInt()
    }
}