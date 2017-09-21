package ktracer

import ktracer.math.Rect3
import ktracer.math.Vec3

/**
 * Represents some object in a scene that can be ray traced.
 */
interface SceneObject
{
    /**
     * AABB that encompases the SceneObject.
     * Necessary for optimization purposes.
     */
    fun aabb(): Rect3

    /**
     * Attempts to solves for an intersection between
     * a ray and this SceneObject.
     *
     * @param rayOrigin Origin of the ray being casted.
     * @param rayDirection Direction of the ray being casted.
     *
     * @return Intersection that was found, or null when there was no intersection.
     * No intersection should be returned when this object is behind the ray.
     * For instance, if t < 0.
     */
    fun intersect(rayOrigin: Vec3, rayDirection: Vec3):Intersection?
}