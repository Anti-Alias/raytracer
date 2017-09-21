package ktracer.math


/**
 * Represents a Rectangle in 3D space.
 */
data class Rect3(val pos: Vec3, val size: Vec3)
{
    // Checks that Rec3 is valid size.
    init
    {
        require(width >= 0 && height >= 0){"Invalid Rect3 size ($width x $height)"}
    }

    /**
     * Width of the Rect3.
     * Same as size.x
     */
    val width:Double get() = size.x

    /**
     * Width of the Rect3.
     * Same as size.y
     */
    val height:Double get() = size.y

    /**
     * Width of the Rect3.
     * Same as size.z
     */
    val depth:Double get() = size.z

    /**
     * Top-left-near corner.
     */
    val topLeftNear: Vec3 get() = pos

    /**
     * Top-left-near corner.
     */
    val topRightNear: Vec3 get() = pos.copy(x=width)

    /**
     * Bottom-left-near corner.
     */
    val bottomLeftNear: Vec3 get() = pos.copy(y=height)

    /**
     * Bottom-left-near corner.
     */
    val bottomRightNear: Vec3 get() = pos.copy(x=width, y=height)

    /**
     * Top-left-far corner.
     */
    val topLeftFar: Vec3 get() = pos.copy(z=size.z)

    /**
     * Top-left-far corner.
     */
    val topRightFar: Vec3 get() = pos.copy(x=width, z=size.z)

    /**
     * Bottom-left-far corner.
     */
    val bottomLeftFar: Vec3 get() = pos.copy(y=height, z=size.z)

    /**
     * Bottom-left-far corner.
     */
    val bottomRightFar: Vec3 get() = pos.copy(x=width, y=height, z=size.z)
}