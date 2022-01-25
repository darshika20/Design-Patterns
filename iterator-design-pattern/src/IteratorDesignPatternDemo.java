public class IteratorDesignPatternDemo {

    public static void main(String[] args) {
        NamesRepository namesRepository = new NamesRepository();
        for(Iterator iterator = namesRepository.getIterator();iterator.hasNext();){
            System.out.println("Name : " + iterator.next());
        }
    }
}
