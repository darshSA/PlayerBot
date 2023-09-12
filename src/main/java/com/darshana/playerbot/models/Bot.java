package com.darshana.playerbot.models;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "playerId")
public class Bot extends Player{
    private int botRank;
}
