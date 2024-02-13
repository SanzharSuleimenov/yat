package module2.lesson3;

public class Runner {

  public static void main(String[] args) {
    CompositionSample compositionSample1 = new CompositionSample();
    CompositionSample compositionSample2 = new CompositionSample("Chair");
    System.out.println(compositionSample1.getParticle().getName());
    System.out.println(compositionSample2.getParticle().getName());

    System.out.println("---------------------------");

    Particle particle = new Particle("Sofa");
    AggregationSample aggregationSample1 = new AggregationSample();
    AggregationSample aggregationSample2 = new AggregationSample(particle);

    System.out.println(aggregationSample1.getParticle());
    System.out.println(aggregationSample2.getParticle().getName());
  }

  private static void workingWithOrdinals() {
    System.out.println(isZhetisuiskayaOblast(City.TEKELI));
    System.out.println(isZhetisuiskayaOblast(City.SARKAND));
    System.out.println(isZhetisuiskayaOblast(City.TALDYKORGAN));
    System.out.println(isZhetisuiskayaOblast(City.KARABULAK));
    System.out.println(isZhetisuiskayaOblast(City.ALMATY));
    System.out.println(isZhetisuiskayaOblast(City.ASTANA));
  }

  private static boolean isZhetisuiskayaOblast(City city) {
    return city.ordinal() >= City.TALDYKORGAN.ordinal()
        && city.ordinal() <= City.KARABULAK.ordinal();
  }

  private static void enumMethodsSample() {
    System.out.println(City.AKTAU);
    System.out.println(City.AKTAU.ordinal());
    System.out.println(City.AKTOBE.ordinal());
    System.out.println(City.ALMATY.ordinal());
    System.out.println(City.AKTAU.name());
  }

  private static void enumSample() {
    System.out.println(isHoliday(WeekDay.MONDAY)); // false
    System.out.println(isHoliday(WeekDay.TUESDAY)); // false
    System.out.println(isHoliday(WeekDay.WEDNESDAY)); // false
    System.out.println(isHoliday(WeekDay.FRIDAY)); // false
    System.out.println(isHoliday(WeekDay.THURSDAY)); // false
    System.out.println(isHoliday(WeekDay.SATURDAY)); // true
    System.out.println(isHoliday(WeekDay.SUNDAY)); // true
  }

  private static boolean isHoliday(WeekDay day) {

    return day.equals(WeekDay.SUNDAY) || day.equals(WeekDay.SATURDAY);
  }

  private static void methodOverloadingSampleRunner() {
    System.out.println(Calculator.sum(12, 13));
    System.out.println(Calculator.sum(12, 13, 14));
    System.out.println(Calculator.sum(12, 13, 14, 15));
    System.out.println(Calculator.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    System.out.println(Calculator.sum(1.1, 2));
    System.out.println(Calculator.sum(1.1, 2.2));
    System.out.println(Calculator.sum(1, 2.2));
  }

  private static void staticSampleRunner() {
    Main m1 = new Main();
    System.out.println(Main.getCounter());
    System.out.println(m1.getTag() + "::" + m1.getVersion());
    Main.updateTag(m1);
    System.out.println(m1.getTag());
  }
}
