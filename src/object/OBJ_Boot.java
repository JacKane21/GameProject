package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Boot extends SuperObject{

        public OBJ_Boot() {

            name = "boot";
            try {
                image = ImageIO.read(getClass().getResourceAsStream("/objects/boot.png"));

            }catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

