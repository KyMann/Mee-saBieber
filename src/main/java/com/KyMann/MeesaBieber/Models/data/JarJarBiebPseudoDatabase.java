package com.KyMann.MeesaBieber.Models.data;

import com.KyMann.MeesaBieber.Models.JarJarBieberTweet;

import java.util.ArrayList;

/**
 * Created by KyleLaptop on 12/15/2017.
 */
public class JarJarBiebPseudoDatabase {

    private static ArrayList<JarJarBieberTweet> JarData = new ArrayList<>();
    private static JarJarBiebPseudoDatabase instance;


    public static JarJarBiebPseudoDatabase getInstance() {
        if (instance == null) {
            instance = new JarJarBiebPseudoDatabase();
        }
        return instance;
    }

    public void save(JarJarBieberTweet aTweet) {
        JarData.add(aTweet);
    }

    public void delete(JarJarBieberTweet aTweet) {
        for (JarJarBieberTweet tweet : JarData) {
            if (tweet.equals(aTweet)) {
                JarData.remove(tweet);
            }
        }
    }

    public void delete(int tweetId) {
        for (JarJarBieberTweet tweet : JarData) {
            if (tweet.getId() == tweetId) {
                JarData.remove(tweet);
            }
        }
    }

    public ArrayList<JarJarBieberTweet> findAll() {
        return JarData;
    }
}
