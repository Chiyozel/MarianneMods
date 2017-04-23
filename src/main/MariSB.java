/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.FolderUtils;
import utils.MapUtils;
import utils.Note;
import mods.Mods;

/**
 *
 * @author Unmei Muma
 */
public class MariSB extends MapUtils implements FolderUtils {

    public int X;
    public int Y;
    private float scrollbpm;

    public MariSB() {

        Scanner sc = new Scanner(System.in);

        this.isNewFile = false;

        folder = new File("./osuMaps/");
        settings = new File("./settings.ini");

        boolean created = FolderUtils.checkForFolder(folder) && FolderUtils.checkForFile(settings);
        if (created) {
            this.createSettings(settings);
            System.out.println("Directory ./osuMaps/ and settings file created.\n"
                    + "Place all the files in the folder and restart the program.\n");
            closeProgram();
        }

        CopyOnWriteArrayList<File> files = FolderUtils.listFiles(new File("./osuMaps/"));
        if (f != null) {
            files.add(f);
        }

        try {
            InputStream i = new FileInputStream(settings);
            InputStreamReader r = new InputStreamReader(i);
            BufferedReader br = new BufferedReader(r);
            String l, k, v;
            String temp[];

            while ((l = br.readLine()) != null) {
                if (!l.startsWith("//")) {
                    temp = l.split("=");
                    k = temp[0];
                    v = temp[1];
                    switch (k) {
                        case "X":
                            X = Integer.parseInt(v);
                            break;
                        case "Y":
                            Y = Integer.parseInt(v);
                            break;
                        default:
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        newChart = new File("./SB.osb");
        if (!newChart.exists()) {
            try {
                System.out.println("SB.osb created.");
                newChart.createNewFile();
                isNewFile = true;
            } catch (IOException ex) {
                Logger.getLogger(MariSB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        notes = new CopyOnWriteArrayList<>();
        if (files.size() > 0) {
            files.stream().forEach((file) -> {
                readMap(file);
                if (contents.contains("Mode: 1")) {
                    taikoModification(file, sc);
                }
            });
        } else {
            System.out.println("No files found!");
        }

        closeProgram();
    }

    /**
     *
     * @return a string containing all the notes.
     */
    @Override
    public String toString() {

        String s = "Notes :\n";
        //    s = notes.stream().map((n) -> n.toString() + "\n").reduce(s, String::concat);
        return s;
    }

    /**
     * Closes the program automatically.
     */
    private void closeProgram() {
        System.out.println("This program will close itself in 5 seconds.");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(MariSB.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
    }

    /**
     * Modifies the Taiko map.
     */
    /**
     * Processes a map file.
     *
     * @param file
     * @param sc
     */
    private void taikoModification(File file, Scanner sc) {
        f = file;
        int type, start, end;
        String out = "";

        sc.useLocale(Locale.US);
        filePath = f.getAbsolutePath();

        System.out.println("Do you want to scan this file? (y/n) ");
        if (sc.next().equalsIgnoreCase("y")) {

            listNotes();

            System.out.println("Starting point of the SB Mod:");
            start = sc.nextInt();

            for (Note n : notes) {
                if (n.getMillis() < start) {
                    notes.remove(n);
                }
            }

            System.out.println("Ending point of the SB Mod:");
            end = sc.nextInt();

            for (Note n : notes) {
                if (n.getMillis() > end) {
                    notes.remove(n);
                }
            }

            System.out.println("Scroll Speed (in BPM):");
            scrollbpm = sc.nextFloat();

            System.out.println(
                    "What do you want to do?\n"
                    + "\t(Everything there has been used for MariannE 2015 and 2016)\n"
                    + "1.\tNote counter (Left side)\n"
                    + "2.\tNote counter (Right side)\n"
                    + "3.\tNote counter (Right side, mirrored)\n"
                    + "4.\tDouble scrolling mode\n"
                    + "5.\tGravity Mode\n"
                    + "6.\tAbekobe\n"
                    + "7.\tLeft to Right Abekobe\n"
                    + "8.\tReversed Scroll\n"
                    + "9.\tSplit Scroll\n"
                    + "10.\tNormal Scroll Mode...\n"
                    + "11.\tUpside Down Abekobe\n"
                    + "12.\tBoost Mode\n"
                    + "13.\tNote Counter (Left side, upside down)\n"
                    + "14.\tUpside Down\n"
                    + "15.\t4 Star Mode\n"
                    + "16.\tVertical Wave (EXPERIMENTAL, LONG PROCESS)\n"
                    + "17.\tDouble Wave (EXPERIMENTAL, LONG PROCESS)\n"
                    + "18-24.\tToo lazy to add for now"
                    + "25.\tIt doesn't exist yet but it's gonna be some good stop shit"
            );
            type = sc.nextInt();

            switch (type) {
                case 1:
                    out = Mods.counter(notes, X, Y);
                    break;
                case 2:
                    out = Mods.counterReverse(notes, X, Y);
                    break;
                case 3:
                    out = Mods.counterMirror(notes, X, Y);
                    break;
                case 4:
                    out = Mods.doubleScroll(notes, X, Y, scrollbpm);
                    break;
                case 5:
                    out = Mods.gravity(notes, X, Y, scrollbpm);
                    break;
                case 6:
                    out = Mods.abekobe(notes, X, Y, scrollbpm);
                    break;
                case 7:
                    out = Mods.abekobeReverse(notes, X, Y, scrollbpm);
                    break;
                case 8:
                    out = Mods.reverseScroll(notes, X, Y, scrollbpm);
                    break;
                case 9:
                    out = Mods.splitScroll(notes, X, Y, scrollbpm);
                    break;
                case 10:
                    System.out.println("------------\nAt which speed do you want it to go?");
                    double speed = sc.nextDouble();
                    if (speed < 0) {
                        speed = 1.;
                    }
                    out = Mods.scroll(notes, speed, X, Y, scrollbpm);
                    break;
                case 11:
                    out = Mods.upsideDownAbek(notes, X, Y, scrollbpm);
                    break;
                case 12:
                    out = Mods.boost(notes, X, Y, scrollbpm);
                    break;
                case 13:
                    out = Mods.counterUpside(notes, X, Y);
                    break;
                case 14:
                    out = Mods.upsideDown(notes, X, Y, scrollbpm);
                    break;
                case 15:
                    out = Mods.starMode(notes, X, Y, scrollbpm);
                    break;
                case 16:
                    System.out.println("------------\nHow intense should the wave be? 1.00 = 25 pixels");
                    float intensity = sc.nextFloat();

                    System.out.println("------------\nHow many periods do you want?");
                    int periods = sc.nextInt();

                    out = Mods.vertWave(notes, X, Y, scrollbpm, intensity, periods);
                    break;
                case 17:
                    System.out.println("------------\nHow intense should the wave be? 1.00 = 25 pixels");
                    intensity = sc.nextFloat();

                    System.out.println("------------\nHow many periods do you want?");
                    periods = sc.nextInt();

                    out = Mods.doubleWave(notes, X, Y, scrollbpm, intensity, periods);
                    break;
                case 18:
                    out = Mods.confusion(notes, X, Y, scrollbpm);
                    break;
                case 19:
                    System.out.println("------------\nHow intense should the wave be? 1.00 = 25 pixels");
                    intensity = sc.nextFloat();

                    System.out.println("------------\nHow many periods do you want?");
                    periods = sc.nextInt();

                    out = Mods.confusionWave(notes, X, Y, scrollbpm, intensity, periods);
                    break;
                case 20:
                    System.out.println("------------\nHow intense should the wave be? 1.00 = 25 pixels");
                    intensity = sc.nextFloat();

                    System.out.println("------------\nHow many periods do you want?");
                    periods = sc.nextInt();

                    out = Mods.theBestThingEver(notes, X, Y, scrollbpm, intensity, periods);
                    break;
                case 21:
                    System.out.println("------------\nHow intense should the wave be? 1.00 = 25 pixels");
                    intensity = sc.nextFloat();

                    System.out.println("------------\nHow many periods do you want?");
                    periods = sc.nextInt();

                    out = Mods.vertWave2(notes, X, Y, scrollbpm, intensity, periods);
                    break;
                case 22:
                    System.out.println("------------\nHow intense should the wave be? 1.00 = 25 pixels");
                    intensity = sc.nextFloat();

                    System.out.println("------------\nHow many periods do you want?");
                    periods = sc.nextInt();

                    out = Mods.doubleWave2(notes, X, Y, scrollbpm, intensity, periods);
                    break;
                case 23:
                    out = Mods.newFlashlight(notes, X, Y, scrollbpm);
                    break;
                case 24:
                    out = Mods.reverse2(notes, X, Y, scrollbpm);
                    break;
                default:
                    System.out.println("Wrong choice.");
            }

            /* Then, after the deletion is finished, there's almost no chance
             the notes from the original map will end up in the compilation.
             So, the user must key in his desired spot for the first note.
             */
 /* And then, the file is outputted.*/
            this.createFile(out);
        }
    }
}
