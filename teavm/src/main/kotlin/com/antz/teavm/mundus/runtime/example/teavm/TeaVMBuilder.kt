package com.antz.teavm.mundus.runtime.example.teavm

import java.io.File
import com.github.xpenatan.gdx.backends.teavm.TeaBuildConfiguration
import com.github.xpenatan.gdx.backends.teavm.config.TeaBuilder
import com.github.xpenatan.gdx.backends.teavm.config.plugins.TeaReflectionSupplier
import com.github.xpenatan.gdx.backends.teavm.gen.SkipClass

/** Builds the TeaVM/HTML application. */
@SkipClass
object TeaVMBuilder {
    @JvmStatic fun main(arguments: Array<String>) {
        val teaBuildConfiguration = TeaBuildConfiguration().apply {
            assetsPath.add(File("../assets"))
            webappPath = File("build/dist").canonicalPath
            htmlTitle = "MundusRuntimeExample-TeaVM"

            // Register any extra classpath assets here:
            additionalAssetsClasspathFiles += "com/mbrlabs/mundus/commons/shaders/skybox.frag.glsl"
            additionalAssetsClasspathFiles += "com/mbrlabs/mundus/commons/shaders/skybox.vert.glsl"
            additionalAssetsClasspathFiles += "com/mbrlabs/mundus/commons/shaders/terrain.uber.frag.glsl"
            additionalAssetsClasspathFiles += "com/mbrlabs/mundus/commons/shaders/terrain.uber.vert.glsl"
            additionalAssetsClasspathFiles += "com/mbrlabs/mundus/commons/shaders/water.uber.frag.glsl"
            additionalAssetsClasspathFiles += "com/mbrlabs/mundus/commons/shaders/water.uber.vert.glsl"
            additionalAssetsClasspathFiles += "com/mbrlabs/mundus/commons/shaders/depth.frag.glsl"
            additionalAssetsClasspathFiles += "com/mbrlabs/mundus/commons/shaders/depth.vert.glsl"
            additionalAssetsClasspathFiles += "com/mbrlabs/mundus/commons/shaders/shadowmap.frag.glsl"
            additionalAssetsClasspathFiles += "com/mbrlabs/mundus/commons/shaders/shadowmap.vert.glsl"
            additionalAssetsClasspathFiles += "com/mbrlabs/mundus/commons/shaders/light.glsl"
            additionalAssetsClasspathFiles += "com/mbrlabs/mundus/commons/shaders/compat.glsl"
            additionalAssetsClasspathFiles += "com/mbrlabs/mundus/commons/shaders/custom-gdx-pbr.fs.glsl"
            additionalAssetsClasspathFiles += "com/mbrlabs/mundus/commons/shaders/custom-gdx-pbr.vs.glsl"
        }

        // Register any classes or packages that require reflection here:
        TeaReflectionSupplier.addReflectionClass("com.mbrlabs.mundus.commons.dto.SceneDTO")
        TeaReflectionSupplier.addReflectionClass("com.mbrlabs.mundus.commons.dto.GameObjectDTO")
        TeaReflectionSupplier.addReflectionClass("com.mbrlabs.mundus.commons.dto.WaterComponentDTO")
        TeaReflectionSupplier.addReflectionClass("com.mbrlabs.mundus.commons.dto.TerrainComponentDTO")
        TeaReflectionSupplier.addReflectionClass("com.mbrlabs.mundus.commons.dto.BaseLightDTO")
        TeaReflectionSupplier.addReflectionClass("com.mbrlabs.mundus.commons.dto.LightComponentDTO")
        TeaReflectionSupplier.addReflectionClass("com.mbrlabs.mundus.commons.dto.CustomPropertiesComponentDTO")
        TeaReflectionSupplier.addReflectionClass("com.mbrlabs.mundus.commons.dto.DirectionalLightDTO")
        TeaReflectionSupplier.addReflectionClass("com.mbrlabs.mundus.commons.dto.ShadowSettingsDTO")
        TeaReflectionSupplier.addReflectionClass("com.mbrlabs.mundus.commons.dto.FogDTO")
        TeaReflectionSupplier.addReflectionClass("com.mbrlabs.mundus.commons.dto.ModelComponentDTO")
        TeaReflectionSupplier.addReflectionClass("com.mbrlabs.mundus.commons.water.WaterResolution")
        TeaReflectionSupplier.addReflectionClass("com.mbrlabs.mundus.commons.shadows.ShadowResolution")
        TeaReflectionSupplier.addReflectionClass("com.mbrlabs.mundus.commons.env.lights.LightType")

        val tool = TeaBuilder.config(teaBuildConfiguration)
        tool.mainClass = "com.antz.teavm.mundus.runtime.example.teavm.TeaVMLauncher"
        TeaBuilder.build(tool)
    }
}
