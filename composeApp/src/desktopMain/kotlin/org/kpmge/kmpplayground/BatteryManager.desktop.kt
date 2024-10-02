package org.kpmge.kmpplayground

import oshi.SystemInfo
import kotlin.math.roundToInt

actual class BatteryManager {
    actual fun getBatteryLevel(): Int {
        val systemInfo = SystemInfo()
        val batteryLevel = systemInfo?.hardware?.powerSources?.firstOrNull()
        return batteryLevel?.remainingCapacityPercent?.times(100.0)?.toInt() ?: -1
    }
}