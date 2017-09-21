package ktracer.math

/**
 * Represents a 3D vector in space.
 * Used for various purposes by a ray-tracer.
 */
data class Vec3(val x:Double, val y:Double, val z:Double)
{
    /**
     * Adds this Vec3 to another.
     */
    operator fun plus(that: Vec3): Vec3 = Vec3(this.x + that.x, this.y + that.y, this.z + that.z)

    /**
     * Subtracts this Vec3 from another.
     */
    operator fun minus(that: Vec3): Vec3 = Vec3(this.x - that.x, this.y - that.y, this.z - that.z)

    /**
     * Multiplies this Vec3 by another.
     */
    operator fun times(that: Vec3): Vec3 = Vec3(this.x * that.x, this.y * that.y, this.z * that.z)

    /**
     * Multiplies this Vec3 by a scalar.
     */
    operator fun times(s:Double): Vec3 = Vec3(this.x * s, this.y * s, this.z * s)

    /**
     * Divides this Vec3 by another.
     */
    operator fun div(that: Vec3): Vec3 = Vec3(this.x / that.x, this.y / that.y, this.z / that.z)

    /**
     * Computes the magnitude, or length of the vector
     * squared. Cheaper to compute than mag().
     */
    fun magSquared():Double = x*x + y*y + z*z

    /**
     * Computes magnitude, or length of the vector.
     */
    fun mag():Double = Math.sqrt(magSquared())

    /**
     * @return Unitized version of this Vector such that
     * its magnitude, or length is 1.
     */
    fun toUnit(): Vec3
    {
        val inverse:Double = 1/mag()
        return Vec3(x * inverse, y * inverse, z * inverse)
    }

    /**
     * Computes the dot product between this vector and another.
     */
    infix fun dot(that: Vec3):Double = this.x * that.x + this.y*that.y + this.z*that.z

    /**
     * Computes the cross product between this vector and another.
     */
    infix fun cross(that: Vec3): Vec3 = Vec3(
            this.y * that.z - this.z - that.y,
            -(this.x * that.z - this.z * that.x),
            this.x * that.y - this.y * that.x
    )

    /**
     * Companion object to Vec3 class.
     */
    companion object
    {
        /**
         * Interpolates a vector across an origin vector and its direction.
         * @param origin Point at which interpolation begins.
         * @param direction Direction at which interpolation translates.
         * @param t Amount to travel in direction. 0 would yield the origin, while 1 would yield origin + direction.
         */
        fun interp(origin: Vec3, direction: Vec3, t:Double): Vec3 = origin + direction * t
    }
}