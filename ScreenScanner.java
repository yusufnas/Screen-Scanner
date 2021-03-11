/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example;

import processing.core.PApplet;

public class ScreenScanner extends PApplet {

    public static void main(String[] args) {
        PApplet.main(new String[]{"Example.ScreenScanner"});
    }

    @Override
    public void settings() {
        size(640, 480);
    }

    float a;
    float b;

    @Override
    public void setup() {
        a = width;
        b = 0;
    }

    @Override
    public void draw() {
        b += 0.5;
        background(b);
        //stroke(255, 0, 0);
        //line(width / 2, 0, width / 2, height);
        stroke(0, 255, 5);
        line(a, 0, a, height);

        a -= 5;
        if (a < 0) {
            a = width;
        }
        if (b == 255) {
            exit();
        }

    }
}
