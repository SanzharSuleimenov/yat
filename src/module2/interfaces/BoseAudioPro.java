package module2.interfaces;

import java.io.IOException;
import java.nio.CharBuffer;

public class BoseAudioPro implements AudioPlayer {

  @Override
  public void play() {
    System.out.println("Bose play");
  }

  @Override
  public void pause() {
    System.out.println("Bose  pause");
  }

  @Override
  public void next() {
    System.out.println("Bose next");
  }

  @Override
  public void prev() {
    System.out.println("Bose prev");
  }

  @Override
  public void volumeUp() {
    System.out.println("Bose volumeUp");
  }

  @Override
  public void volumeDown() {
    System.out.println("Bose volumeDown");
  }

  @Override
  public void close() throws IOException {
    System.out.println("Bose tries to close resources...");
  }

  @Override
  public int read(CharBuffer cb) throws IOException {
    return 0;
  }
}
