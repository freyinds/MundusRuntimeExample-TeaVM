@file:JvmName("TeaVMLauncher")

package com.antz.teavm.mundus.runtime.example.teavm

import com.antz.teavm.mundus.runtime.example.MundusExample
import com.github.xpenatan.gdx.backends.teavm.TeaApplicationConfiguration
import com.github.xpenatan.gdx.backends.teavm.TeaApplication

/** Launches the TeaVM/HTML application. */
fun main() {
    val config = TeaApplicationConfiguration("canvas").apply {
        width = 0;
        height = 0;
        antialiasing = true
        usePhysicalPixels = true
    }
    TeaApplication(MundusExample(), config)
}
