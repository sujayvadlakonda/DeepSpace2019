/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class CompressSystem extends Subsystem {

    public Compressor pneumaticCompressor;
    public Solenoid solenoidZero;
    public Solenoid solenoidOne;
    public Solenoid solenoidGear;
    public Solenoid solenoidClapper;

    public CompressSystem() {
        pneumaticCompressor = new Compressor(RobotMap.COMPRESSOR);
        solenoidZero = new Solenoid(RobotMap.SOLENOIDZERO);
        solenoidOne = new Solenoid(RobotMap.SOLENOIDONE);
        solenoidGear = new Solenoid(RobotMap.SOLENOIDGEAR);
        solenoidClapper = new Solenoid(RobotMap.SOLENOIDCLAPPER);
        solenoidZero.set(false);
        solenoidOne.set(true);
    }

    public void CompressOn() {
        pneumaticCompressor.setClosedLoopControl(true);
    }

    private boolean pistonBool = false;

    //Opens and closes the pneumatic piston
    public void SevenInches() {
        pistonBool = !pistonBool;
        if (pistonBool) {
            solenoidZero.set(true);
            solenoidOne.set(false);
        }
        else {
            solenoidZero.set(false);
            solenoidOne.set(true);
        }
    }

    public void HighGearMovement() {
        solenoidGear.set(!solenoidGear.get());
    }

    public void ClapperMovement() {
        solenoidClapper.set(!solenoidClapper.get());
    }

    public void initDefaultCommand() {
        
    }
}
