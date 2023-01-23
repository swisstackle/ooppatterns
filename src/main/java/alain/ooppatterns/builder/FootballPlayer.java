/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alain.ooppatterns.builder;

/**
 *
 * @author alain
 */
public class FootballPlayer {
    private String name;
    private int strength;
    private int speed;
    private int kickingStrength;
    
    private FootballPlayer (FootballPlayerBuilder builder) {
        this.name = builder.name;
        this.strength = builder.strength;
        this.speed = builder.speed;
        this.kickingStrength = builder.kickingStrength;
    }
    
    public String getName() {
            return this.name;
    }
    
    public static class FootballPlayerBuilder {
        private String name;
        private int strength;
        private int speed;
        private int kickingStrength;
        
        public FootballPlayerBuilder(String name, int strength, int speed) {
            this.name = name;
            this.strength = strength;
            this.speed = speed;
        }
        
        public FootballPlayerBuilder setKickingStrength(int kickingStrength) {
            this.kickingStrength = kickingStrength;
            return this;
        } 
        
        public FootballPlayer build() {
            return new FootballPlayer(this);
        }
    }
}
