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

    public static String reverseScroll(List<Note> list, int X, int Y, float ScrollBPM) {
        Collections.reverse(list);
        int noteCount = list.size();
        String a = "";
        for (int i = 0; i < noteCount; i++) {
            Note n = list.get(i);
            int hs = n.getHitsound();
            a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
            a += "M,0," + (n.getMillis() - (int) (int) ((60000 / ScrollBPM) * 4)) + "," + n.getMillis() + "," + (X - 350) + "," + Y + "," + X + "," + Y + "\r\n ";

            if (((hs >> 2) & 1) == 0) {
                a += "S,0," + n.getMillis() + ",,0.35\r\n ";
            } else {
                a += "S,0," + n.getMillis() + ",,0.5\r\n ";
            }

            if (((hs >> 1) & 1) == 1 || ((hs >> 3) & 1) == 1) {
                a += "C,0," + n.getMillis() + ",,100,160,255\r\n";
            } else {
                a += "C,0," + n.getMillis() + ",,255,80,80\r\n";
            }

            if (((hs >> 2) & 1) == 0) {
                a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
                a += "S,0," + n.getMillis() + ",,0.35\r\n ";
            } else {
                a += "Sprite,Foreground,Centre,\"SB/notebig-overlay.png\",320,240\r\n ";
                a += "S,0," + n.getMillis() + ",,0.5\r\n ";
            }
            a += "M,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 4)) + "," + n.getMillis() + "," + (X - 350) + "," + Y + "," + X + "," + Y + "\r\n";
        }
        return a;
    }

    public static String upsideDownAbek(List<Note> list, int X, int Y, float ScrollBPM) {
        Collections.reverse(list);
        int noteCount = list.size();
        String a = "";
        for (int i = 0; i < noteCount; i++) {
            Note n = list.get(i);
            int hs = n.getHitsound();
            a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
            a += "M,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 4)) + "," + n.getMillis() + "," + (X + 630) + "," + (Y - 280) + "," + X + "," + (Y - 280) + "\r\n ";
            if (((hs >> 2) & 1) == 0) {
                a += "S,0," + n.getMillis() + ",,0.35\r\n ";
            } else {
                a += "S,0," + n.getMillis() + ",,0.5\r\n ";
            }
            a += "R,0," + n.getMillis() + ",,3.14159265359\r\n ";
            if (((hs >> 1) & 1) == 1 || ((hs >> 3) & 1) == 1) {
                a += "C,0," + n.getMillis() + ",,255,80,80\r\n";
            } else {
                a += "C,0," + n.getMillis() + ",,100,160,255\r\n";
            }

            if (((hs >> 2) & 1) == 0) {
                a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
                a += "S,0," + n.getMillis() + ",,0.35\r\n ";
            } else {
                a += "Sprite,Foreground,Centre,\"SB/notebig-overlay.png\",320,240\r\n ";
                a += "S,0," + n.getMillis() + ",,0.5\r\n ";
            }
            a += "M,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 4)) + "," + n.getMillis() + "," + (X + 630) + "," + (Y - 280) + "," + X + "," + (Y - 280) + "\r\n ";
            a += "R,0," + n.getMillis() + ",,3.14159265359\r\n";
        }
        return a;
    }

    public static String upsideDown(List<Note> list, int X, int Y, float ScrollBPM) {
        Collections.reverse(list);
        int noteCount = list.size();
        String a = "";
        for (int i = 0; i < noteCount; i++) {
            Note n = list.get(i);
            int hs = n.getHitsound();
            a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
            a += "M,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 4)) + "," + n.getMillis() + "," + (X + 630) + "," + (480 - Y) + "," + X + "," + (480 - Y) + "\r\n ";
            if (((hs >> 2) & 1) == 0) {
                a += "S,0," + n.getMillis() + ",,0.35\r\n ";
            } else {
                a += "S,0," + n.getMillis() + ",,0.5\r\n ";
            }
            a += "R,0," + n.getMillis() + ",,3.14159265359\r\n ";
            if (((hs >> 1) & 1) == 1 || ((hs >> 3) & 1) == 1) {
                a += "C,0," + n.getMillis() + ",,100,160,255\r\n";
            } else {
                a += "C,0," + n.getMillis() + ",,255,80,80\r\n";
            }

            if (((hs >> 2) & 1) == 0) {
                a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
                a += "S,0," + n.getMillis() + ",,0.35\r\n ";
            } else {
                a += "Sprite,Foreground,Centre,\"SB/notebig-overlay.png\",320,240\r\n ";
                a += "S,0," + n.getMillis() + ",,0.5\r\n ";
            }
            a += "M,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 4)) + "," + n.getMillis() + "," + (X + 630) + "," + (480 - Y) + "," + X + "," + (480 - Y) + "\r\n ";
            a += "R,0," + n.getMillis() + ",,3.14159265359\r\n";
        }
        return a;
    }

    public static String gravity(List<Note> list, int X, int Y, float ScrollBPM) {
        Collections.reverse(list);
        int noteCount = list.size();
        String a = "";
        for (int i = 0; i < noteCount; i++) {
            Note n = list.get(i);
            int hs = n.getHitsound();
            a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
            a += "M,1," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 4)) + "," + n.getMillis() + "," + (X + 630) + "," + Y + "," + X + "," + Y + "\r\n ";
            if (((hs >> 2) & 1) == 0) {
                a += "S,0," + n.getMillis() + ",,0.35\r\n ";
            } else {
                a += "S,0," + n.getMillis() + ",,0.5\r\n ";
            }
            if (((hs >> 1) & 1) == 1 || ((hs >> 3) & 1) == 1) {
                a += "C,0," + n.getMillis() + ",,100,160,255\r\n";
            } else {
                a += "C,0," + n.getMillis() + ",,255,80,80\r\n";
            }

            if (((hs >> 2) & 1) == 0) {
                a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
                a += "S,0," + n.getMillis() + ",,0.35\r\n ";
            } else {
                a += "Sprite,Foreground,Centre,\"SB/notebig-overlay.png\",320,240\r\n ";
                a += "S,0," + n.getMillis() + ",,0.5\r\n ";
            }
            a += "M,1," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 4)) + "," + n.getMillis() + "," + (X + 630) + "," + Y + "," + X + "," + Y + "\r\n";
        }
        return a;
    }

    public static String boost(List<Note> list, int X, int Y, float ScrollBPM) {
        Collections.reverse(list);
        int noteCount = list.size();
        String a = "";
        for (int i = 0; i < noteCount; i++) {
            Note n = list.get(i);
            int hs = n.getHitsound();
            a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
            a += "M,2," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 4)) + "," + n.getMillis() + "," + (X + 630) + "," + Y + "," + X + "," + Y + "\r\n ";
            if (((hs >> 2) & 1) == 0) {
                a += "S,0," + n.getMillis() + ",,0.35\r\n ";
            } else {
                a += "S,0," + n.getMillis() + ",,0.5\r\n ";
            }
            if (((hs >> 1) & 1) == 1 || ((hs >> 3) & 1) == 1) {
                a += "C,0," + n.getMillis() + ",,100,160,255\r\n";
            } else {
                a += "C,0," + n.getMillis() + ",,255,80,80\r\n";
            }

            if (((hs >> 2) & 1) == 0) {
                a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
                a += "S,0," + n.getMillis() + ",,0.35\r\n ";
            } else {
                a += "Sprite,Foreground,Centre,\"SB/notebig-overlay.png\",320,240\r\n ";
                a += "S,0," + n.getMillis() + ",,0.5\r\n ";
            }
            a += "M,2," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 4)) + "," + n.getMillis() + "," + (X + 630) + "," + Y + "," + X + "," + Y + "\r\n";
        }
        return a;
    }

    public static String abekobe(List<Note> list, int X, int Y, float ScrollBPM) {
        Collections.reverse(list);
        int noteCount = list.size();
        String a = "";
        for (int i = 0; i < noteCount; i++) {
            Note n = list.get(i);
            int hs = n.getHitsound();
            a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
            a += "M,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 4)) + "," + n.getMillis() + "," + (X + 630) + "," + Y + "," + X + "," + Y + "\r\n ";
            if (((hs >> 2) & 1) == 0) {
                a += "S,0," + n.getMillis() + ",,0.35\r\n ";
            } else {
                a += "S,0," + n.getMillis() + ",,0.5\r\n ";
            }
            if (((hs >> 1) & 1) == 1 || ((hs >> 3) & 1) == 1) {
                a += "C,0," + n.getMillis() + ",,255,80,80\r\n";
            } else {
                a += "C,0," + n.getMillis() + ",,100,160,255\r\n";
            }
            if (((hs >> 2) & 1) == 0) {
                a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
                a += "S,0," + n.getMillis() + ",,0.35\r\n ";
            } else {
                a += "Sprite,Foreground,Centre,\"SB/notebig-overlay.png\",320,240\r\n ";
                a += "S,0," + n.getMillis() + ",,0.5\r\n ";
            }
            a += "M,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 4)) + "," + n.getMillis() + "," + (X + 630) + "," + Y + "," + X + "," + Y + "\r\n";
        }
        return a;
    }

    public static String abekobeReverse(List<Note> list, int X, int Y, float ScrollBPM) {
        Collections.reverse(list);
        int noteCount = list.size();
        String a = "";
        for (int i = 0; i < noteCount; i++) {
            Note n = list.get(i);
            int hs = n.getHitsound();
            a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
            a += "M,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 4)) + "," + n.getMillis() + "," + (10 - X) + "," + Y + "," + (640 - X) + "," + Y + "\r\n ";
            if (((hs >> 2) & 1) == 0) {
                a += "S,0," + n.getMillis() + ",,0.35\r\n ";
            } else {
                a += "S,0," + n.getMillis() + ",,0.5\r\n ";
            }
            if (((hs >> 1) & 1) == 1 || ((hs >> 3) & 1) == 1) {
                a += "C,0," + n.getMillis() + ",,255,80,80\r\n";
            } else {
                a += "C,0," + n.getMillis() + ",,100,160,255\r\n";
            }
            if (((hs >> 2) & 1) == 0) {
                a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
                a += "S,0," + n.getMillis() + ",,0.35\r\n ";
            } else {
                a += "Sprite,Foreground,Centre,\"SB/notebig-overlay.png\",320,240\r\n ";
                a += "S,0," + n.getMillis() + ",,0.5\r\n ";
            }
            a += "M,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 4)) + "," + n.getMillis() + "," + (10 - X) + "," + Y + "," + (640 - X) + "," + Y + "\r\n";
        }
        return a;
    }

    public static String reverse2(List<Note> list, int X, int Y, float ScrollBPM) {
        Collections.reverse(list);
        int noteCount = list.size();
        String a = "";
        for (int i = 0; i < noteCount; i++) {
            Note n = list.get(i);
            int hs = n.getHitsound();
            a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
            a += "M,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 4)) + "," + n.getMillis() + "," + (10 - X) + "," + Y + "," + (640 - X) + "," + Y + "\r\n ";
            if (((hs >> 2) & 1) == 0) {
                a += "S,0," + n.getMillis() + ",,0.35\r\n ";
            } else {
                a += "S,0," + n.getMillis() + ",,0.5\r\n ";
            }
            if (((hs >> 1) & 1) == 1 || ((hs >> 3) & 1) == 1) {
                a += "C,0," + n.getMillis() + ",,100,160,255\r\n";
            } else {
                a += "C,0," + n.getMillis() + ",,255,80,80\r\n";
            }
            if (((hs >> 2) & 1) == 0) {
                a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
                a += "S,0," + n.getMillis() + ",,0.35\r\n ";
            } else {
                a += "Sprite,Foreground,Centre,\"SB/notebig-overlay.png\",320,240\r\n ";
                a += "S,0," + n.getMillis() + ",,0.5\r\n ";
            }
            a += "M,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 4)) + "," + n.getMillis() + "," + (10 - X) + "," + Y + "," + (640 - X) + "," + Y + "\r\n";
        }
        return a;
    }
    
    public static String doubleScroll(List<Note> list, int X, int Y, float ScrollBPM) {
        Collections.reverse(list);
        int noteCount = list.size();
        String a = "";
        for (int i = 0; i < noteCount; i++) {
            Note n = list.get(i);
            int hs = n.getHitsound();
            if (((hs >> 1) & 1) == 1 || ((hs >> 3) & 1) == 1) {
                a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
                a += "M,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 4)) + "," + n.getMillis() + "," + X + "," + (Y - 630) + "," + X + "," + Y + "\r\n ";
                if (((hs >> 2) & 1) == 0) {
                    a += "S,0," + n.getMillis() + ",,0.35\r\n ";
                } else {
                    a += "S,0," + n.getMillis() + ",,0.5\r\n ";
                }
                a += "C,0," + n.getMillis() + ",,100,160,255\r\n";

                if (((hs >> 2) & 1) == 0) {
                    a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
                    a += "S,0," + n.getMillis() + ",,0.35\r\n ";
                } else {
                    a += "Sprite,Foreground,Centre,\"SB/notebig-overlay.png\",320,240\r\n ";
                    a += "S,0," + n.getMillis() + ",,0.5\r\n ";
                }
                a += "M,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 4)) + "," + n.getMillis() + "," + X + "," + (Y - 630) + "," + X + "," + Y + "\r\n";
            } else {
                a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
                a += "M,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 4)) + "," + n.getMillis() + "," + (X + 630) + "," + Y + "," + X + "," + Y + "\r\n ";
                if (((hs >> 2) & 1) == 0) {
                    a += "S,0," + n.getMillis() + ",,0.35\r\n ";
                } else {
                    a += "S,0," + n.getMillis() + ",,0.5\r\n ";
                }
                a += "C,0," + n.getMillis() + ",,255,80,80\r\n";
                if (((hs >> 2) & 1) == 0) {
                    a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
                    a += "S,0," + n.getMillis() + ",,0.35\r\n ";
                } else {
                    a += "Sprite,Foreground,Centre,\"SB/notebig-overlay.png\",320,240\r\n ";
                    a += "S,0," + n.getMillis() + ",,0.5\r\n ";
                };
                a += "M,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 4)) + "," + n.getMillis() + "," + (X + 630) + "," + Y + "," + X + "," + Y + "\r\n";
            }
        }
        return a;
    }

    private static String colorStar(int hs, Note n, int X, int Y) {
        String a = "";
        if (((hs >> 1) & 1) == 1 || ((hs >> 3) & 1) == 1) {
            a += " C,0," + n.getMillis() + ",,100,160,255\r\n";
        } else {
            a += " C,0," + n.getMillis() + ",,255,80,80\r\n";
        }

        return a;
    }

    public static String confusion(List<Note> list, int X, int Y, float ScrollBPM) {
        Collections.reverse(list);
        int noteCount = list.size();
        String a = "";
        for (int i = 0; i < noteCount; i++) {
            Note n = list.get(i);
            int hs = n.getHitsound(), red, blue, green;
            red = blue = green = 256;
            red *= Math.random();
            blue *= Math.random();
            green *= Math.random();

            a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
            a += "M,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 4)) + "," + n.getMillis() + "," + (X + 630) + "," + Y + "," + X + "," + Y + "\r\n ";

            if (((hs >> 2) & 1) == 0) {
                a += "S,0," + n.getMillis() + ",,0.35\r\n ";
            } else {
                a += "S,0," + n.getMillis() + ",,0.5\r\n ";
            }
            if (((hs >> 1) & 1) == 1 || ((hs >> 3) & 1) == 1) {
                a += "C,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 3))
                        + "," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 1))
                        + "," + red + "," + green + "," + blue + ",100,160,255\r\n ";
                a += "C,0," + n.getMillis() + ",,100,160,255\r\n";
            } else {
                a += "C,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 3))
                        + "," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 1))
                        + "," + red + "," + green + "," + blue + ",255,80,80\r\n ";
                a += "C,0," + n.getMillis() + ",,255,80,80\r\n";
            }
            if (((hs >> 2) & 1) == 0) {
                a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
                a += "S,0," + n.getMillis() + ",,0.35\r\n ";
            } else {
                a += "Sprite,Foreground,Centre,\"SB/notebig-overlay.png\",320,240\r\n ";
                a += "S,0," + n.getMillis() + ",,0.5\r\n ";
            }
            a += "M,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 4)) + "," + n.getMillis() + "," + (X + 630) + "," + Y + "," + X + "," + Y + "\r\n";
        }
        return a;
    }

    public static String newFlashlight(List<Note> list, int X, int Y, float ScrollBPM) {
        // sand rends l'argent
        Collections.reverse(list);
        int noteCount = list.size();
        String a = "";
        for (int i = 0; i < noteCount; i++) {
            Note n = list.get(i);
            int hs = n.getHitsound();

            a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
            a += "M,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 4)) + "," + n.getMillis() + "," + (X + 630) + "," + Y + "," + X + "," + Y + "\r\n ";

            if (((hs >> 2) & 1) == 0) {
                a += "S,0," + n.getMillis() + ",,0.35\r\n ";
            } else {
                a += "S,0," + n.getMillis() + ",,0.5\r\n ";
            }
            if (((hs >> 1) & 1) == 1 || ((hs >> 3) & 1) == 1) {
                a += "C,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 1.5))
                        + "," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 0.5))
                        + ",0,0,0,100,160,255\r\n ";
                a += "C,0," + n.getMillis() + ",,100,160,255\r\n";
            } else {
                a += "C,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 1.5))
                        + "," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 0.5))
                        + ",0,0,0,255,80,80\r\n ";
                a += "C,0," + n.getMillis() + ",,255,80,80\r\n";
            }
            if (((hs >> 2) & 1) == 0) {
                a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
                a += "S,0," + n.getMillis() + ",,0.35\r\n ";
            } else {
                a += "Sprite,Foreground,Centre,\"SB/notebig-overlay.png\",320,240\r\n ";
                a += "S,0," + n.getMillis() + ",,0.5\r\n ";
            }
            a += "M,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 4)) + "," + n.getMillis() + "," + (X + 630) + "," + Y + "," + X + "," + Y + "\r\n";
        }
        return a;
    }

    public static String confusionWave(List<Note> list, int X, int Y, float ScrollBPM, float intensity, int cycles) {
        Collections.reverse(list);
        int noteCount = list.size();
        // 1.00 intensity = 25 pixels
        int pixels = 25;
        float periodCycle = 4f / (float) cycles;
        pixels *= intensity;

        String a = "";
        for (int i = 0; i < noteCount; i++) {
            Note n = list.get(i);
            int hs = n.getHitsound(), red, blue, green;
            red = blue = green = 256;
            red *= Math.random();
            blue *= Math.random();
            green *= Math.random();
            a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
            a += "MX,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 4)) + "," + n.getMillis() + "," + (X + 630) + "," + X + "\r\n ";
            for (float Q = cycles; Q > 0; Q--) {
                a += "MY,1," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.00) * periodCycle)) + "," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.25) * periodCycle)) + "," + Y + "," + (Y - pixels) + "\r\n "; // DownDecel
                a += "MY,2," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.25) * periodCycle)) + "," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.50) * periodCycle)) + "," + (Y - pixels) + "," + Y + "\r\n "; // UpAccel
                a += "MY,1," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.50) * periodCycle)) + "," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.75) * periodCycle)) + "," + Y + "," + (Y + pixels) + "\r\n "; // UpDecel
                a += "MY,2," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.75) * periodCycle)) + "," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 1.00) * periodCycle)) + "," + (Y + pixels) + "," + Y + "\r\n "; // DownAccel
            }
            if (((hs >> 2) & 1) == 0) {
                a += "S,0," + n.getMillis() + ",,0.35\r\n ";
            } else {
                a += "S,0," + n.getMillis() + ",,0.5\r\n ";
            }
            if (((hs >> 1) & 1) == 1 || ((hs >> 3) & 1) == 1) {
                a += "C,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 3))
                        + "," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 1))
                        + "," + red + "," + green + "," + blue + ",100,160,255\r\n ";
                a += "C,0," + n.getMillis() + ",,100,160,255\r\n";
            } else {
                a += "C,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 3))
                        + "," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 1))
                        + "," + red + "," + green + "," + blue + ",255,80,80\r\n ";
                a += "C,0," + n.getMillis() + ",,255,80,80\r\n";
            }

            if (((hs >> 2) & 1) == 0) {
                a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
                a += "S,0," + n.getMillis() + ",,0.35\r\n ";
            } else {
                a += "Sprite,Foreground,Centre,\"SB/notebig-overlay.png\",320,240\r\n ";
                a += "S,0," + n.getMillis() + ",,0.5\r\n ";
            }
            a += "MX,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 4)) + "," + n.getMillis() + "," + (X + 630) + "," + X + "\r\n";
            for (float Q = 4; Q > 0; Q--) {
                a += " MY,1," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.00) * periodCycle)) + "," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.25) * periodCycle)) + "," + Y + "," + (Y - pixels) + "\r\n"; // DownDecel
                a += " MY,2," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.25) * periodCycle)) + "," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.50) * periodCycle)) + "," + (Y - pixels) + "," + Y + "\r\n"; // UpAccel
                a += " MY,1," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.50) * periodCycle)) + "," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.75) * periodCycle)) + "," + Y + "," + (Y + pixels) + "\r\n"; // UpDecel
                a += " MY,2," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.75) * periodCycle)) + "," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 1.00) * periodCycle)) + "," + (Y + pixels) + "," + Y + "\r\n"; // DownAccel
            }
        }
        return a;
    }

    public static String theBestThingEver(List<Note> list, int X, int Y, float ScrollBPM, float intensity, int cycles) {
        String wave1 = confusionWave(list, X, Y, ScrollBPM, intensity, cycles);
        String wave2 = confusionWave(list, X, Y, ScrollBPM, -intensity, cycles);
        return wave1 + "\n" + wave2;
    }

    public static String vertWave2(List<Note> list, int X, int Y, float ScrollBPM, float intensity, int cycles) {
        Collections.reverse(list);
        int noteCount = list.size();
        // 1.00 intensity = 25 pixels
        int pixels = 25;
        float periodCycle = 4f / (float) cycles;
        pixels *= intensity;

        String a = "";
        for (int i = 0; i < noteCount; i++) {
            Note n = list.get(i);
            int hs = n.getHitsound();
            a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
            a += "MX,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 4)) + "," + n.getMillis() + "," + (X + 630) + "," + X + "\r\n ";
            for (float Q = cycles; Q > 0; Q--) {
                a += "MY,2," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.00) * periodCycle)) + "," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.25) * periodCycle)) + "," + Y + "," + (Y - pixels) + "\r\n "; // DownDecel
                a += "MY,1," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.25) * periodCycle)) + "," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.50) * periodCycle)) + "," + (Y - pixels) + "," + Y + "\r\n "; // UpAccel
                a += "MY,2," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.50) * periodCycle)) + "," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.75) * periodCycle)) + "," + Y + "," + (Y + pixels) + "\r\n "; // UpDecel
                a += "MY,1," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.75) * periodCycle)) + "," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 1.00) * periodCycle)) + "," + (Y + pixels) + "," + Y + "\r\n "; // DownAccel
            }
            if (((hs >> 2) & 1) == 0) {
                a += "S,0," + n.getMillis() + ",,0.35\r\n ";
            } else {
                a += "S,0," + n.getMillis() + ",,0.5\r\n ";
            }
            if (((hs >> 1) & 1) == 1 || ((hs >> 3) & 1) == 1) {
                a += "C,0," + n.getMillis() + ",,100,160,255\r\n";
            } else {
                a += "C,0," + n.getMillis() + ",,255,80,80\r\n";
            }

            if (((hs >> 2) & 1) == 0) {
                a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
                a += "S,0," + n.getMillis() + ",,0.35\r\n ";
            } else {
                a += "Sprite,Foreground,Centre,\"SB/notebig-overlay.png\",320,240\r\n ";
                a += "S,0," + n.getMillis() + ",,0.5\r\n ";
            }
            a += "MX,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 4)) + "," + n.getMillis() + "," + (X + 630) + "," + X + "\r\n";
            for (float Q = 4; Q > 0; Q--) {
                a += " MY,2," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.00) * periodCycle)) + "," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.25) * periodCycle)) + "," + Y + "," + (Y - pixels) + "\r\n"; // DownDecel
                a += " MY,1," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.25) * periodCycle)) + "," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.50) * periodCycle)) + "," + (Y - pixels) + "," + Y + "\r\n"; // UpAccel
                a += " MY,2," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.50) * periodCycle)) + "," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.75) * periodCycle)) + "," + Y + "," + (Y + pixels) + "\r\n"; // UpDecel
                a += " MY,1," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.75) * periodCycle)) + "," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 1.00) * periodCycle)) + "," + (Y + pixels) + "," + Y + "\r\n"; // DownAccel
            }
        }
        return a;
    }

    public static String doubleWave2(List<Note> list, int X, int Y, float ScrollBPM, float intensity, int cycles) {
        String wave1 = vertWave2(list, X, Y, ScrollBPM, intensity, cycles);
        String wave2 = vertWave2(list, X, Y, ScrollBPM, -intensity, cycles);
        return wave1 + "\n" + wave2;
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

    /* public static String sandStops(List<Note> list, int X, int Y, float ScrollBPM, List<Stop> stops){
        return null;
    } */
    
    public static String starMode(List<Note> list, int X, int Y, float ScrollBPM) {
        Collections.reverse(list);
        int noteCount = list.size();
        String a = "";
        for (int i = 0; i < noteCount; i++) {
            Note n = list.get(i);
            int hs = n.getHitsound();
            switch (i % 4) {
                case 0:
                    a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
                    a += "M,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 5)) + "," + n.getMillis() + ",800,370,320,370\r\n ";
                    //a += hide(n.getMillis() - (long) ((60000 / ScrollBPM) * 5), 246181);
                    a += "S,0," + n.getMillis() + ",,0.35\r\n";
                    a += colorStar(hs, n, X, Y);
                    a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
                    a += "M,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 5)) + "," + n.getMillis() + ",800,370,320,370\r\n ";
                    //a += hide(n.getMillis() - (long) ((60000 / ScrollBPM) * 5), 246181);
                    a += "S,0," + n.getMillis() + ",,0.35\r\n";
                    break;
                case 1:
                    a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
                    a += "M,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 7)) + "," + n.getMillis() + ",659,75,320,370\r\n ";
                    //a += hide(n.getMillis() - (long) ((60000 / ScrollBPM) * 7), 246181);
                    a += "R,0," + n.getMillis() + ",,2.35619449019\r\n ";
                    a += "S,0," + n.getMillis() + ",,0.35\r\n";
                    a += colorStar(hs, n, X, Y);
                    a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
                    a += "M,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 7)) + "," + n.getMillis() + ",659,75,320,370\r\n ";
                    //a += hide(n.getMillis() - (long) ((60000 / ScrollBPM) * 7), 246181);
                    a += "R,0," + n.getMillis() + ",,2.35619449019\r\n ";
                    a += "S,0," + n.getMillis() + ",,0.35\r\n";
                    break;
                case 2:
                    a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
                    a += "M,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 5)) + "," + n.getMillis() + ",320,75,320,370\r\n ";
                    //a += hide(n.getMillis() - (long) ((60000 / ScrollBPM) * 5), 246181);
                    a += "R,0," + n.getMillis() + ",,1.57079632679\r\n ";
                    a += "S,0," + n.getMillis() + ",,0.35\r\n";
                    a += colorStar(hs, n, X, Y);
                    a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
                    //a += hide(n.getMillis() - (long) ((60000 / ScrollBPM) * 5), 246181);
                    a += "M,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 5)) + "," + n.getMillis() + ",320,75,320,370\r\n ";
                    a += "R,0," + n.getMillis() + ",,1.57079632679\r\n ";
                    a += "S,0," + n.getMillis() + ",,0.35\r\n";
                    break;
                case 3:
                    a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
                    a += "M,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 7)) + "," + n.getMillis() + ",-19,75,320,370\r\n ";
                    //a += hide(n.getMillis() - (long) ((60000 / ScrollBPM) * 7), 246181);
                    a += "R,0," + n.getMillis() + ",,0.78539816339\r\n ";
                    a += "S,0," + n.getMillis() + ",,0.35\r\n";
                    a += colorStar(hs, n, X, Y);
                    a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
                    //a += hide(n.getMillis() - (long) ((60000 / ScrollBPM) * 7), 246181);
                    a += "M,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 7)) + "," + n.getMillis() + ",-19,75,320,370\r\n ";
                    a += "R,0," + n.getMillis() + ",,0.78539816339\r\n ";
                    a += "S,0," + n.getMillis() + ",,0.35\r\n";
                    break;
                default:
                    break;
            }
        }
        return a;
    }

    public static String scroll(List<Note> list, double speed, int X, int Y, float ScrollBPM) {
        final double TRUC = Math.max(speed, 1E-2); // MAX 300
        Collections.reverse(list);
        int noteCount = list.size();
        String a = "";
        for (int i = 0; i < noteCount; i++) {
            Note n = list.get(i);
            int hs = n.getHitsound();
            a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
            a += "M,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (4 / TRUC))) + "," + n.getMillis() + "," + (X + 630) + "," + Y + "," + X + "," + Y + "\r\n ";
            if (((hs >> 2) & 1) == 0) {
                a += "S,0," + n.getMillis() + ",,0.35\r\n ";
            } else {
                a += "S,0," + n.getMillis() + ",,0.5\r\n ";
            }
            if (((hs >> 1) & 1) == 1 || ((hs >> 3) & 1) == 1) {
                a += "C,0," + n.getMillis() + ",,100,160,255\r\n";
            } else {
                a += "C,0," + n.getMillis() + ",,255,80,80\r\n";
            }
            if (((hs >> 2) & 1) == 0) {
                a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
                a += "S,0," + n.getMillis() + ",,0.35\r\n ";
            } else {
                a += "Sprite,Foreground,Centre,\"SB/notebig-overlay.png\",320,240\r\n ";
                a += "S,0," + n.getMillis() + ",,0.5\r\n ";
            }
            a += "M,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (4 / TRUC))) + "," + n.getMillis() + "," + (X + 630) + "," + Y + "," + X + "," + Y + "\r\n";
        }
        return a;
    }

    public static String splitScroll(List<Note> list, int X, int Y, float ScrollBPM) {
        Collections.reverse(list);
        int noteCount = list.size();
        String a = "";
        for (int i = 0; i < noteCount; i++) {
            Note n = list.get(i);
            int hs = n.getHitsound();
            if (((hs >> 1) & 1) == 1 || ((hs >> 3) & 1) == 1) {
                a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
                a += "M,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 4)) + "," + n.getMillis() + ",720," + Y + ",320," + Y + "\r\n ";
                if (((hs >> 2) & 1) == 0) {
                    a += "S,0," + n.getMillis() + ",,0.35\r\n ";
                } else {
                    a += "S,0," + n.getMillis() + ",,0.5\r\n ";
                }
                a += "C,0," + n.getMillis() + ",,100,160,255\r\n";
                if (((hs >> 2) & 1) == 0) {
                    a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
                    a += "S,0," + n.getMillis() + ",,0.35\r\n ";
                } else {
                    a += "Sprite,Foreground,Centre,\"SB/notebig-overlay.png\",320,240\r\n ";
                    a += "S,0," + n.getMillis() + ",,0.5\r\n ";
                }
                a += "M,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 4)) + "," + n.getMillis() + ",720," + Y + ",320," + Y + "\r\n";
            } else {
                a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
                a += "M,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 4)) + "," + n.getMillis() + ",-80," + Y + ",320," + Y + "\r\n ";
                if (((hs >> 2) & 1) == 0) {
                    a += "S,0," + n.getMillis() + ",,0.35\r\n ";
                } else {
                    a += "S,0," + n.getMillis() + ",,0.5\r\n ";
                }
                a += "C,0," + n.getMillis() + ",,255,80,80\r\n";

                if (((hs >> 2) & 1) == 0) {
                    a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
                    a += "S,0," + n.getMillis() + ",,0.35\r\n ";
                } else {
                    a += "Sprite,Foreground,Centre,\"SB/notebig-overlay.png\",320,240\r\n ";
                    a += "S,0," + n.getMillis() + ",,0.5\r\n ";
                }
                a += "M,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 4)) + "," + n.getMillis() + ",-80," + Y + ",320," + Y + "\r\n";
            }
        }
        return a;
    }

    public static String vertWave(List<Note> list, int X, int Y, float ScrollBPM, float intensity, int cycles) {
        Collections.reverse(list);
        int noteCount = list.size();
        // 1.00 intensity = 25 pixels
        int pixels = 25;
        float periodCycle = 4f / (float) cycles;
        pixels *= intensity;

        String a = "";
        for (int i = 0; i < noteCount; i++) {
            Note n = list.get(i);
            int hs = n.getHitsound();
            a += "Sprite,Foreground,Centre,\"SB/note.png\",320,240\r\n ";
            a += "MX,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 4)) + "," + n.getMillis() + "," + (X + 630) + "," + X + "\r\n ";
            for (float Q = cycles; Q > 0; Q--) {
                a += "MY,1," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.00) * periodCycle)) + "," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.25) * periodCycle)) + "," + Y + "," + (Y - pixels) + "\r\n "; // DownDecel
                a += "MY,2," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.25) * periodCycle)) + "," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.50) * periodCycle)) + "," + (Y - pixels) + "," + Y + "\r\n "; // UpAccel
                a += "MY,1," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.50) * periodCycle)) + "," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.75) * periodCycle)) + "," + Y + "," + (Y + pixels) + "\r\n "; // UpDecel
                a += "MY,2," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.75) * periodCycle)) + "," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 1.00) * periodCycle)) + "," + (Y + pixels) + "," + Y + "\r\n "; // DownAccel
            }
            if (((hs >> 2) & 1) == 0) {
                a += "S,0," + n.getMillis() + ",,0.35\r\n ";
            } else {
                a += "S,0," + n.getMillis() + ",,0.5\r\n ";
            }
            if (((hs >> 1) & 1) == 1 || ((hs >> 3) & 1) == 1) {
                a += "C,0," + n.getMillis() + ",,100,160,255\r\n";
            } else {
                a += "C,0," + n.getMillis() + ",,255,80,80\r\n";
            }

            if (((hs >> 2) & 1) == 0) {
                a += "Sprite,Foreground,Centre,\"SB/note-overlay.png\",320,240\r\n ";
                a += "S,0," + n.getMillis() + ",,0.35\r\n ";
            } else {
                a += "Sprite,Foreground,Centre,\"SB/notebig-overlay.png\",320,240\r\n ";
                a += "S,0," + n.getMillis() + ",,0.5\r\n ";
            }
            a += "MX,0," + (n.getMillis() - (int) ((60000 / ScrollBPM) * 4)) + "," + n.getMillis() + "," + (X + 630) + "," + X + "\r\n";
            for (float Q = 4; Q > 0; Q--) {
                a += " MY,1," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.00) * periodCycle)) + "," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.25) * periodCycle)) + "," + Y + "," + (Y - pixels) + "\r\n"; // DownDecel
                a += " MY,2," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.25) * periodCycle)) + "," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.50) * periodCycle)) + "," + (Y - pixels) + "," + Y + "\r\n"; // UpAccel
                a += " MY,1," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.50) * periodCycle)) + "," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.75) * periodCycle)) + "," + Y + "," + (Y + pixels) + "\r\n"; // UpDecel
                a += " MY,2," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 0.75) * periodCycle)) + "," + (n.getMillis() - (int) ((60000 / ScrollBPM) * (Q - 1.00) * periodCycle)) + "," + (Y + pixels) + "," + Y + "\r\n"; // DownAccel
            }
        }
        return a;
    }

    public static String doubleWave(List<Note> list, int X, int Y, float ScrollBPM, float intensity, int cycles) {
        String wave1 = vertWave(list, X, Y, ScrollBPM, intensity, cycles);
        String wave2 = vertWave(list, X, Y, ScrollBPM, -intensity, cycles);
        return wave1 + "\n" + wave2;
    }

    public static String counter(List<Note> list, int X, int Y) {
        Collections.reverse(list);
        int noteCount = list.size();
        String nc = String.valueOf(noteCount);
        String a = "";
        if (noteCount >= 1000 && noteCount < 10000) {
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 4)) + ".png\",320,240\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 1000 - 1).getMillis() + ",50,370\r\n ";
            a += "S,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 1000 - 1).getMillis() + ",0.5\r\n";
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 3)) + ".png\",320,240\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 100 - 1).getMillis() + ",70,370\r\n ";
            a += "S,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 100 - 1).getMillis() + ",0.5\r\n";
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 2)) + ".png\",320,240\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 10 - 1).getMillis() + ",90,370\r\n ";
            a += "S,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 10 - 1).getMillis() + ",0.5\r\n";
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 1)) + ".png\",320,240\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 1 - 1).getMillis() + ",110,370\r\n ";
            a += "S,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 1 - 1).getMillis() + ",0.5\r\n";
        } else if (noteCount >= 100) {
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 3)) + ".png\",320,240\r\n ";
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
            if (i >= 1000 && i < 10000) {
                a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (i % 10) + ".png\",320,240\r\n ";
                a += "M,0," + nNext.getMillis() + "," + nCurrent.getMillis() + ",110,370\r\n ";
                a += "S,0," + nNext.getMillis() + "," + nCurrent.getMillis() + ",0.5\r\n";
                if ((i + 1) % 10 == 0) {
                    a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (((i % 100) / 10)) + ".png\",320,240\r\n ";
                    a += "M,0," + nNext.getMillis() + "," + list.get(i - 10).getMillis() + ",90,370\r\n ";
                    a += "S,0," + nNext.getMillis() + "," + list.get(i - 10).getMillis() + ",0.5\r\n";
                }
                if ((i + 1) % 100 == 0) {
                    a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (((i % 1000) / 100)) + ".png\",320,240\r\n ";
                    a += "M,0," + nNext.getMillis() + "," + list.get(i - 100).getMillis() + ",70,370\r\n ";
                    a += "S,0," + nNext.getMillis() + "," + list.get(i - 100).getMillis() + ",0.5\r\n";
                }
                if ((i + 1) % 1000 == 0) {
                    a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (((i % 10000) / 1000)) + ".png\",320,240\r\n ";
                    a += "M,0," + nNext.getMillis() + "," + list.get(i - 1000).getMillis() + ",50,370\r\n ";
                    a += "S,0," + nNext.getMillis() + "," + list.get(i - 1000).getMillis() + ",0.5\r\n";
                }
            }
            if (i >= 100 && i < 1000) {
                a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (i % 10) + ".png\",320,240\r\n ";
                a += "M,0," + nNext.getMillis() + "," + nCurrent.getMillis() + ",100,370\r\n ";
                a += "S,0," + nNext.getMillis() + "," + nCurrent.getMillis() + ",0.5\r\n";
                if ((i + 1) % 10 == 0) {
                    a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (((i % 100) / 10)) + ".png\",320,240\r\n ";
                    a += "M,0," + nNext.getMillis() + "," + list.get(i - 10).getMillis() + ",80,370\r\n ";
                    a += "S,0," + nNext.getMillis() + "," + list.get(i - 10).getMillis() + ",0.5\r\n";
                }
                if ((i + 1) % 100 == 0) {
                    a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (((i % 1000) / 100)) + ".png\",320,240\r\n ";
                    a += "M,0," + nNext.getMillis() + "," + list.get(i - 100).getMillis() + ",60,370\r\n ";
                    a += "S,0," + nNext.getMillis() + "," + list.get(i - 100).getMillis() + ",0.5\r\n";
                }
            }
            if (i >= 10 && i < 100) {
                a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (i % 10) + ".png\",320,240\r\n ";
                a += "M,0," + nNext.getMillis() + "," + nCurrent.getMillis() + ",90,370\r\n ";
                a += "S,0," + nNext.getMillis() + "," + nCurrent.getMillis() + ",0.5\r\n";
                if ((i + 1) % 10 == 0) {
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

    public static String counterMirror(List<Note> list, int X, int Y) {
        Collections.reverse(list);
        int noteCount = list.size();
        String nc = String.valueOf(noteCount);
        String a = "";
        if (noteCount >= 1000 && noteCount < 10000) {
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 4)) + ".png\",320,240\r\n ";
            a += "V,0," + list.get(list.size() - 1).getMillis() + ",,-0.5,0.5\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 1000 - 1).getMillis() + ",582,370\r\n";
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 3)) + ".png\",320,240\r\n ";
            a += "V,0," + list.get(list.size() - 1).getMillis() + ",,-0.5,0.5\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 100 - 1).getMillis() + ",562,370\r\n";
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 2)) + ".png\",320,240\r\n ";
            a += "V,0," + list.get(list.size() - 1).getMillis() + ",,-0.5,0.5\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 10 - 1).getMillis() + ",542,370\r\n";
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 1)) + ".png\",320,240\r\n ";
            a += "V,0," + list.get(list.size() - 1).getMillis() + ",,-0.5,0.5\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 1 - 1).getMillis() + ",522,370\r\n";
        } else if (noteCount >= 100) {
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

            if (i >= 1000 && i < 10000) {
                a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (i % 10) + ".png\",320,240\r\n ";
                a += "M,0," + nNext.getMillis() + "," + nCurrent.getMillis() + ",522,370\r\n ";
                a += "V,0," + nNext.getMillis() + ",,-0.5,0.5\r\n";
                if ((i + 1) % 10 == 0) {
                    a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (((i % 100) / 10)) + ".png\",320,240\r\n ";
                    a += "M,0," + nNext.getMillis() + "," + list.get(i - 10).getMillis() + ",542,370\r\n ";
                    a += "V,0," + nNext.getMillis() + ",,-0.5,0.5\r\n";
                }
                if ((i + 1) % 100 == 0) {
                    a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (((i % 1000) / 100)) + ".png\",320,240\r\n ";
                    a += "M,0," + nNext.getMillis() + "," + list.get(i - 100).getMillis() + ",562,370\r\n ";
                    a += "V,0," + nNext.getMillis() + ",,-0.5,0.5\r\n";
                }
                if ((i + 1) % 1000 == 0) {
                    a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (((i % 10000) / 1000)) + ".png\",320,240\r\n ";
                    a += "M,0," + nNext.getMillis() + "," + list.get(i - 1000).getMillis() + ",582,370\r\n ";
                    a += "V,0," + nNext.getMillis() + ",,-0.5,0.5\r\n";
                }
            }
            if (i >= 100 && i < 1000) {
                a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (i % 10) + ".png\",320,240\r\n ";
                a += "M,0," + nNext.getMillis() + "," + nCurrent.getMillis() + ",532,370\r\n ";
                a += "V,0," + nNext.getMillis() + ",,-0.5,0.5\r\n";
                if ((i + 1) % 10 == 0) {
                    a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (((i % 100) / 10)) + ".png\",320,240\r\n ";
                    a += "M,0," + nNext.getMillis() + "," + list.get(i - 10).getMillis() + ",552,370\r\n ";
                    a += "V,0," + nNext.getMillis() + ",,-0.5,0.5\r\n";
                }
                if ((i + 1) % 100 == 0) {
                    a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (((i % 1000) / 100)) + ".png\",320,240\r\n ";
                    a += "M,0," + nNext.getMillis() + "," + list.get(i - 100).getMillis() + ",572,370\r\n ";
                    a += "V,0," + nNext.getMillis() + ",,-0.5,0.5\r\n";
                }
            }
            if (i >= 10 && i < 100) {
                a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (i % 10) + ".png\",320,240\r\n ";
                a += "M,0," + nNext.getMillis() + "," + nCurrent.getMillis() + ",542,370\r\n ";
                a += "V,0," + nNext.getMillis() + ",,-0.5,0.5\r\n";
                if ((i + 1) % 10 == 0) {
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

    public static String counterUpside(List<Note> list, int X, int Y) {
        Collections.reverse(list);
        int noteCount = list.size();
        String nc = String.valueOf(noteCount);
        String a = "";
        if (noteCount >= 1000) {
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 4)) + ".png\",320,240\r\n ";
            a += "V,0," + list.get(list.size() - 1).getMillis() + ",,0.5,-0.5\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 1000 - 1).getMillis() + ",50,90\r\n";
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 3)) + ".png\",320,240\r\n ";
            a += "V,0," + list.get(list.size() - 1).getMillis() + ",,0.5,-0.5\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 100 - 1).getMillis() + ",70,90\r\n";
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 2)) + ".png\",320,240\r\n ";
            a += "V,0," + list.get(list.size() - 1).getMillis() + ",,0.5,-0.5\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 10 - 1).getMillis() + ",90,90\r\n";
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 1)) + ".png\",320,240\r\n ";
            a += "V,0," + list.get(list.size() - 1).getMillis() + ",,0.5,-0.5\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 1 - 1).getMillis() + ",110,90\r\n";
        } else if (noteCount >= 100) {
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
            if (i >= 1000 && i < 10000) {
                a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (i % 10) + ".png\",320,240\r\n ";
                a += "M,0," + nNext.getMillis() + "," + nCurrent.getMillis() + ",110,90\r\n ";
                a += "V,0," + nNext.getMillis() + ",,0.5,-0.5\r\n";
                if ((i + 1) % 10 == 0) {
                    a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (((i % 100) / 10)) + ".png\",320,240\r\n ";
                    a += "M,0," + nNext.getMillis() + "," + list.get(i - 10).getMillis() + ",90,90\r\n ";
                    a += "V,0," + nNext.getMillis() + ",,0.5,-0.5\r\n";
                }
                if ((i + 1) % 100 == 0) {
                    a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (((i % 1000) / 100)) + ".png\",320,240\r\n ";
                    a += "M,0," + nNext.getMillis() + "," + list.get(i - 100).getMillis() + ",70,90\r\n ";
                    a += "V,0," + nNext.getMillis() + ",,0.5,-0.5\r\n";
                }
                if ((i + 1) % 1000 == 0) {
                    a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (((i % 10000) / 1000)) + ".png\",320,240\r\n ";
                    a += "M,0," + nNext.getMillis() + "," + list.get(i - 1000).getMillis() + ",50,90\r\n ";
                    a += "V,0," + nNext.getMillis() + ",,0.5,-0.5\r\n";
                }
            }
            if (i >= 100 && i < 1000) {
                a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (i % 10) + ".png\",320,240\r\n ";
                a += "M,0," + nNext.getMillis() + "," + nCurrent.getMillis() + ",100,90\r\n ";
                a += "V,0," + nNext.getMillis() + ",,0.5,-0.5\r\n";
                if ((i + 1) % 10 == 0) {
                    a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (((i % 100) / 10)) + ".png\",320,240\r\n ";
                    a += "M,0," + nNext.getMillis() + "," + list.get(i - 10).getMillis() + ",80,90\r\n ";
                    a += "V,0," + nNext.getMillis() + ",,0.5,-0.5\r\n";
                }
                if ((i + 1) % 100 == 0) {
                    a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (((i % 1000) / 100)) + ".png\",320,240\r\n ";
                    a += "M,0," + nNext.getMillis() + "," + list.get(i - 100).getMillis() + ",60,90\r\n ";
                    a += "V,0," + nNext.getMillis() + ",,0.5,-0.5\r\n";
                }
            }
            if (i >= 10 && i < 100) {
                a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (i % 10) + ".png\",320,240\r\n ";
                a += "M,0," + nNext.getMillis() + "," + nCurrent.getMillis() + ",90,90\r\n ";
                a += "V,0," + nNext.getMillis() + ",,0.5,-0.5\r\n";
                if ((i + 1) % 10 == 0) {
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

    public static String counterReverse(List<Note> list, int X, int Y) {
        Collections.reverse(list);
        int noteCount = list.size();
        String nc = String.valueOf(noteCount);
        String a = "";
        if (noteCount >= 1000 && noteCount < 10000) {
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 4)) + ".png\",320,240\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 1000 - 1).getMillis() + ",520,370\r\n ";
            a += "S,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 1000 - 1).getMillis() + ",0.5\r\n";
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 3)) + ".png\",320,240\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 100 - 1).getMillis() + ",540,370\r\n ";
            a += "S,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 100 - 1).getMillis() + ",0.5\r\n";
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 2)) + ".png\",320,240\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 10 - 1).getMillis() + ",560,370\r\n ";
            a += "S,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 10 - 1).getMillis() + ",0.5\r\n";
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 1)) + ".png\",320,240\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 1 - 1).getMillis() + ",580,370\r\n ";
            a += "S,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 1 - 1).getMillis() + ",0.5\r\n";
        } else if (noteCount >= 100) {
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 3)) + ".png\",320,240\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 100 - 1).getMillis() + ",530,370\r\n ";
            a += "S,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 100 - 1).getMillis() + ",0.5\r\n";
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 2)) + ".png\",320,240\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 10 - 1).getMillis() + ",550,370\r\n ";
            a += "S,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 10 - 1).getMillis() + ",0.5\r\n";
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 1)) + ".png\",320,240\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 1 - 1).getMillis() + ",570,370\r\n ";
            a += "S,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 1 - 1).getMillis() + ",0.5\r\n";
        } else if (noteCount >= 10) {
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 2)) + ".png\",320,240\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 10 - 1).getMillis() + ",540,370\r\n ";
            a += "S,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 10 - 1).getMillis() + ",0.5\r\n";
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 1)) + ".png\",320,240\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 1 - 1).getMillis() + ",560,370\r\n ";
            a += "S,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 1 - 1).getMillis() + ",0.5\r\n";
        } else if (noteCount >= 1) {
            a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (nc.charAt(nc.length() - 1)) + ".png\",320,240\r\n ";
            a += "M,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 1 - 1).getMillis() + ",550,370\r\n ";
            a += "S,0," + list.get(list.size() - 1).getMillis() + "," + list.get(list.size() - noteCount % 1 - 1).getMillis() + ",0.5\r\n";
        }
        for (int i = noteCount - 1; i > 0; i--) {
            Note nCurrent = list.get(i - 1);
            Note nNext = list.get(i);
            if (i >= 1000 && i < 10000) {
                a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (i % 10) + ".png\",320,240\r\n ";
                a += "M,0," + nNext.getMillis() + "," + nCurrent.getMillis() + ",580,370\r\n ";
                a += "S,0," + nNext.getMillis() + "," + nCurrent.getMillis() + ",0.5\r\n";
                if ((i + 1) % 10 == 0) {
                    a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (((i % 100) / 10)) + ".png\",320,240\r\n ";
                    a += "M,0," + nNext.getMillis() + "," + list.get(i - 10).getMillis() + ",560,370\r\n ";
                    a += "S,0," + nNext.getMillis() + "," + list.get(i - 10).getMillis() + ",0.5\r\n";
                }
                if ((i + 1) % 100 == 0) {
                    a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (((i % 1000) / 100)) + ".png\",320,240\r\n ";
                    a += "M,0," + nNext.getMillis() + "," + list.get(i - 100).getMillis() + ",540,370\r\n ";
                    a += "S,0," + nNext.getMillis() + "," + list.get(i - 100).getMillis() + ",0.5\r\n";
                }
                if ((i + 1) % 1000 == 0) {
                    a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (((i % 10000) / 1000)) + ".png\",320,240\r\n ";
                    a += "M,0," + nNext.getMillis() + "," + list.get(i - 1000).getMillis() + ",520,370\r\n ";
                    a += "S,0," + nNext.getMillis() + "," + list.get(i - 1000).getMillis() + ",0.5\r\n";
                }
            }
            if (i >= 100 && i < 1000) {
                a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (i % 10) + ".png\",320,240\r\n ";
                a += "M,0," + nNext.getMillis() + "," + nCurrent.getMillis() + ",570,370\r\n ";
                a += "S,0," + nNext.getMillis() + "," + nCurrent.getMillis() + ",0.5\r\n";
                if ((i + 1) % 10 == 0) {
                    a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (((i % 100) / 10)) + ".png\",320,240\r\n ";
                    a += "M,0," + nNext.getMillis() + "," + list.get(i - 10).getMillis() + ",550,370\r\n ";
                    a += "S,0," + nNext.getMillis() + "," + list.get(i - 10).getMillis() + ",0.5\r\n";
                }
                if ((i + 1) % 100 == 0) {
                    a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (((i % 1000) / 100)) + ".png\",320,240\r\n ";
                    a += "M,0," + nNext.getMillis() + "," + list.get(i - 100).getMillis() + ",530,370\r\n ";
                    a += "S,0," + nNext.getMillis() + "," + list.get(i - 100).getMillis() + ",0.5\r\n";
                }
            }
            if (i >= 10 && i < 100) {
                a += "Sprite,Foreground,Centre,\"SB/numbers/val_" + (i % 10) + ".png\",320,240\r\n ";
                a += "M,0," + nNext.getMillis() + "," + nCurrent.getMillis() + ",560,370\r\n ";
                a += "S,0," + nNext.getMillis() + "," + nCurrent.getMillis() + ",0.5\r\n";
                if ((i + 1) % 10 == 0) {
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
