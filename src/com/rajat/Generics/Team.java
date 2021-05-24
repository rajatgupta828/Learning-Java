package com.rajat.Generics;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {

    private String name;
    private int played;
    private int won;
    private int lose;
    private int tied;

    private ArrayList<T> member = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayed() {
        return played;
    }

    public void setPlayed(int played) {
        this.played = played;
    }

    public int getWon() {
        return won;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getTied() {
        return tied;
    }

    public void setTied(int tied) {
        this.tied = tied;
    }

    public ArrayList<T> getMember() {
        return member;
    }

    public void setMember(ArrayList<T> member) {
        this.member = member;
    }

    public boolean addPlayer(T player){
        if(member.contains(player)){
            System.out.println("Player already on team...");
            return false;
        }else{
            this.member.add(player);
            System.out.println("Player " + player.getName() + " added to team : " + this.getName());
            return true;
        }
    }

    public int getNumberOfPlayers(){
        return this.member.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        this.played = this.played;
        if(ourScore > theirScore){
            won++;
        }else if(theirScore > ourScore){
            lose++;
        }else{
            tied++;
        }
        if(opponent != null){
            opponent.matchResult(null,theirScore,ourScore);
        }
    }

    public int ranking(){
        return (won*2) + 2;
    }

    @Override
    public int compareTo(Team<T> teamName) {
        if (this.ranking() > teamName.ranking()){
            return -1;
        }else if(teamName.ranking() > this.ranking()){
            return teamName.ranking() - this.ranking();
        }else{
            return 0;
        }
    }
}
