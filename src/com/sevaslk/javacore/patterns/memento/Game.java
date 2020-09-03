package com.sevaslk.javacore.patterns.memento;

class Game {
    private String level;
    private int ms;

    public void set(String level, int ms) {
        this.level = level;
        this.ms = ms;
    }

    void load(Save save) {
        level = save.getLevel();
        ms = save.getMs();
    }

    Save save() {
        return new Save(level, ms);
    }

    @Override
    public String toString() {
        return "Game{" +
                "level='" + level + '\'' +
                ", ms=" + ms +
                '}';
    }
}

class Save {
    private final String level;
    private final int ms;

    Save(String level, int ms) {
        this.level = level;
        this.ms = ms;
    }

    String getLevel() {
        return level;
    }

    public int getMs() {
        return ms;
    }
}

class File {
    private Save save;

    Save getSave() {
        return save;
    }

    void setSave(Save save) {
        this.save = save;
    }
}