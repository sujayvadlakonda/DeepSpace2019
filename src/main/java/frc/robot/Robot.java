package frc.robot;
/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/


import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.subsystems.*;
import frc.robot.OI;
import edu.wpi.first.cameraserver.CameraServer;


// If you rename or move this class, update the build.properties file in the project root
public class Robot extends TimedRobot
{
    public static OI oi;
    public static DriveBase driveBase;
    public static CompressSystem compressSystem;

    @Override
    public void robotInit() 
    {
        driveBase = new DriveBase();
        compressSystem = new CompressSystem();
        CameraServer.getInstance().startAutomaticCapture();
        oi = new OI();          //make sure this is initialized after subsystem initialization, Sujay
    }


    @Override
    public void disabledInit() 
    {
        
    }

    @Override
    public void disabledPeriodic() 
    {
        Scheduler.getInstance().run();
    }


    @Override
    public void autonomousInit() 
    {

    }


    @Override
    public void autonomousPeriodic() 
    {
        Scheduler.getInstance().run();
    }

    @Override
    public void teleopInit() 
    {

    }


    @Override
    public void teleopPeriodic() 
    {
        Scheduler.getInstance().run();
    }


    @Override
    public void testPeriodic() 
    {
        
    }
}