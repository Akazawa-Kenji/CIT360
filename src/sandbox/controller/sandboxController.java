package sandbox.controller;

import sandbox.sandbox.view.sandboxFrame;

public class sandboxController {

    private sandboxFrame appFrame;

    public void start() {

        appFrame = new sandboxFrame(this);
    }
}
