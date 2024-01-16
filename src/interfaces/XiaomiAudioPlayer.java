package interfaces;

import java.io.IOException;
import java.nio.CharBuffer;

public class XiaomiAudioPlayer implements AudioPlayer {

  @Override
  public void pause() {
    System.out.println("Xiaomi pauses");
  }

  @Override
  public void next() {

  }

  @Override
  public void prev() {

  }

  @Override
  public void volumeUp() {

  }

  @Override
  public void volumeDown() {

  }

  @Override
  public void close() throws IOException {

  }

  @Override
  public int read(CharBuffer cb) throws IOException {
    return 0;
  }
}
