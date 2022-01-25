public class NamesRepository implements Container{
    private String[] names = {"Robert", "Julia", "John", "Elena"};
    private Iterator namesIterator = new NamesIterator();
    @Override
    public Iterator getIterator() {
        return namesIterator;
    }

    class NamesIterator implements Iterator {
        int index;
        @Override
        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
