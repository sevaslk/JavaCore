package com.sevaslk.javacore.patterns.command;

interface Command {
    void execute();
}

class Computer {
    void start() {
        System.out.println("Start");
    }

    void stop() {
        System.out.println("Stop");
    }

    void reset() {
        System.out.println("Reset");
    }
}

class StartCommand implements Command {
    private Computer computer;

    StartCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.start();
    }
}

class StopCommand implements Command {
    private Computer computer;

    StopCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.stop();
    }
}

class ResetCommand implements Command {
    private Computer computer;

    ResetCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.reset();
    }
}

class User {
    private Command start;
    private Command stop;
    private Command reset;

    User(Command start, Command stop, Command reset) {
        this.start = start;
        this.stop = stop;
        this.reset = reset;
    }

    void startComputer() {
        start.execute();
    }

    void stopComputer() {
        stop.execute();
    }

    void resetComputer() {
        reset.execute();
    }
}