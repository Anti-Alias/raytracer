# KTracer

This page is dedicated to giving a top-down view of the project as a whole.
KTracer is a ray-tracing API which is capable of rendering photo-realistic images.
While many implementations of ray-tracers are implemented in low-level programming languages like C and C++, KTracer is written in the high-level programming language Kotlin, a JVM language that can be compiled to Java bytecode.
Source code located here.


## Utilizing
To include in your build, be sure to reference it in your build file.
Gradle:
compile group: 'org.velociraptors', name: 'ktracer', version: '1.0.0'

Example Code
import org.velociraptors.ktracer.scene.*
import org.velociraptors.ktracer.graphics.*
import org.velociraptors.ktracer.math.*


```kotlin
fun main(args: Array<String>)
{
    // Creates empty scene
    val scene = Scene()
 
 
    // Configures scene's camera
    scene.camera.dir = Vec3(0, 0, -1)
     
    // Adds a white light to the scene
    scene.lights += Light(
        color = Color.WHITE,
        position = Vec3(0, 10, 0),
        intensity = 1.0
    )
 
 
    // Adds a yellow light to the scene
    scene.lights += Light(
        color = Color.YELLOW,
        position = Vec3(4, 10, 3),
        intensity = 1.0
    )
 
 
    // Adds sphere to the scene
    scene.objects += Sphere(
        position = Vec3(0, 0, 0),
        radius = 2.0,
        color = Color.BLUE,
        shine = 0.1,
        reflect = 0.1
    )
 
 
    // Adds cube to the scene
    scene.objects += Rect(
        size = Vec3(3, 3, 3),
        position = Vec3(1, 2, 3)
        color = Color.BLUE,
        shine = 0.1,
        reflect = 0.1
    )
     
    // Renders scene to texture
    val tex = Texture(width=1024, height=1024)
    scene.render(tex)
 
 
    // Saves texture to file
    tex.saveToFile("sphere.png")
}
```

## Example Images
<img src="https://raw.githubusercontent.com/Anti-Alias/raytracer/master/images/example1.png" width="300" height="200"> <img src="https://raw.githubusercontent.com/Anti-Alias/raytracer/master/images/example2.jpg" width="300" height="200"> <img src="https://raw.githubusercontent.com/Anti-Alias/raytracer/master/images/example3.jpg" width="300" height="200">
