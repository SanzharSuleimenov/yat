package module2.lesson3;

public class CompositionSample {

  private Particle particle;

  public CompositionSample() {
    this.particle = new Particle();
  }

  public CompositionSample(String name) {
    this.particle = new Particle(name);
  }

  public Particle getParticle() {
    return this.particle;
  }

  public void setParticle(Particle particle) {
    this.particle = particle;
  }
}
