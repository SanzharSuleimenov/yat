package practice.exercise6;

import java.util.Random;

public class Runner {

  public static void main(String[] args) {
    Random random = new Random();

    MyPoint begin1 = new MyPoint(random.nextInt(10), random.nextInt(15));
    MyPoint end1 = new MyPoint(random.nextInt(10), random.nextInt(15));
    MyLine m1 = new MyLine(begin1, end1);
    System.out.println(m1);
    System.out.println(m1.getGradient());
    System.out.println(m1.getLength());
    m1.setBeginX(3);
    System.out.println(m1);
    m1.setEndXY(5, 9);
    System.out.println(m1);
    System.out.println(m1.getGradient());
    System.out.println(m1.getLength());
  }
}
