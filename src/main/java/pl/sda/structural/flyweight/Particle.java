package pl.sda.structural.flyweight;

import java.util.Arrays;

public class Particle {

    private final int particleSharedDataId;
    private final double x, y;
    private final double velocity;

    public Particle(int particleSharedDataId, double x, double y, double velocity) {
        this.particleSharedDataId = particleSharedDataId;
        this.x = x;
        this.y = y;
        this.velocity = velocity;
    }

    public int getParticleSharedDataId() {
        return particleSharedDataId;
    }

    @Override
    public String toString() {
        return "Particle{" +
                "particleSharedDataId=" + particleSharedDataId +
                ", x=" + x +
                ", y=" + y +
                ", velocity=" + velocity +
                '}';
    }
}
