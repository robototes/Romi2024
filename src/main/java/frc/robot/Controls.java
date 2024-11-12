package frc.robot;

import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import static frc.robot.Subsystems.DRIVEBASE_ENABLED;

public class Controls {
    private final CommandXboxController driverController;
    // Normally, more descriptive names are better, but in this case, we care
    // about making the subsystem access easy. If you want to, though, you could
    // grab all of the subsystems from inside s.
    private final Subsystems s;

    public Controls(Subsystems subsystems) {
        driverController = new CommandXboxController(0);
        this.s = subsystems;

        if (DRIVEBASE_ENABLED) {
            bindDrivebaseControls();
        }
    }

    private void bindDrivebaseControls() {
        // TODO 2: Add a default command to drivebase that drives the Romi
    }
}
