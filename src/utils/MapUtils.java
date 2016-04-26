/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gezochan
 */
public class MapUtils {

    protected File newChart;
    protected File f;
    protected String filePath;
    protected File folder;
    protected boolean isNewFile;
    protected CopyOnWriteArrayList<Note> notes;
    protected int startTime;
    protected int endTime;
    protected int copyMarker;
    protected String contents;

    /**
     * Method that makes the list of all the notes.
     */
    protected void listNotes() {
        try {

            /* These objects are here to read the file from "osu blabla" to the
             last note recoded on the file. Basically, it will read the whole
             file, "ignoring" everything before [HitObjects], which is the
             most important thing.
             */
            InputStream i = new FileInputStream(filePath);
            InputStreamReader r = new InputStreamReader(i);
            BufferedReader br = new BufferedReader(r);
            /* String that will be the line to read */
            String l;

            /* While the line read isn't [HitObjects], do nothing at all.
             However, to make sure the user knows what he's copying, the map
             details is displayed, and gets confirmed or not.
             */
            while (!(l = br.readLine()).equalsIgnoreCase("[HitObjects]")) {
                if (l.startsWith("TitleUnicode:")
                        || l.startsWith("Version:")
                        || l.startsWith("Creator:")) {
                    System.out.println(l);
                }
            }

            /* Then, at that point, we read every line since now every line is
             a note, and create a note off the line. Yeah the new Note(blah) is
             long.
             */
            while ((l = br.readLine()) != null) {
                String[] values = l.split(",");
                String params = "";
                for (int index = 5; index < values.length; index++) {
                    if (index < values.length - 1) {
                        params += values[index] + ",";
                    } else {
                        params += values[index];
                    }
                }
                notes.add(new Note(
                        Integer.parseInt(values[0]),
                        Integer.parseInt(values[1]),
                        Long.parseLong(values[2]),
                        Integer.parseInt(values[3]),
                        Integer.parseInt(values[4]),
                        params)
                );
            }

        } catch (IOException | NumberFormatException e) {
            System.err.println(e.toString());
        }
    }

    /**
     * Method that copies the content of the map.
     */
    protected void copyMap() {
        try {
            /* These objects are here to read the file from "osu blabla" to the
             last note recoded on the file. Basically, it will read the whole
             file, "ignoring" everything before [HitObjects], which is the
             most important thing.
             */
            InputStream i = new FileInputStream(filePath);
            InputStreamReader r = new InputStreamReader(i);
            BufferedReader br = new BufferedReader(r);
            /* String that will be the line to read */
            String l;
            contents = "";

            /* While the line read isn't [HitObjects], do nothing at all.
             However, to make sure the user knows what he's copying, the map
             details is displayed, and gets confirmed or not.
             */
            while (!(l = br.readLine()).equalsIgnoreCase("[HitObjects]")) {
                contents += l + "\n";
            }

            /* Then, at that point, we read every line since now every line is
             a note, and create a note off the line. Yeah the new Note(blah) is
             long.
             */
            while ((l = br.readLine()) != null) {
                String[] values = l.split(",");
                String params = "";
                for (int index = 5; index < values.length; index++) {
                    if (index < values.length - 1) {
                        params += values[index] + ",";
                    } else {
                        params += values[index];
                    }
                }
                notes.add(new Note(
                        Integer.parseInt(values[0]),
                        Integer.parseInt(values[1]),
                        Long.parseLong(values[2]),
                        Integer.parseInt(values[3]),
                        Integer.parseInt(values[4]),
                        params)
                );
            }

        } catch (IOException | NumberFormatException e) {
            System.err.println(e.toString());
        }
    }

    /**
     * Creates a new file.
     */
    protected void createFile() {

        /* Difference so the notes are ACTUALLY moved */
        int difference = copyMarker - startTime;

        try {
            /* These objects are here to write the file to "Notes.osu" from
             the first to last note in the ArrayList.            
             */
            FileWriter fw = new FileWriter(newChart, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            /* For each note in the list, append it to the file.
             Output the addition of the note to the console because why not?
             */
            if (this.isNewFile) {

                if (contents == null || contents.isEmpty()) {
                    pw.append("// Copy-paste the section below to your .osu file.");
                    bw.newLine();
                } else {
                    String[] newContents = contents.split("\n");
                    for (String s : newContents) {
                        if (s.startsWith("Version:")) {
                            s = s.concat("_DESSERT");
                        }
                        pw.append(s);
                        bw.newLine();
                    }
                    bw.newLine();
                }
                pw.append("[HitObjects]");
                bw.newLine();
            }
            for (Note n : notes) {
                n.move(difference);
                pw.append(n.outputOsuFile());
                bw.newLine();
                System.out.println("Note (" + n.toString() + ") \t-------- Added to " + newChart.getName());
            }

            /* Close the file (better....) */
            pw.close();

            /* something */
            System.out.println("Notes added to " + newChart.getName() + ".");

        } catch (IOException ex) {
            Logger.getLogger(MapUtils.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    protected void createFile(String out) {

        try {
            /* These objects are here to write the file to "Notes.osu" from
             the first to last note in the ArrayList.            
             */
            FileWriter fw = new FileWriter(newChart, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            /* For each note in the list, append it to the file.
             Output the addition of the note to the console because why not?
             */
            /* Close the file (better....) */
            pw.append(out);
            bw.newLine();
            pw.close();

            /* something */
            System.out.println("Notes added to " + newChart.getName() + ".");

        } catch (IOException ex) {
            Logger.getLogger(MapUtils.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    protected void getPathMap(File file) {
        f = file;
        System.out.println("Name of the map to scan: " + f.getName());
        filePath = f.getAbsolutePath();
    }

    protected void readMap(File file) {
        try {

            this.getPathMap(file);
            /* These objects are here to read the file from "osu blabla" to the
             last note recoded on the file. Basically, it will read the whole
             file, "ignoring" everything before [HitObjects], which is the
             most important thing.
             */
            InputStream i = new FileInputStream(filePath);
            InputStreamReader r = new InputStreamReader(i);
            BufferedReader br = new BufferedReader(r);
            /* String that will be the line to read */
            String l;
            contents = "";
            while ((l = br.readLine()) != null) {
                contents += l + "\n";
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println(e.toString());
        }
    }

    /**
     * Deletes unnecessary notes from the notechart.
     */
    protected void deleteNotes() {
        /* For each note that isn't in the range, delete it. */
        notes.stream().filter((n) -> (n.getMillis() < startTime || n.getMillis() > endTime)).forEach((n) -> {
            notes.remove(n);
        });
    }

    /**
     * Processes a map file.
     *
     * @param file
     * @param sc
     */
    protected void extractNotes(File file, Scanner sc) {
        /* Tells you what's the map to scan. filePath is a String that's usedfor
         listNotes.
         */
        this.getPathMap(file);

        /* Asks the user if they want to process a file. Sometimes they may be
         clumsy and put a file without knowing. */
        System.out.println("Do you want to scan this file? (y/n) ");
        if (sc.next().equals("y")) {

            /* Where to extract notes. Useful for deleteNotes(). */
            System.out.println("Enter the beginning of the section to extract (ms)");
            startTime = sc.nextInt();
            System.out.println("Enter the end of the section to extract (ms)");
            endTime = sc.nextInt();

            /* Lists notes in the whole osu! chart, then deletes them to keep only
             the interesting section the user keyed in.
             */
            this.listNotes();
            System.out.println("List created. Deletion of unnecessary notes...");
            this.deleteNotes();

            /* Then, after the deletion is finished, there's almost no chance
             the notes from the original map will end up in the compilation.
             So, the user must key in his desired spot for the first note.
             */
            System.out.println("Deletion complete. Where do you want to put the notes?");
            copyMarker = sc.nextInt();

            /* And then, the file is outputted.*/
            this.createFile();
        }
    }

    /**
     * Scans the whole map
     *
     * @param file
     * @param sc
     */
    protected void scanMap(File file, Scanner sc) {
        f = file;

        /* Tells you what's the map to scan. filePath is a String that's usedfor
         listNotes.
         */
        System.out.println("Name of the map to scan: " + f.getName());
        filePath = f.getAbsolutePath();

        /* Asks the user if they want to process a file. Sometimes they may be
         clumsy and put a file without knowing. */
        System.out.println("Do you want to scan this file? (y/n) ");
        if (sc.next().equals("y")) {

            startTime = 0;
            endTime = Integer.MAX_VALUE;
            copyMarker = 0;

            /* Lists notes in the whole osu! chart, then deletes them to keep only
             the interesting section the user keyed in.
             */
            this.listNotes();
            /* And then, the file is outputted.*/
            this.createFile();
        }
    }
}
