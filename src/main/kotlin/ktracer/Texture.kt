package ktracer


/**
 * Represents texture data used for either sampling or rendering to.
 * @param data ARGB pixels to be stored.
 */
class Texture(val data:IntArray, val width:Int, val height:Int)
{
    init
    {
        // Checks that arguments make sense.
        require(width >= 0 && height >= 0){"Negative width or height not allowed."}
        require(width*height == data.size){ "Size ($width x $height) was not equal to data length (${data.size})"}
    }
}