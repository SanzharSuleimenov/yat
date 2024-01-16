package interfaces;

public class Main {

  public static void main(String[] args) {
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
  }

}
