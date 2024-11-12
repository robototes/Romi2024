package frc.robot;

import frc.robot.subsystems.DrivebaseSubsystem;

public class Subsystems {
    public static final boolean DRIVEBASE_ENABLED = true;

    public final DrivebaseSubsystem drivebaseSubsystem;

    public Subsystems() {
        if (DRIVEBASE_ENABLED) {
            drivebaseSubsystem = new DrivebaseSubsystem();
        } else {
            drivebaseSubsystem = null;
        }
    }
}
