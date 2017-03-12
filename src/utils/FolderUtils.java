/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author Gezochan
 */
public interface FolderUtils {

    public static CopyOnWriteArrayList<File> listFiles(final File folder) {
        CopyOnWriteArrayList<File> files = new CopyOnWriteArrayList<>();
        if (folder.isDirectory()) {
            for (final File file : folder.listFiles()) {
                if (file.getName().endsWith(".osu")) {
                    files.add(file);
                }
            }
        }
        return files;
    }

    /**
     *
     * @param folder
     * @return boolean
     */
    public static boolean checkForFolder(File folder) {
        if (!folder.exists()) {
            folder.mkdir();
            return true;
        }
        return false;
    }
    
    public static boolean checkForFile(File file){
        if(!file.exists()){
            try{
                file.createNewFile();
                return true;
            }catch(Exception e){
                System.out.println(e.getMessage());
            } 
        }
        return false;
    }
}
