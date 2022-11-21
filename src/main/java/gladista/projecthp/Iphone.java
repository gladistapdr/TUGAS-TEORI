/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gladista.projecthp;

/**
 *
 * gladista poskomalasari dwi rifan (21103057)
 */
public class Iphone implements Phone {
  private int volume;
  private boolean isPowerOn;

  public Iphone () {
    this.volume = 50;
  }

  public void powerOn () {
    isPowerOn = true;
    System.out.println("Handphone menyala...");
  }

  public void powerOff () {
    isPowerOn = false;
    System.out.println("Handphone dimatikan");
  }

  public void volumeUp() {
    if (isPowerOn) {
        if (this.volume == MAX_VOLUME) {
            System.out.println("Volume FULL!!");
            System.out.println("sudah " + this.getVolume() + "%");
        } else {
            this.volume += 10;
            System.out.println("Volume sekarang: " + this.getVolume());
        }
    } else {
        System.out.println("Nyalian dulu HP nya");
    }
  }

  public void volumeDown() {
    if (isPowerOn) {
        if (this.volume == MIN_VOLUME) {
            System.out.println("Volume = 0%");
        } else {
            this.volume -= 10;
            System.out.println("Volume sekarang: " + this.getVolume());
        }
    } else {
        System.out.println("Nyalian dulu HP nya");
    }
  }

  public int getVolume() {
    return this.volume;
  }
}
