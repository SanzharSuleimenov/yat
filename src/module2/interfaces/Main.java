package module2.interfaces;

import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
    AudioPlayer xiaomiAudioPlayer = new XiaomiAudioPlayer();
    xiaomiAudioPlayer.play();
    xiaomiAudioPlayer.pause();
  }

  private static void oneTwoThree() throws IOException {
    AppleIpod appleIpod = new AppleIpod();
    BoseAudioPro boseAudioPro = new BoseAudioPro();
    SonyWalkman sonyWalkman = new SonyWalkman();

    appleIpod.play();
    boseAudioPro.play();
    sonyWalkman.play();

    System.out.print("-------------------\n");

    AudioPlayer ipod = appleIpod;
    AudioPlayer bose = boseAudioPro;
    AudioPlayer sony = sonyWalkman;

    ipod.next();
    bose.next();
    sony.next();

    System.out.print("-------------------\n");

    sonyWalkman.close();
  }

}
