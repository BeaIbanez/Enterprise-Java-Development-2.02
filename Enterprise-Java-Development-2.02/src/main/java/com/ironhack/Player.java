package com.ironhack;


    public class Player {
        private int health;
        private int experience;
        private int level;
        private String name;

        private int lives;

        public static void oneLiveLessAndRefillHealth(Player p){
            p.setLives(p.getLives()-1);
            p.setHealth(100);
        }

        public static void attack(Player attacker, Player defender){
            defender.setHealth(defender.getHealth()-attacker.health);
        }

        public Player() {
        }

        public Player(int health, int experience, int level, String name) {
            setHealth(health);
            setExperience(experience);
            setLevel(level);
            setName(name);
        }

        public Player(int health, int experience, int level, String name, int lives) {
            this.health = health;
            this.experience = experience;
            this.level = level;
            this.name = name;
            this.lives = lives;
        }

        public int getLives() {
            return lives;
        }

        public void setLives(int lives) {
            this.lives = lives;
        }

        public int getHealth() {
            return health;
        }

        public void setHealth(int health) {
            this.health = health;
        }

        public int getExperience() {
            return experience;
        }

        public void setExperience(int experience) {
            this.experience = experience;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void sayHi(){
            System.out.println("Hi there you fighter, this is the generic message for us the players");
        }

    }


