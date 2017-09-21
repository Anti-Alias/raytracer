package ktracer

import ktracer.math.Vec3

/**
 * Represents the result of an intersection.
 * @param origin Origin that the ray was casted.
 * @param direction Direction at which the ray was casting.
 * @param t interpolation value across direction.
 * @param meta Possible metadata that could be useful later.
 */
data class Intersection(val origin: Vec3, val direction: Vec3, val t:Double, val meta:Any = "")
{
    /**
     * @return Point at which the intersection occurred.
     */
    fun point(): Vec3 = origin + direction * t
}