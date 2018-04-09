package cat.flx.plataformes.characters;

import cat.flx.plataformes.GameEngine;

/**
 * Created by alu2012082 on 12/03/2018.
 */

public class Life extends Character {

    public Life(GameEngine gameEngine, int x, int y) {

        super(gameEngine, x, y);
    }
    private static final int[][] ANIMATIONS = new int[][] {
            new int[] { 100, 101, 102, 103, 104, 105, 106, 107, 108, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123 }
    };



    @Override int[][] getAnimations() { return ANIMATIONS; }

    @Override void updatePhysics(int delta) { }

    @Override void updateCollisionRect() {
        collisionRect.set(x, y, x + 12, y + 12);
    }
}
