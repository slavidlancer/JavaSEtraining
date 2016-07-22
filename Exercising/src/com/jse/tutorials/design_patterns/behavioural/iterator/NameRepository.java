package com.jse.tutorials.design_patterns.behavioural.iterator;

public class NameRepository implements Container {
    private String[] names = {"name1", "name2", "name3", "name4"};
    
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }
    
    private class NameIterator implements Iterator {
        int index;
        
        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            
            return null;
        }
    }
}
