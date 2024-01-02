import Compressor.JpegCompressor;
import Compressor.PngCompressor;
import filter.BlackAndWhiteFilter;
import filter.HighContrastFilter;

public class ImageStorage {

    PngCompressor pngCompressor = new PngCompressor();
    JpegCompressor jpegCompressor = new JpegCompressor();
    BlackAndWhiteFilter blackAndWhiteFilter = new BlackAndWhiteFilter();
    HighContrastFilter highContrastFilter = new HighContrastFilter();

    public void store(){
        System.out.println("Image save");
    }

}
