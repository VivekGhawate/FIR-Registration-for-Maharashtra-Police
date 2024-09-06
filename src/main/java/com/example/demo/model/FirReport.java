package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FirReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String district;
    private String policeStation;
    private String act;
    private String firNumber;
    private String dateTime;
    private String generalDiaryRefNumber;
    private String typeOfInformation;
    private String placeOfOccurrence;
    private String complainantName;
    private String dob;
    private String nationality;
    private String aadhaarNumber;
    private String occupation;
    private String mobileNumber;
    private String address;
    private String suspectName;
    private String suspectAddress;
    private String enquiryOfficerName;
    private String enquiryOfficerRank;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPoliceStation() {
        return policeStation;
    }

    public void setPoliceStation(String policeStation) {
        this.policeStation = policeStation;
    }

    public String getAct() {
        return act;
    }

    public void setAct(String act) {
        this.act = act;
    }

    public String getFirNumber() {
        return firNumber;
    }

    public void setFirNumber(String firNumber) {
        this.firNumber = firNumber;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getGeneralDiaryRefNumber() {
        return generalDiaryRefNumber;
    }

    public void setGeneralDiaryRefNumber(String generalDiaryRefNumber) {
        this.generalDiaryRefNumber = generalDiaryRefNumber;
    }

    public String getTypeOfInformation() {
        return typeOfInformation;
    }

    public void setTypeOfInformation(String typeOfInformation) {
        this.typeOfInformation = typeOfInformation;
    }

    public String getPlaceOfOccurrence() {
        return placeOfOccurrence;
    }

    public void setPlaceOfOccurrence(String placeOfOccurrence) {
        this.placeOfOccurrence = placeOfOccurrence;
    }

    public String getComplainantName() {
        return complainantName;
    }

    public void setComplainantName(String complainantName) {
        this.complainantName = complainantName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getAadhaarNumber() {
        return aadhaarNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSuspectName() {
        return suspectName;
    }

    public void setSuspectName(String suspectName) {
        this.suspectName = suspectName;
    }

    public String getSuspectAddress() {
        return suspectAddress;
    }

    public void setSuspectAddress(String suspectAddress) {
        this.suspectAddress = suspectAddress;
    }

    public String getEnquiryOfficerName() {
        return enquiryOfficerName;
    }

    public void setEnquiryOfficerName(String enquiryOfficerName) {
        this.enquiryOfficerName = enquiryOfficerName;
    }

    public String getEnquiryOfficerRank() {
        return enquiryOfficerRank;
    }

    public void setEnquiryOfficerRank(String enquiryOfficerRank) {
        this.enquiryOfficerRank = enquiryOfficerRank;
    }
// Getters and Setters
}
