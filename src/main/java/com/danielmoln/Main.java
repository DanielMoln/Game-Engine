package com.danielmoln;

import com.danielmoln.window.DisplayManager;
import org.lwjgl.opengl.Display;

public class Main {
    // @ MD Solutions
    public static void main(String[] args)
    {
        DisplayManager.createDisplay();

        while (!Display.isCloseRequested())
        {
            // game logic
            // render
            DisplayManager.updateDisplay();
        }

        DisplayManager.closeDisplay();
    }
}