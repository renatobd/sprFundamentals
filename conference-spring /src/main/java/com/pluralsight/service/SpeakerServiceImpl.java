package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl(){
        System.out.println("Speaker Service no args constructor");
    }

    @Autowired
    public SpeakerServiceImpl(SpeakerRepository speakerRepository){
        System.out.println("Speaker Service Repository constructor");
        repository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImpl setter");
        this.repository = repository;
    }
}
