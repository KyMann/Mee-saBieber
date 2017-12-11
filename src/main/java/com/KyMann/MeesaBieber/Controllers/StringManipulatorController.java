package com.KyMann.MeesaBieber.Controllers;

import com.KyMann.MeesaBieber.JarJarDict;
import com.KyMann.MeesaBieber.Models.JarJarBieberTweet;

import java.util.HashMap;

/**
 * Created by Kyle on 6/15/2017.
 */
public class StringManipulatorController {
//this holds the logic for the word by word translation
    //should be called by methodname?

    public JarJarBieberTweet translateTweet(String bieberTweet) {
        //should be called by method
        String JarBiebTweet = "";
        int changeCount = 0;
        HashMap<String, String> forwardsTranslationDictionary = JarJarDict.buildForwardsHashMap();
        for (String word : bieberTweet.split(" ")) { //TODO: parser on things other than space, remove punctuation
            //TODO: make sure tweets retain length
            //TODO: add natural language process?
            if (forwardsTranslationDictionary.containsKey(word)) {
                JarBiebTweet = JarBiebTweet + " " + forwardsTranslationDictionary.get(word);
                changeCount++;
            }
            else {
                JarBiebTweet = JarBiebTweet + " " + word;
            }
        }

        return new JarJarBieberTweet(JarBiebTweet, changeCount);
    }
}