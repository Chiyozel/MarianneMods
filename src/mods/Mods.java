/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mods;

import java.util.Collections;
import java.util.List;
import utils.Note;

/**
 *
 * @author Unmei Muma
 */
public class Mods {

    public static String reverseScroll(List<Note> list) {
        int noteCount = list.size();
        String a = "";
        for (int i = 0; i < noteCount; i++) {
            Note n = list.get(i);
            int hs = n.getHitsound();
            a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
            a += "M,0," + (n.getMillis() - (int) (int) ((60000 / 191) * 4)) + "," + n.getMillis() + ",-180,370,170,370\r\n ";
            a += "S,0," + n.getMillis() + ",,0.35\r\n";
            if (((hs >> 1) & 1) == 1 || ((hs >> 3) & 1) == 1) {
                a += " C,0," + n.getMillis() + ",,100,160,255\r\n";
            } else {
                a += " C,0," + n.getMillis() + ",,255,80,80\r\n";
            }
            a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
            a += "M,0," + (n.getMillis() - (int) ((60000 / 191) * 4)) + "," + n.getMillis() + ",-180,370,170,370\r\n ";
            a += "S,0," + n.getMillis() + ",,0.35\r\n";
        }
        return a;
    }

    public static String upsideDownAbek(List<Note> list) {
        int noteCount = list.size();
        String a = "";
        for (int i = 0; i < noteCount; i++) {
            Note n = list.get(i);
            int hs = n.getHitsound();
            a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
            a += "M,0," + (n.getMillis() - (int) ((60000 / 191) * 4)) + "," + n.getMillis() + ",800,90,170,90\r\n ";
            a += "S,0," + n.getMillis() + ",,0.35\r\n ";
            a += "R,0," + n.getMillis() + ",,3.14159265359\r\n";
            if (((hs >> 1) & 1) == 1 || ((hs >> 3) & 1) == 1) {
                a += " C,0," + n.getMillis() + ",,255,80,80\r\n";
            } else {
                a += " C,0," + n.getMillis() + ",,100,160,255\r\n";
            }
            a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
            a += "M,0," + (n.getMillis() - (int) ((60000 / 191) * 4)) + "," + n.getMillis() + ",800,90,170,90\r\n ";
            a += "S,0," + n.getMillis() + ",,0.35\r\n ";
            a += "R,0," + n.getMillis() + ",,3.14159265359\r\n";
        }
        return a;
    }

    public static String upsideDown(List<Note> list) {
        int noteCount = list.size();
        String a = "";
        for (int i = 0; i < noteCount; i++) {
            Note n = list.get(i);
            int hs = n.getHitsound();
            a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
            a += "M,0," + (n.getMillis() - (int) ((60000 / 191) * 4)) + "," + n.getMillis() + ",800,90,170,90\r\n ";
            a += "S,0," + n.getMillis() + ",,0.35\r\n ";
            a += "R,0," + n.getMillis() + ",,3.14159265359\r\n ";
            if (((hs >> 1) & 1) == 1 || ((hs >> 3) & 1) == 1) {
                a += " C,0," + n.getMillis() + ",,100,160,255\r\n";
            } else {
                a += " C,0," + n.getMillis() + ",,255,80,80\r\n";
            }
            a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
            a += "M,0," + (n.getMillis() - (int) ((60000 / 191) * 4)) + "," + n.getMillis() + ",800,90,170,90\r\n ";
            a += "S,0," + n.getMillis() + ",,0.35\r\n ";
            a += "R,0," + n.getMillis() + ",,3.14159265359\r\n ";
        }
        return a;
    }

    public static String gravity(List<Note> list) {
        int noteCount = list.size();
        String a = "";
        for (int i = 0; i < noteCount; i++) {
            Note n = list.get(i);
            int hs = n.getHitsound();
            a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
            a += "M,1," + (n.getMillis() - (int) ((60000 / 191) * 4)) + "," + n.getMillis() + ",800,370,170,370\r\n ";
            a += "S,0," + n.getMillis() + ",,0.35\r\n";
            if (((hs >> 1) & 1) == 1 || ((hs >> 3) & 1) == 1) {
                a += " C,0," + n.getMillis() + ",,100,160,255\r\n";
            } else {
                a += " C,0," + n.getMillis() + ",,255,80,80\r\n";
            }
            a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
            a += "M,1," + (n.getMillis() - (int) ((60000 / 191) * 4)) + "," + n.getMillis() + ",800,370,170,370\r\n ";
            a += "S,0," + n.getMillis() + ",,0.35\r\n";
        }
        return a;
    }

    public static String boost(List<Note> list) {
        int noteCount = list.size();
        String a = "";
        for (int i = 0; i < noteCount; i++) {
            Note n = list.get(i);
            int hs = n.getHitsound();
            a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
            a += "M,2," + (n.getMillis() - (int) ((60000 / 191) * 4)) + "," + n.getMillis() + ",800,370,170,370\r\n ";
            a += "S,0," + n.getMillis() + ",,0.35\r\n";
            if (((hs >> 1) & 1) == 1 || ((hs >> 3) & 1) == 1) {
                a += " C,0," + n.getMillis() + ",,100,160,255\r\n";
            } else {
                a += " C,0," + n.getMillis() + ",,255,80,80\r\n";
            }
            a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
            a += "M,2," + (n.getMillis() - (int) ((60000 / 191) * 4)) + "," + n.getMillis() + ",800,370,170,370\r\n ";
            a += "S,0," + n.getMillis() + ",,0.35\r\n";
        }
        return a;
    }

    public static String abekobe(List<Note> list) {
        int noteCount = list.size();
        String a = "";
        for (int i = 0; i < noteCount; i++) {
            Note n = list.get(i);
            int hs = n.getHitsound();
            a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
            a += "M,0," + (n.getMillis() - (int) ((60000 / 191) * 4)) + "," + n.getMillis() + ",800,370,170,370\r\n ";
            a += "S,0," + n.getMillis() + ",,0.35\r\n ";
            a += "F,0,275000,276338,1\r\n F,0,276338,,0\r\n";
            if (((hs >> 1) & 1) == 1 || ((hs >> 3) & 1) == 1) {
                a += " C,0," + n.getMillis() + ",,255,80,80\r\n";
            } else {
                a += " C,0," + n.getMillis() + ",,100,160,255\r\n";
            }
            a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
            a += "M,0," + (n.getMillis() - (int) ((60000 / 191) * 4)) + "," + n.getMillis() + ",800,370,170,370\r\n ";
            a += "S,0," + n.getMillis() + ",,0.35\r\n ";
            a += "F,0,275000,276338,1\r\n F,0,276338,,0\r\n";
        }
        return a;
    }

    public static String abekobeReverse(List<Note> list) {
        int noteCount = list.size();
        String a = "";
        for (int i = 0; i < noteCount; i++) {
            Note n = list.get(i);
            int hs = n.getHitsound();
            a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
            a += "M,0," + (n.getMillis() - (int) ((60000 / 191) * 4)) + "," + n.getMillis() + ",-160,370,470,370\r\n ";
            a += "S,0," + n.getMillis() + ",,0.35\r\n";
            if (((hs >> 1) & 1) == 1 || ((hs >> 3) & 1) == 1) {
                a += " C,0," + n.getMillis() + ",,255,80,80\r\n";
            } else {
                a += " C,0," + n.getMillis() + ",,100,160,255\r\n";
            }
            a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
            a += "M,0," + (n.getMillis() - (int) ((60000 / 191) * 4)) + "," + n.getMillis() + ",-160,370,470,370\r\n ";
            a += "S,0," + n.getMillis() + ",,0.35\r\n";
        }
        return a;
    }

    public static String doubleScroll(List<Note> list) {
        int noteCount = list.size();
        String a = "";
        for (int i = 0; i < noteCount; i++) {
            Note n = list.get(i);
            int hs = n.getHitsound();
            if (((hs >> 1) & 1) == 1 || ((hs >> 3) & 1) == 1) {
                a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
                a += "M,0," + (n.getMillis() - (int) ((60000 / 191) * 4)) + "," + n.getMillis() + ",170,-260,170,370\r\n ";
                a += "S,0," + n.getMillis() + ",,0.35\r\n";
                a += " C,0," + n.getMillis() + ",,100,160,255\r\n";
                a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
                a += "M,0," + (n.getMillis() - (int) ((60000 / 191) * 4)) + "," + n.getMillis() + ",170,-260,170,370\r\n ";
                a += "S,0," + n.getMillis() + ",,0.35\r\n";
            } else {
                a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
                a += "M,0," + (n.getMillis() - (int) ((60000 / 191) * 4)) + "," + n.getMillis() + ",800,370,170,370\r\n ";
                a += "S,0," + n.getMillis() + ",,0.35\r\n";
                a += " C,0," + n.getMillis() + ",,255,80,80\r\n";
                a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
                a += "M,0," + (n.getMillis() - (int) ((60000 / 191) * 4)) + "," + n.getMillis() + ",800,370,170,370\r\n ";
                a += "S,0," + n.getMillis() + ",,0.35\r\n";
            }
        }
        return a;
    }

    private static String colorStar(int hs, Note n) {
        String a = "";
        if (((hs >> 1) & 1) == 1 || ((hs >> 3) & 1) == 1) {
            a += " C,0," + n.getMillis() + ",,100,160,255\r\n";
        } else {
            a += " C,0," + n.getMillis() + ",,255,80,80\r\n";
        }

        return a;
    }

    private static String hide(long msAppear, long msMax) {
        String a = "";
        if (msAppear <= msMax) {
            a += "F,0," + msAppear + "," + msMax + ",0\r\n ";
            a += "F,0," + msMax + ",,1\r\n ";
        }
        System.out.println(a);
        return a;
    }

    public static String starMode(List<Note> list) {
        int noteCount = list.size();
        String a = "";
        for (int i = 0; i < noteCount; i++) {
            Note n = list.get(i);
            int hs = n.getHitsound();
            switch (i % 4) {
                case 0:
                    a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
                    a += "M,0," + (n.getMillis() - (int) ((60000 / 191) * 5)) + "," + n.getMillis() + ",800,370,320,370\r\n ";
                    //a += hide(n.getMillis() - (long) ((60000 / 191) * 5), 246181);
                    a += "S,0," + n.getMillis() + ",,0.35\r\n";
                    a += colorStar(hs, n);
                    a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
                    a += "M,0," + (n.getMillis() - (int) ((60000 / 191) * 5)) + "," + n.getMillis() + ",800,370,320,370\r\n ";
                    //a += hide(n.getMillis() - (long) ((60000 / 191) * 5), 246181);
                    a += "S,0," + n.getMillis() + ",,0.35\r\n";
                    break;
                case 1:
                    a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
                    a += "M,0," + (n.getMillis() - (int) ((60000 / 191) * 7)) + "," + n.getMillis() + ",659,75,320,370\r\n ";
                    //a += hide(n.getMillis() - (long) ((60000 / 191) * 7), 246181);
                    a += "R,0," + n.getMillis() + ",,2.35619449019\r\n ";
                    a += "S,0," + n.getMillis() + ",,0.35\r\n";
                    a += colorStar(hs, n);
                    a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
                    a += "M,0," + (n.getMillis() - (int) ((60000 / 191) * 7)) + "," + n.getMillis() + ",659,75,320,370\r\n ";
                    //a += hide(n.getMillis() - (long) ((60000 / 191) * 7), 246181);
                    a += "R,0," + n.getMillis() + ",,2.35619449019\r\n ";
                    a += "S,0," + n.getMillis() + ",,0.35\r\n";
                    break;
                case 2:
                    a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
                    a += "M,0," + (n.getMillis() - (int) ((60000 / 191) * 5)) + "," + n.getMillis() + ",320,75,320,370\r\n ";
                    //a += hide(n.getMillis() - (long) ((60000 / 191) * 5), 246181);
                    a += "R,0," + n.getMillis() + ",,1.57079632679\r\n ";
                    a += "S,0," + n.getMillis() + ",,0.35\r\n";
                    a += colorStar(hs, n);
                    a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
                    //a += hide(n.getMillis() - (long) ((60000 / 191) * 5), 246181);
                    a += "M,0," + (n.getMillis() - (int) ((60000 / 191) * 5)) + "," + n.getMillis() + ",320,75,320,370\r\n ";
                    a += "R,0," + n.getMillis() + ",,1.57079632679\r\n ";
                    a += "S,0," + n.getMillis() + ",,0.35\r\n";
                    break;
                case 3:
                    a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
                    a += "M,0," + (n.getMillis() - (int) ((60000 / 191) * 7)) + "," + n.getMillis() + ",-19,75,320,370\r\n ";
                    //a += hide(n.getMillis() - (long) ((60000 / 191) * 7), 246181);
                    a += "R,0," + n.getMillis() + ",,0.78539816339\r\n ";
                    a += "S,0," + n.getMillis() + ",,0.35\r\n";
                    a += colorStar(hs, n);
                    a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
                    //a += hide(n.getMillis() - (long) ((60000 / 191) * 7), 246181);
                    a += "M,0," + (n.getMillis() - (int) ((60000 / 191) * 7)) + "," + n.getMillis() + ",-19,75,320,370\r\n ";
                    a += "R,0," + n.getMillis() + ",,0.78539816339\r\n ";
                    a += "S,0," + n.getMillis() + ",,0.35\r\n";
                    break;
                default:
                    break;
            }
        }
        return a;
    }

    public static String scroll(List<Note> list, double speed) {
        final double TRUC = speed;
        int noteCount = list.size();
        String a = "";
        for (int i = 0; i < noteCount; i++) {
            Note n = list.get(i);
            int hs = n.getHitsound();
            a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
            a += "M,0," + (n.getMillis() - (int) ((60000 / 191) * (4 / TRUC))) + "," + n.getMillis() + ",800,370,170,370\r\n ";
            a += "S,0," + n.getMillis() + ",,0.35\r\n";
            if (((hs >> 1) & 1) == 1 || ((hs >> 3) & 1) == 1) {
                a += " C,0," + n.getMillis() + ",,100,160,255\r\n";
            } else {
                a += " C,0," + n.getMillis() + ",,255,80,80\r\n";
            }
            a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
            a += "M,0," + (n.getMillis() - (int) ((60000 / 191) * (4 / TRUC))) + "," + n.getMillis() + ",800,370,170,370\r\n ";
            a += "S,0," + n.getMillis() + ",,0.35\r\n";
        }
        return a;
    }

    public static String splitScroll(List<Note> list) {
        int noteCount = list.size();
        String a = "";
        for (int i = 0; i < noteCount; i++) {
            Note n = list.get(i);
            int hs = n.getHitsound();
            if (((hs >> 1) & 1) == 1 || ((hs >> 3) & 1) == 1) {
                a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
                a += "M,0," + (n.getMillis() - (int) ((60000 / 191) * 4)) + "," + n.getMillis() + ",720,370,320,370\r\n ";
                a += "S,0," + n.getMillis() + ",,0.35\r\n";
                a += " C,0," + n.getMillis() + ",,100,160,255\r\n";
                a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
                a += "M,0," + (n.getMillis() - (int) ((60000 / 191) * 4)) + "," + n.getMillis() + ",720,370,320,370\r\n ";
                a += "S,0," + n.getMillis() + ",,0.35\r\n";
            } else {
                a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
                a += "M,0," + (n.getMillis() - (int) ((60000 / 191) * 4)) + "," + n.getMillis() + ",-80,370,320,370\r\n ";
                a += "S,0," + n.getMillis() + ",,0.35\r\n";
                a += " C,0," + n.getMillis() + ",,255,80,80\r\n";
                a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
                a += "M,0," + (n.getMillis() - (int) ((60000 / 191) * 4)) + "," + n.getMillis() + ",-80,370,320,370\r\n ";
                a += "S,0," + n.getMillis() + ",,0.35\r\n";
            }
        }
        return a;
    }

    public static String counter(List<Note> list) {
        Collections.reverse(list);
        int noteCount = list.size();
        String nc = String.valueOf(noteCount);
        String a = "";
        if (noteCount >= 100) {
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 2)) + ".png\",320,240\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 100 - 1).getMillis() + ",60,370\r\n ";
            a += "S,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 100 - 1).getMillis() + ",0.5\r\n";
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 2)) + ".png\",320,240\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 10 - 1).getMillis() + ",80,370\r\n ";
            a += "S,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 10 - 1).getMillis() + ",0.5\r\n";
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 1)) + ".png\",320,240\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 1 - 1).getMillis() + ",100,370\r\n ";
            a += "S,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 1 - 1).getMillis() + ",0.5\r\n";

        } else if (noteCount >= 10) {
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 2)) + ".png\",320,240\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 10 - 1).getMillis() + ",70,370\r\n ";
            a += "S,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 10 - 1).getMillis() + ",0.5\r\n";
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 1)) + ".png\",320,240\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 1 - 1).getMillis() + ",90,370\r\n ";
            a += "S,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 1 - 1).getMillis() + ",0.5\r\n";
        } else if (noteCount >= 1) {
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 1)) + ".png\",320,240\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 1 - 1).getMillis() + ",80,370\r\n ";
            a += "S,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 1 - 1).getMillis() + ",0.5\r\n";
        }
        for (int i = noteCount - 1; i > 0; i--) {
            Note nCurrent = list.get(i - 1);
            Note nNext = list.get(i);
            if (i >= 100) {
                a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (i % 10) + ".png\",320,240\r\n ";
                a += "M,0," + nNext.getMillis() + "," + nCurrent.getMillis() + ",100,370\r\n ";
                a += "S,0," + nNext.getMillis() + "," + nCurrent.getMillis() + ",0.5\r\n";
                if ((i + 1) % 10 == 0 && i >= 10) {
                    a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (((i % 100) / 10)) + ".png\",320,240\r\n ";
                    a += "M,0," + nNext.getMillis() + "," + list.get(i - 10).getMillis() + ",80,370\r\n ";
                    a += "S,0," + nNext.getMillis() + "," + list.get(i - 10).getMillis() + ",0.5\r\n";
                }
                if ((i + 1) % 100 == 0 && i >= 100) {
                    a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (((i % 1000) / 100)) + ".png\",320,240\r\n ";
                    a += "M,0," + nCurrent.getMillis() + "," + list.get(i - 100).getMillis() + ",60,370\r\n ";
                    a += "S,0," + nCurrent.getMillis() + "," + list.get(i - 100).getMillis() + ",0.5\r\n";
                }
            }
            if (i >= 10 && i < 100) {
                a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (i % 10) + ".png\",320,240\r\n ";
                a += "M,0," + nNext.getMillis() + "," + nCurrent.getMillis() + ",90,370\r\n ";
                a += "S,0," + nNext.getMillis() + "," + nCurrent.getMillis() + ",0.5\r\n";
                if ((i + 1) % 10 == 0 && i >= 10) {
                    a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (((i % 100) / 10)) + ".png\",320,240\r\n ";
                    a += "M,0," + nNext.getMillis() + "," + list.get(i - 10).getMillis() + ",70,370\r\n ";
                    a += "S,0," + nNext.getMillis() + "," + list.get(i - 10).getMillis() + ",0.5\r\n";
                }
            }
            if (i >= 1 && i < 10) {
                a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + i + ".png\",320,240\r\n ";
                a += "M,0," + nNext.getMillis() + "," + nCurrent.getMillis() + ",80,370\r\n ";
                a += "S,0," + nNext.getMillis() + "," + nCurrent.getMillis() + ",0.5\r\n";
            }
        }
        return a;
    }

    public static String counterMirror(List<Note> list) {
        Collections.reverse(list);
        int noteCount = list.size();
        String nc = String.valueOf(noteCount);
        String a = "";
        if (noteCount >= 100) {
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 2)) + ".png\",320,240\r\n ";
            a += "V,0," + list.get(list.size() - 1).getMillis() + ",,-0.5,-0.5\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 100 - 1).getMillis() + ",572,370\r\n";
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 2)) + ".png\",320,240\r\n ";
            a += "V,0," + list.get(list.size() - 1).getMillis() + ",,-0.5,0.5\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 10 - 1).getMillis() + ",552,370\r\n ";
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 1)) + ".png\",320,240\r\n";
            a += "V,0," + list.get(list.size() - 1).getMillis() + ",,-0.5,0.5\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 1 - 1).getMillis() + ",532,370\r\n";

        } else if (noteCount >= 10) {
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 2)) + ".png\",320,240\r\n ";
            a += "V,0," + list.get(list.size() - 1).getMillis() + ",,-0.5,0.5\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 10 - 1).getMillis() + ",562,370\r\n";
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 1)) + ".png\",320,240\r\n ";
            a += "V,0," + list.get(list.size() - 1).getMillis() + ",,-0.5,0.5\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 1 - 1).getMillis() + ",542,370\r\n";
        } else if (noteCount >= 1) {
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 1)) + ".png\",320,240\r\n ";
            a += "V,0," + list.get(list.size() - 1).getMillis() + ",,-0.5,0.5\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 1 - 1).getMillis() + ",552,370\r\n";
        }
        for (int i = noteCount - 1; i > 0; i--) {
            Note nCurrent = list.get(i - 1);
            Note nNext = list.get(i);
            if (i >= 100) {
                a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (i % 10) + ".png\",320,240\r\n ";
                a += "M,0," + nNext.getMillis() + "," + nCurrent.getMillis() + ",532,370\r\n ";
                a += "V,0," + nNext.getMillis() + ",,-0.5,0.5\r\n";
                if ((i + 1) % 10 == 0 && i >= 10) {
                    a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (((i % 100) / 10)) + ".png\",320,240\r\n ";
                    a += "M,0," + nNext.getMillis() + "," + list.get(i - 10).getMillis() + ",552,370\r\n ";
                    a += "V,0," + nNext.getMillis() + ",,-0.5,0.5\r\n";
                }
                if ((i + 1) % 100 == 0 && i >= 100) {
                    a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (((i % 1000) / 100)) + ".png\",320,240\r\n ";
                    a += "M,0," + nCurrent.getMillis() + "," + list.get(i - 100).getMillis() + ",572,370\r\n ";
                    a += "V,0," + nNext.getMillis() + ",,-0.5,0.5\r\n";
                }
            }
            if (i >= 10 && i < 100) {
                a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (i % 10) + ".png\",320,240\r\n ";
                a += "M,0," + nNext.getMillis() + "," + nCurrent.getMillis() + ",542,370\r\n ";
                a += "V,0," + nNext.getMillis() + ",,-0.5,0.5\r\n";
                if ((i + 1) % 10 == 0 && i >= 10) {
                    a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (((i % 100) / 10)) + ".png\",320,240\r\n ";
                    a += "M,0," + nNext.getMillis() + "," + list.get(i - 10).getMillis() + ",562,370\r\n ";
                    a += "V,0," + nNext.getMillis() + ",,-0.5,0.5\r\n";
                }
            }
            if (i >= 1 && i < 10) {
                a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + i + ".png\",320,240\r\n ";
                a += "M,0," + nNext.getMillis() + "," + nCurrent.getMillis() + ",552,370\r\n ";
                a += "V,0," + nNext.getMillis() + ",,-0.5,0.5\r\n";
            }
        }
        return a;
    }

    public static String counterUpside(List<Note> list) {
        Collections.reverse(list);
        int noteCount = list.size();
        String nc = String.valueOf(noteCount);
        String a = "";
        if (noteCount >= 100) {
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 2)) + ".png\",320,240\r\n ";
            a += "V,0," + list.get(list.size() - 1).getMillis() + ",,0.5,-0.5\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 100 - 1).getMillis() + ",60,90\r\n";
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 2)) + ".png\",320,240\r\n ";
            a += "V,0," + list.get(list.size() - 1).getMillis() + ",,0.5,-0.5\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 10 - 1).getMillis() + ",80,90\r\n ";
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 1)) + ".png\",320,240\r\n";
            a += "V,0," + list.get(list.size() - 1).getMillis() + ",,0.5,-0.5\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 1 - 1).getMillis() + ",100,90\r\n";

        } else if (noteCount >= 10) {
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 2)) + ".png\",320,240\r\n ";
            a += "V,0," + list.get(list.size() - 1).getMillis() + ",,0.5,-0.5\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 10 - 1).getMillis() + ",70,90\r\n";
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 1)) + ".png\",320,240\r\n ";
            a += "V,0," + list.get(list.size() - 1).getMillis() + ",,0.5,-0.5\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 1 - 1).getMillis() + ",90,90\r\n";
        } else if (noteCount >= 1) {
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 1)) + ".png\",320,240\r\n ";
            a += "V,0," + list.get(list.size() - 1).getMillis() + ",,0.5,-0.5\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 1 - 1).getMillis() + ",80,90\r\n";
        }
        for (int i = noteCount - 1; i > 0; i--) {
            Note nCurrent = list.get(i - 1);
            Note nNext = list.get(i);
            if (i >= 100) {
                a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (i % 10) + ".png\",320,240\r\n ";
                a += "M,0," + nNext.getMillis() + "," + nCurrent.getMillis() + ",100,90\r\n ";
                a += "V,0," + nNext.getMillis() + ",,0.5,-0.5\r\n";
                if ((i + 1) % 10 == 0 && i >= 10) {
                    a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (((i % 100) / 10)) + ".png\",320,240\r\n ";
                    a += "M,0," + nNext.getMillis() + "," + list.get(i - 10).getMillis() + ",80,90\r\n ";
                    a += "V,0," + nNext.getMillis() + ",,0.5,-0.5\r\n";
                }
                if ((i + 1) % 100 == 0 && i >= 100) {
                    a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (((i % 1000) / 100)) + ".png\",320,240\r\n ";
                    a += "M,0," + nCurrent.getMillis() + "," + list.get(i - 100).getMillis() + ",60,90\r\n ";
                    a += "V,0," + nNext.getMillis() + ",,0.5,-0.5\r\n";
                }
            }
            if (i >= 10 && i < 100) {
                a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (i % 10) + ".png\",320,240\r\n ";
                a += "M,0," + nNext.getMillis() + "," + nCurrent.getMillis() + ",90,90\r\n ";
                a += "V,0," + nNext.getMillis() + ",,0.5,-0.5\r\n";
                if ((i + 1) % 10 == 0 && i >= 10) {
                    a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (((i % 100) / 10)) + ".png\",320,240\r\n ";
                    a += "M,0," + nNext.getMillis() + "," + list.get(i - 10).getMillis() + ",70,90\r\n ";
                    a += "V,0," + nNext.getMillis() + ",,0.5,-0.5\r\n";
                }
            }
            if (i >= 1 && i < 10) {
                a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + i + ".png\",320,240\r\n ";
                a += "M,0," + nNext.getMillis() + "," + nCurrent.getMillis() + ",80,90\r\n ";
                a += "V,0," + nNext.getMillis() + ",,0.5,-0.5\r\n";
            }
        }
        return a;
    }

    public static String counterReverse(List<Note> list) {
        Collections.reverse(list);
        int noteCount = list.size();
        String nc = String.valueOf(noteCount);
        String a = "";
        if (noteCount >= 100) {
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 2)) + ".png\",320,240\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 100 - 1).getMillis() + ",570,370\r\n ";
            a += "S,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 100 - 1).getMillis() + ",0.5\r\n";
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 2)) + ".png\",320,240\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 10 - 1).getMillis() + ",550,370\r\n ";
            a += "S,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 10 - 1).getMillis() + ",0.5\r\n";
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 1)) + ".png\",320,240\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 1 - 1).getMillis() + ",530,370\r\n ";
            a += "S,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 1 - 1).getMillis() + ",0.5\r\n";

        } else if (noteCount >= 10) {
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 2)) + ".png\",320,240\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 10 - 1).getMillis() + ",560,370\r\n ";
            a += "S,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 10 - 1).getMillis() + ",0.5\r\n";
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 1)) + ".png\",320,240\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 1 - 1).getMillis() + ",540,370\r\n ";
            a += "S,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 1 - 1).getMillis() + ",0.5\r\n";
        } else if (noteCount >= 1) {
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 1)) + ".png\",320,240\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 1 - 1).getMillis() + ",550,370\r\n ";
            a += "S,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 1 - 1).getMillis() + ",0.5\r\n";
        }
        for (int i = noteCount - 1; i > 0; i--) {
            Note nCurrent = list.get(i - 1);
            Note nNext = list.get(i);
            if (i >= 100) {
                a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (i % 10) + ".png\",320,240\r\n ";
                a += "M,0," + nNext.getMillis() + "," + nCurrent.getMillis() + ",570,370\r\n ";
                a += "S,0," + nNext.getMillis() + "," + nCurrent.getMillis() + ",0.5\r\n";
                if ((i + 1) % 10 == 0 && i >= 10) {
                    a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (((i % 100) / 10)) + ".png\",320,240\r\n ";
                    a += "M,0," + nNext.getMillis() + "," + list.get(i - 10).getMillis() + ",550,370\r\n ";
                    a += "S,0," + nNext.getMillis() + "," + list.get(i - 10).getMillis() + ",0.5\r\n";
                }
                if ((i + 1) % 100 == 0 && i >= 100) {
                    a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (((i % 1000) / 100)) + ".png\",320,240\r\n ";
                    a += "M,0," + nCurrent.getMillis() + "," + list.get(i - 100).getMillis() + ",530,370\r\n ";
                    a += "S,0," + nCurrent.getMillis() + "," + list.get(i - 100).getMillis() + ",0.5\r\n";
                }
            }
            if (i >= 10 && i < 100) {
                a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (i % 10) + ".png\",320,240\r\n ";
                a += "M,0," + nNext.getMillis() + "," + nCurrent.getMillis() + ",560,370\r\n ";
                a += "S,0," + nNext.getMillis() + "," + nCurrent.getMillis() + ",0.5\r\n";
                if ((i + 1) % 10 == 0 && i >= 10) {
                    a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (((i % 100) / 10)) + ".png\",320,240\r\n ";
                    a += "M,0," + nNext.getMillis() + "," + list.get(i - 10).getMillis() + ",540,370\r\n ";
                    a += "S,0," + nNext.getMillis() + "," + list.get(i - 10).getMillis() + ",0.5\r\n";
                }
            }
            if (i >= 1 && i < 10) {
                a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + i + ".png\",320,240\r\n ";
                a += "M,0," + nNext.getMillis() + "," + nCurrent.getMillis() + ",550,370\r\n ";
                a += "S,0," + nNext.getMillis() + "," + nCurrent.getMillis() + ",0.5\r\n";
            }
        }
        return a;
    }
}
