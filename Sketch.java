import processing.core.PApplet;
import java.util.Random;

public class Sketch extends PApplet {

    /**
    * Randomly Located House Dynamic Drawing
    * @author: Rachael Chan
    */

    int intRandomX;
    int intRandomY;

    public void settings() {
        size(400, 400);
    }

    public void setup() {

        background(210, 255, 173);

        // Create Random Object
        Random myRandom = new Random();

        // Generate Random Int Numbers for House Location
        intRandomX = myRandom.nextInt((100 - (-100)) + 1) - 100;
        intRandomY = myRandom.nextInt((100 - (-100)) + 1) - 100;
    }

    public void draw() {

        // Change Colour of Background Based on Location
        if((intRandomX >= 0) && (intRandomY >= 0)){
            background(3, 17, 140);
        }else if((intRandomX < 0) && (intRandomY < 0)){
            background(84, 4, 51);
        }else if((intRandomX < 0) || (intRandomY < 0)){
            background(83, 30, 130);
        }

        // Create House
        // Triangle Roof
        if((intRandomX >= 0) && (intRandomY >= 0)){
            fill(115, 171, 71);
        }else if((intRandomX < 0) && (intRandomY < 0)){
            fill(147, 70, 200);
        }else if((intRandomX < 0) || (intRandomY < 0)){
            fill(255, 0, 0);
        }
        triangle((float) width / 400 * 129 + intRandomX, (float) height / 400 * 107 + intRandomY, (float) width / 400 * 65 + intRandomX, (float) height / 400 * 187 + intRandomY, (float) width / 400 * 173 + intRandomX, (float) height / 400 * 187 + intRandomY);

        // Side Roof
        if((intRandomX >= 0) && (intRandomY >= 0)){
            fill(75, 131, 31);
        }else if((intRandomX < 0) && (intRandomY < 0)){
            fill(107, 30, 160);
        }else if((intRandomX < 0) || (intRandomY < 0)){
            fill(150, 0, 0);
        }
        quad((float) width / 400 * 129 + intRandomX, (float) height / 400 * 107 + intRandomY, (float) width / 400 * 173 + intRandomX, (float) height / 400 * 187 + intRandomY, (float) width / 400 * 306 + intRandomX, (float) height / 400 * 172 + intRandomY, (float) width / 400 * 265 + intRandomX, (float) height / 400 * 98 + intRandomY);

        // Right Wall
        if((intRandomX >= 0) && (intRandomY >= 0)){
            fill(130, 97, 8);
        }else if((intRandomX < 0) && (intRandomY < 0)){
            fill(41, 121, 62);
        }else if((intRandomX < 0) || (intRandomY < 0)){
            fill(125, 190, 200);
        }
        quad((float) width / 400 * 173 + intRandomX, (float) height / 400 * 187 + intRandomY, (float) width / 400 * 173 + intRandomX, (float) height / 400 * 285 + intRandomY, (float) width / 400 * 306 + intRandomX, (float) height / 400 * 260 + intRandomY, (float) width / 400 * 306 + intRandomX, (float) height / 400 * 172 + intRandomY);

        // Left Wall
        if((intRandomX >= 0) && (intRandomY >= 0)){
            fill(189, 147, 58);
        }else if((intRandomX < 0) && (intRandomY < 0)){
            fill(91, 171, 112);
        }else if((intRandomX < 0) || (intRandomY < 0)){
            fill(175, 240, 250);
        }
        quad((float) width / 400 * 65 + intRandomX, (float) height / 400 * 187 + intRandomY, (float) width / 400 * 173 + intRandomX, (float) height / 400 * 187 + intRandomY, (float) width / 400 * 173 + intRandomX, (float) height / 400 * 285 + intRandomY, (float) width / 400 * 65 + intRandomX, (float) height / 400 * 285 + intRandomY);

        // Door
        fill(89, 37, 12);
        if((intRandomX >= 0) && (intRandomY >= 0)){
            fill(89, 37, 12);
        }else if((intRandomX < 0) && (intRandomY < 0)){
            fill(138, 102, 73);
        }else if((intRandomX < 0) || (intRandomY < 0)){
            fill(62, 27, 74);
        }
        quad((float) width / 400 * 100 + intRandomX, (float) height / 400 * 230 + intRandomY, (float) width / 400 * 130 + intRandomX, (float) height / 400 * 230 + intRandomY, (float) width / 400 * 130 + intRandomX, (float) height / 400 * 285 + intRandomY, (float) width / 400 * 100 + intRandomX, (float) height / 400 * 285 + intRandomY);

        // Show Current Time
        int intSecond = second();
        int intMinute = minute();
        int intHour = hour();

        fill (255, 255, 255);
        text(intHour, 30, 30);
        text(" : " + intMinute, 50, 30);
        text(" : " + intSecond, 80, 30);
       
    }
}
