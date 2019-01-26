package pl.sda.structural.flyweight;

public class FlyweightMain {

    public static void main(String[] args) {
        GameParticleRenderer renderer = new GameParticleRenderer();
        renderer.add(new Particle(0, 13, 14, 54));
        renderer.add(new Particle(0, 13, 14, 54));
        renderer.add(new Particle(1, 13, 14, 54));
        renderer.add(new Particle(1, 13, 14, 54));
        renderer.add(new Particle(2, 13, 14, 54));
        renderer.add(new Particle(3, 13, 14, 54));

        renderer.render();
    }
}
