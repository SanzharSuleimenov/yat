package module2.lesson3;

public class AggregationSample {

  private Particle particle;

  public AggregationSample() {}

  public AggregationSample(Particle particle) {
    this.particle = particle;
  }

  public Particle getParticle() {
    return particle;
  }

  public void setParticle(Particle particle) {
    this.particle = particle;
  }
}
