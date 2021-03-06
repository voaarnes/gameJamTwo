package jamtwo.engine.component

import com.badlogic.ashley.core.Component
import com.badlogic.gdx.graphics.g2d.Sprite
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.utils.Pool
import jamtwo.unitScale
import ktx.ashley.mapperFor

class GraphicComponent : Component, Pool.Poolable {
    val sprite = Sprite()

    override fun reset(){
        sprite.texture = null
        sprite.setColor(1f, 1f, 1f, 1f)
    }

    fun setSpriteRegion(texRegion: TextureRegion) {
        sprite.run {
            setRegion(texRegion)
            setSize(texture.width * unitScale, texture.height * unitScale)
            setOriginCenter()
        }
    }

    companion object{
        val mapper = mapperFor<GraphicComponent>()
    }
}