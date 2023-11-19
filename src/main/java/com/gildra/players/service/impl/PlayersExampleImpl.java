package com.gildra.players.service.impl;

import com.gildra.players.dto.ExampleDto;
import com.gildra.players.model.PlayersExample;
import com.gildra.players.repository.IExampleRepository;
import com.gildra.players.service.IPlayersExample;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@Transactional
public class PlayersExampleImpl implements IPlayersExample {

    @Autowired
    private IExampleRepository exampleRepository;

    @Override
    public ExampleDto findExampleById(Long id) {
        PlayersExample example = exampleRepository.getReferenceById(id);

        return new ExampleDto(example.getId(), example.getName());
    }
} // PlayersExampleImpl
