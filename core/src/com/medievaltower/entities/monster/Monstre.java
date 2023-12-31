package com.medievaltower.entities.monster;

import com.badlogic.gdx.graphics.Texture;
import com.medievaltower.core.AttackableEntity;
import com.medievaltower.core.Entity;
import com.medievaltower.core.MovableEntity;

/**
 * Monstre class
 * <p>
 *     This class is the parent class of all monster in the game.
 *     It contains the position, the size and the texture of the monster.
 *     It also contains the update method.
 *     It is abstract because it is not supposed to be instantiated.
 *     It extends the Entity class.
 * </p>
 * @see Entity
 * @see Texture
 */
public abstract class Monstre extends Entity implements AttackableEntity, MovableEntity {
    protected int speed = 100;

    /**
     * Monstre constructor
     * @param x : the x position of the monster
     * @param y : the y position of the monster
     */
    public Monstre(int x, int y, int width, int height, Texture texture) {
        super(x, y, width, height, texture);
    }

    /**
     * Update the monster
     * called in the subclass
     */
    @Override
    public void update() {
        super.update();
    }

    /**
     * Move the monster
     * defined in the subclass
     */
    public void move(){
        super.move();
    }

    /**
     * Collide with an entity
     * @param entity : the entity that collide with the monster
     */
    public void collide(Entity entity){

    }
}
