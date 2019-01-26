package pl.sda.structural.flyweight;

import java.util.Arrays;

public class ParticleSharedData {

    private final byte[] sprite;
    private final int spriteTint;

    public ParticleSharedData(byte[] sprite, int spriteTint) {
        this.sprite = sprite;
        this.spriteTint = spriteTint;
    }

    @Override
    public String toString() {
        return "ParticleSharedData{" +
                "sprite=" + Arrays.toString(sprite) +
                ", spriteTint=" + spriteTint +
                '}';
    }
}
