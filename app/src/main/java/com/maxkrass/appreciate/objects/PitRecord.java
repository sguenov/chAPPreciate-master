package com.maxkrass.appreciate.objects;


import com.orm.SugarRecord;

/**
 * Created by Sarah, Calyx, and Tim... and Max on 12/8/15.
 */
public class PitRecord extends SugarRecord implements Comparable{
    int maxSpeed;
    String teamNumber;
    String teamName;
    String mainComment;
    String teleComment;
    String autoComment;
    String abilitiesComment;

    boolean wideTeleCBW;
    boolean autoZoneAutoCBW;
    boolean flexibleAutoCBW;
    boolean containersAbilityCBW;
    boolean containersAutoCBW;
    boolean coopAbilityCBW;
    boolean humanPlayerTeleCBW;
    boolean landfillTeleCBW;
    boolean noodlesAbilityCBW;
    boolean narrowTeleCBW;
    boolean shiftingAbilityCBW;
    boolean stepTeleCBW;
    boolean totesAbilityCBW;
    boolean totesAutoCBW;



    int cimNumSpinner;
    int driveSpinner;
    int highestPossibleStackSpinner;
    int wheelNumSpinner;
    int wheelTypeSpinner;

    public PitRecord() {
    }

    public PitRecord(int maxSpeed, String teamNumber, String teamName, String mainComment, String teleComment, String autoComment, String abilitiesComment, boolean wideTeleCBW, boolean autoZoneAutoCBW, boolean flexibleAutoCBW, boolean containersAbilityCBW, boolean containersAutoCBW, boolean coopAbilityCBW, boolean humanPlayerTeleCBW, boolean landfillTeleCBW, boolean noodlesAbilityCBW, boolean narrowTeleCBW, boolean shiftingAbilityCBW, boolean stepTeleCBW, boolean totesAbilityCBW, boolean totesAutoCBW, int cimNumSpinner, int driveSpinner, int highestPossibleStackSpinner, int wheelNumSpinner, int wheelTypeSpinner) {
        this.maxSpeed = maxSpeed;
        this.teamNumber = teamNumber;
        this.teamName = teamName;
        this.mainComment = mainComment;
        this.teleComment = teleComment;
        this.autoComment = autoComment;
        this.abilitiesComment = abilitiesComment;
        this.wideTeleCBW = wideTeleCBW;
        this.autoZoneAutoCBW = autoZoneAutoCBW;
        this.flexibleAutoCBW = flexibleAutoCBW;
        this.containersAbilityCBW = containersAbilityCBW;
        this.containersAutoCBW = containersAutoCBW;
        this.coopAbilityCBW = coopAbilityCBW;
        this.humanPlayerTeleCBW = humanPlayerTeleCBW;
        this.landfillTeleCBW = landfillTeleCBW;
        this.noodlesAbilityCBW = noodlesAbilityCBW;
        this.narrowTeleCBW = narrowTeleCBW;
        this.shiftingAbilityCBW = shiftingAbilityCBW;
        this.stepTeleCBW = stepTeleCBW;
        this.totesAbilityCBW = totesAbilityCBW;
        this.totesAutoCBW = totesAutoCBW;
        this.cimNumSpinner = cimNumSpinner;
        this.driveSpinner = driveSpinner;
        this.highestPossibleStackSpinner = highestPossibleStackSpinner;
        this.wheelNumSpinner = wheelNumSpinner;
        this.wheelTypeSpinner = wheelTypeSpinner;
    }

    public int getMaxSpeed() {

        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getTeamNumber() {
        return teamNumber;
    }

    public void setTeamNumber(String teamNumber) {
        this.teamNumber = teamNumber;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getMainComment() {
        return mainComment;
    }

    public void setMainComment(String mainComment) {
        this.mainComment = mainComment;
    }

    public String getTeleComment() {
        return teleComment;
    }

    public void setTeleComment(String teleComment) {
        this.teleComment = teleComment;
    }

    public String getAutoComment() {
        return autoComment;
    }

    public void setAutoComment(String autoComment) {
        this.autoComment = autoComment;
    }

    public String getAbilitiesComment() {
        return abilitiesComment;
    }

    public void setAbilitiesComment(String abilitiesComment) {
        this.abilitiesComment = abilitiesComment;
    }

    public boolean isWideTeleCBW() {
        return wideTeleCBW;
    }

    public void setWideTeleCBW(boolean wideTeleCBW) {
        this.wideTeleCBW = wideTeleCBW;
    }

    public boolean isAutoZoneAutoCBW() {
        return autoZoneAutoCBW;
    }

    public void setAutoZoneAutoCBW(boolean autoZoneAutoCBW) {
        this.autoZoneAutoCBW = autoZoneAutoCBW;
    }

    public boolean isFlexibleAutoCBW() {
        return flexibleAutoCBW;
    }

    public void setFlexibleAutoCBW(boolean flexibleAutoCBW) {
        this.flexibleAutoCBW = flexibleAutoCBW;
    }

    public boolean isContainersAbilityCBW() {
        return containersAbilityCBW;
    }

    public void setContainersAbilityCBW(boolean containersAbilityCBW) {
        this.containersAbilityCBW = containersAbilityCBW;
    }

    public boolean isContainersAutoCBW() {
        return containersAutoCBW;
    }

    public void setContainersAutoCBW(boolean containersAutoCBW) {
        this.containersAutoCBW = containersAutoCBW;
    }

    public boolean isCoopAbilityCBW() {
        return coopAbilityCBW;
    }

    public void setCoopAbilityCBW(boolean coopAbilityCBW) {
        this.coopAbilityCBW = coopAbilityCBW;
    }

    public boolean isHumanPlayerTeleCBW() {
        return humanPlayerTeleCBW;
    }

    public void setHumanPlayerTeleCBW(boolean humanPlayerTeleCBW) {
        this.humanPlayerTeleCBW = humanPlayerTeleCBW;
    }

    public boolean isLandfillTeleCBW() {
        return landfillTeleCBW;
    }

    public void setLandfillTeleCBW(boolean landfillTeleCBW) {
        this.landfillTeleCBW = landfillTeleCBW;
    }

    public boolean isNoodlesAbilityCBW() {
        return noodlesAbilityCBW;
    }

    public void setNoodlesAbilityCBW(boolean noodlesAbilityCBW) {
        this.noodlesAbilityCBW = noodlesAbilityCBW;
    }

    public boolean isNarrowTeleCBW() {
        return narrowTeleCBW;
    }

    public void setNarrowTeleCBW(boolean narrowTeleCBW) {
        this.narrowTeleCBW = narrowTeleCBW;
    }

    public boolean isShiftingAbilityCBW() {
        return shiftingAbilityCBW;
    }

    public void setShiftingAbilityCBW(boolean shiftingAbilityCBW) {
        this.shiftingAbilityCBW = shiftingAbilityCBW;
    }

    public boolean isStepTeleCBW() {
        return stepTeleCBW;
    }

    public void setStepTeleCBW(boolean stepTeleCBW) {
        this.stepTeleCBW = stepTeleCBW;
    }

    public boolean isTotesAbilityCBW() {
        return totesAbilityCBW;
    }

    public void setTotesAbilityCBW(boolean totesAbilityCBW) {
        this.totesAbilityCBW = totesAbilityCBW;
    }

    public boolean isTotesAutoCBW() {
        return totesAutoCBW;
    }

    public void setTotesAutoCBW(boolean totesAutoCBW) {
        this.totesAutoCBW = totesAutoCBW;
    }

    public int getCimNumSpinner() {
        return cimNumSpinner;
    }

    public void setCimNumSpinner(int cimNumSpinner) {
        this.cimNumSpinner = cimNumSpinner;
    }

    public int getDriveSpinner() {
        return driveSpinner;
    }

    public void setDriveSpinner(int driveSpinner) {
        this.driveSpinner = driveSpinner;
    }

    public int getHighestPossibleStackSpinner() {
        return highestPossibleStackSpinner;
    }

    public void setHighestPossibleStackSpinner(int highestPossibleStackSpinner) {
        this.highestPossibleStackSpinner = highestPossibleStackSpinner;
    }

    public int getWheelNumSpinner() {
        return wheelNumSpinner;
    }

    public void setWheelNumSpinner(int wheelNumSpinner) {
        this.wheelNumSpinner = wheelNumSpinner;
    }

    public int getWheelTypeSpinner() {
        return wheelTypeSpinner;
    }

    public void setWheelTypeSpinner(int wheelTypeSpinner) {
        this.wheelTypeSpinner = wheelTypeSpinner;
    }


    @Override
    public int compareTo(Object another) {
        return this.getId().compareTo(((PitRecord)another).getId());
    }
}
