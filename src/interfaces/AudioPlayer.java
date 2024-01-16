package interfaces;

import java.io.Closeable;
import java.io.Serializable;

public interface AudioPlayer extends Closeable, Serializable, Readable {

  int AUDIO_PLAYERS = 0; // public static final

  default void play() {
    System.out.println("Default audio-player play method");
    someSecretPrivateMethod();
    System.out.println("-----");
  }

  void pause();

  void next();

  void prev();

  void volumeUp();

  void volumeDown();

  static void doSomething() {
    System.out.println("Static method called in Interface");
  }

  private void someSecretPrivateMethod() {
    System.out.println("Private method called in interface");
  }
}
