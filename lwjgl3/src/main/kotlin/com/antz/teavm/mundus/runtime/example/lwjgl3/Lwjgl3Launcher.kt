@file:JvmName("Lwjgl3Launcher")

package com.antz.teavm.mundus.runtime.example.lwjgl3

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration
import com.antz.teavm.mundus.runtime.example.MundusExample

/** Launches the desktop (LWJGL3) application. */
fun main() {
    Lwjgl3Application(MundusExample(), Lwjgl3ApplicationConfiguration().apply {
        setTitle("MundusRuntimeExample-TeaVM")
        setWindowedMode(1280, 960)
        setWindowIcon(*(arrayOf(128, 64, 32, 16).map { "libgdx$it.png" }.toTypedArray()))
    })
}
