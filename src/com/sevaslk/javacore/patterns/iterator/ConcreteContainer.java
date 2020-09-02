package com.sevaslk.javacore.patterns.iterator;

interface Iterator {
    boolean hasNext();

    Object next();
}

interface Container {
    Iterator getIterator();
}

class ConcreteContainer implements Container {
    private String[] tasks = {"task1", "task2", "task3", "task4", "task5"};

    @Override
    public Iterator getIterator() {
        return new TaskIterator();
    }


    private class TaskIterator implements Iterator {
        int index = 0;

        @Override
        public boolean hasNext() {
            if (index < tasks.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return tasks[index++];
        }
    }
}
