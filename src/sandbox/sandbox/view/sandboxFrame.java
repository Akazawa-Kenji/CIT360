package sandbox.sandbox.view;

import sandbox.controller.sandboxController;

import javax.swing.*;

public class sandboxFrame extends JFrame {
    private sandboxPanel basePanel;
//need to reference to the panel

    public sandboxFrame(sandboxController baseController)
    //creating communication between frame and controller
    {
        basePanel = new sandboxPanel(baseController);

        setupFrame();
    }

    private void setupFrame() {
        this.setContentPane(basePanel);
        this.setSize(500, 500);
//adding the panel to the frame.

    }


}

