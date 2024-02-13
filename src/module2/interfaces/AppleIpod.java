package module2.interfaces;

import java.io.IOException;
import java.nio.CharBuffer;

public class AppleIpod implements AudioPlayer {

  @Override
  public void play() {
    System.out.println("AppleIpod play");
  }

  @Override
  public void pause() {
    System.out.println("AppleIpod  pause");
  }

  @Override
  public void next() {
    System.out.println("AppleIpod next");
  }

  @Override
  public void prev() {
    System.out.println("AppleIpod prev");
  }

  @Override
  public void volumeUp() {
    System.out.println("AppleIpod volumeUp");
  }

  @Override
  public void volumeDown() {
    System.out.println("AppleIpod volumeDown");
  }

  @Override
  public void close() throws IOException {
    System.out.println("Apple safely closes resources!");
  }

  @Override
  public int read(CharBuffer cb) throws IOException {
    return 0;
  }
}
