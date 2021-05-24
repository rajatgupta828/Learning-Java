package com.rajat.Generics;

import com.sun.xml.internal.rngom.parse.host.Base;

public class Runner {

    public static void main(String[] args) {
        BaseballPlayer jordan = new BaseballPlayer("Michael Jordan");
        BaseballPlayer robinson = new BaseballPlayer("Mitchell Robinson");

        CricketPlayer sachin = new CricketPlayer("Sachin Tendulkar");
        CricketPlayer kohli = new CricketPlayer("Virat Kohli");

        CricketPlayer akram = new CricketPlayer("Wasim Akram");
        CricketPlayer akhtar = new CricketPlayer("Shoaib Akhtar");

        HockeyPlayer chand = new HockeyPlayer("Dhyan Chand");
        HockeyPlayer singh = new HockeyPlayer("Manpreet Singh");

        Team<BaseballPlayer> knicks = new Team<>("Knicks");

        knicks.addPlayer(jordan);
        knicks.addPlayer(robinson);

        Team<CricketPlayer> india = new Team<>("India");

        india.addPlayer(sachin);
        india.addPlayer(kohli);

        Team<CricketPlayer> pak = new Team<>("Pakistan");

        pak.addPlayer(akhtar);
        pak.addPlayer(akram);

        Team<HockeyPlayer> indiaHockey = new Team<>("India");
        indiaHockey.addPlayer(chand);
        indiaHockey.addPlayer(singh);

        Team<HockeyPlayer> pakHockey = new Team<>("Pakistan");
        pakHockey.addPlayer(chand);
        pakHockey.addPlayer(singh);

        System.out.println("Number of players in knicks : " + knicks.getNumberOfPlayers());

        india.matchResult(pak,1,0);
        pak.matchResult(india,0,15);

        System.out.println("Matches won my India : " + india.getWon() + " Matches Lost by India : " + india.getLose()
         + " Number of Players : " + india.getNumberOfPlayers() + " Matches Tied by India : " + india.getTied()
        + " In total number of matches : " + india.getPlayed());

        System.out.println("Matches won my Pakistan : " + pak.getWon() + " Matches Lost by Pakistan : " + pak.getLose()
         + " Number of Players : " + pak.getNumberOfPlayers() + " Matches Tied by Pakistan : " + pak.getTied()
        + " In total number of matches : " + pak.getPlayed());

        indiaHockey.setWon(18);

        india.ranking();
        pak.ranking();

        indiaHockey.setWon(98);
        pakHockey.setWon(12);

        indiaHockey.ranking();
        pakHockey.ranking();

        int compareCicket = pak.compareTo(india);
        System.out.println("India is ahead of Pakistan by " + compareCicket);

        int compareHockey = pakHockey.compareTo(indiaHockey);
        System.out.println("India Hockey is ahead of Pakistan by " +  compareHockey);
    }
}
