/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package gladista.projecthp;

/**
 *
 * gladista poskomalasari dwi rifan (21103057)
 */
import java.util.Scanner;
public class ProjectHp {
    
    public static void main(String[] args) throws Exception {
        Phone xiaomi = new Xiaomi();
        Phone iphone = new Iphone();

        PhoneUser Gladista = new PhoneUser(xiaomi);
        PhoneUser Poskomalasari = new PhoneUser(iphone);

        Scanner input = new Scanner(System.in);

        int pil;

        do {
            System.out.println("APLIKASI INTERFACE");
            System.out.println("");
            System.out.println("Silahkan pilih HP");
            System.out.println("1. Xiaomi");
            System.out.println("2. Iphone");
            System.out.println("3. Samsung");
            System.out.println("4. Oppo");
            System.out.println("0. Keluar Aplikasi");
            System.out.println("");
            System.out.print("Pilih   : ");
            pil = input.nextInt();

            System.out.println("");
            System.out.println("");

            switch (pil) {
                case 1 :
                    do {
                        System.out.println("Menu HP Xiaomi");
                        System.out.println("1. Nyalakan HP");
                        System.out.println("2. Matikan HP");
                        System.out.println("3. Perbesar Volume");
                        System.out.println("4. Perkecil Volume");
                        System.out.println("0. Keluar");
                        System.out.print("Silahkan pilih : ");
                        pil = input.nextInt();

                        System.out.println("");
                        System.out.println("");

                        switch (pil) {
                            case 1 :
                                Gladista.turnOnThePhone();
                                break;
                            case 2 :
                                Gladista.turnOffThePhone();
                                break;
                            case 3 :
                                Gladista.makePhoneLouder();
                                break;
                            case 4 :
                                Gladista.makePhoneSilent();
                                break;
                            case 0 :
                                main(args);
                                break;
                            default :
                                System.out.println("Silahkan masukan data yang benar!!");
                        }

                    } while (pil != 0);
                    break;
                case 2 :
                    do {
                        System.out.println("Menu HP Iphone");
                        System.out.println("1. Nyalakan HP");
                        System.out.println("2. Matikan HP");
                        System.out.println("3. Perbesar Volume");
                        System.out.println("4. Perkecil Volume");
                        System.out.println("0. Keluar");
                        System.out.print("Silahkan pilih : ");
                        pil = input.nextInt();

                        System.out.println("");
                        System.out.println("");

                        switch (pil) {
                            case 1 :
                                Poskomalasari.turnOnThePhone();
                                break;
                            case 2 :
                                Poskomalasari.turnOffThePhone();
                                break;
                            case 3 :
                                Poskomalasari.makePhoneLouder();
                                break;
                            case 4 :
                                Poskomalasari.makePhoneSilent();
                                break;
                            case 0 :
                                main(args);
                                break;
                            default :
                                System.out.println("Silahkan masukan data yang benar!!.");
                        }
                    } while (pil != 0);
                    break;
                    case 3 :
                    do {
                        System.out.println("Menu HP Samsung");
                        System.out.println("1. Nyalakan HP");
                        System.out.println("2. Matikan HP");
                        System.out.println("3. Perbesar Volume");
                        System.out.println("4. Perkecil Volume");
                        System.out.println("0. Keluar");
                        System.out.print("Silahkan pilih : ");
                        pil = input.nextInt();

                        System.out.println("");
                        System.out.println("");

                        switch (pil) {
                            case 1 :
                                Gladista.turnOnThePhone();
                                break;
                            case 2 :
                                Gladista.turnOffThePhone();
                                break;
                            case 3 :
                                Gladista.makePhoneLouder();
                                break;
                            case 4 :
                                Gladista.makePhoneSilent();
                                break;
                            case 0 :
                                main(args);
                                break;
                            default :
                                System.out.println("Silahkan masukan data yang benar!!");
                        }

                    } while (pil != 0);
                    break;
                    case 4 :
                    do {
                        System.out.println("Menu HP Oppo");
                        System.out.println("1. Nyalakan HP");
                        System.out.println("2. Matikan HP");
                        System.out.println("3. Perbesar Volume");
                        System.out.println("4. Perkecil Volume");
                        System.out.println("0. Keluar");
                        System.out.print("Silahkan pilih : ");
                        pil = input.nextInt();

                        System.out.println("");
                        System.out.println("");

                        switch (pil) {
                            case 1 :
                                Gladista.turnOnThePhone();
                                break;
                            case 2 :
                                Gladista.turnOffThePhone();
                                break;
                            case 3 :
                                Gladista.makePhoneLouder();
                                break;
                            case 4 :
                                Gladista.makePhoneSilent();
                                break;
                            case 0 :
                                main(args);
                                break;
                            default :
                                System.out.println("Silahkan masukan data yang benar!!");
                        }

                    } while (pil != 0);
                    break;
                case 0 :
                    System.out.println("Selamat tinggal....");
                    System.out.println("");
                    System.out.println("");
                    System.exit(0);
                    break;
                default :
                 System.out.println("Silahkan masukan data yang benar!!");
            }

        } while (pil != 0);
    }
}