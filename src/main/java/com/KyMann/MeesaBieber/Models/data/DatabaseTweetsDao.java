package com.KyMann.MeesaBieber.Models.data;

import com.KyMann.MeesaBieber.Models.JarJarBieberTweet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by Kyle on 6/20/2017.
 */

@Repository
@Transactional
public interface DatabaseTweetsDao extends CrudRepository<JarJarBieberTweet, Integer> {
}
