public class ProxyImage implements Image{

    RealImage image;
    String fileName;
    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void draw() {
        if(image == null){
            image = new RealImage(fileName);
        }
        image.draw();
    }
}
