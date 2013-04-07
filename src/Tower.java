import java.awt.Dimension;
import util.Location;
import util.Pixmap;
import util.Sprite;


public abstract class Tower extends Sprite {
    private Tile myTile;
    
    public Tower (Pixmap image, Location center, Dimension size,
                  Tile tile) {
        super(image, center, size);
        myTile = tile;
    }
    
    public void update(double elapsedTime) {
        
    }

}
