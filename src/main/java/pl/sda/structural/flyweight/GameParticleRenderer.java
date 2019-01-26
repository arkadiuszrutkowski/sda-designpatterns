package pl.sda.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class GameParticleRenderer {

    private final List<Particle> particles = new ArrayList<Particle>();
    private final List<ParticleSharedData> particleSharedDataList = new ArrayList<ParticleSharedData>();

    public GameParticleRenderer() {
        particleSharedDataList.add(new ParticleSharedData(new byte[]{0, 1, 2, 3}, 10));
        particleSharedDataList.add(new ParticleSharedData(new byte[]{0, 1, 2}, 15));
        particleSharedDataList.add(new ParticleSharedData(new byte[]{0, 1, 2, 3, 4}, 10));
        particleSharedDataList.add(new ParticleSharedData(new byte[]{0, 1, 2, 3}, 13));
    }

    public void add(Particle particle) {
        particles.add(particle);
    }

    public void render() {
        for (Particle particle : particles) {
            System.out.println(particleSharedDataList.get(particle.getParticleSharedDataId()).toString());
            System.out.println(particle.toString());
        }
    }
}
