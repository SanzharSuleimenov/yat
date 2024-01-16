package interfaces;

import java.io.IOException;
import java.nio.CharBuffer;

public class SonyWalkman implements AudioPlayer {

  @Override
  public void play() {
    System.out.println("Sony play");
  }

  @Override
  public void pause() {
    System.out.println("Sony  pause");
  }

  @Override
  public void next() {
    System.out.println("Sony next");
  }

  @Override
  public void prev() {
    System.out.println("Sony prev");
  }

  @Override
  public void volumeUp() {
    System.out.println("Sony volumeUp");
  }

  @Override
  public void volumeDown() {
    System.out.println("Sony volumeDown");
  }

  @Override
  public void close() throws IOException {
    System.out.println("Properly closing Sony audio player resources");
  }

  @Override
  public int read(CharBuffer cb) throws IOException {
    return 0;
  }
}
