package com.springframework.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorisJokeService implements JokeService{

    @Override
    public String getJoke(){
        ChuckNorrisQuotes cnq = new ChuckNorrisQuotes();
        return cnq.getRandomQuote();
    }
}
