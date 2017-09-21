package ktracer

/**
 * Represents a scene in which traceable objects are rendered.
 */
class Scene
{
    /**
     * All Objects that are in the scene.
     */
    var objects = emptySet<SceneObject>()

    /**
     * Renders current scene to a texture.
     * @param texture Texture to render to.
     */
    fun render(texture:Texture)
    {

    }
}