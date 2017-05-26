package com.example.android.reportcard;

import java.util.ArrayList;

import javax.security.auth.Subject;


/**
 * CReportCard contains specific information about a student and his grades in a year.
 */

public class ReportCard {

    private static final String SCHOOL_NAME = "Harbor View Grammar School";
    private static final String TITLE = "Report Card";

    private String mName;
    private String mDateOfBirth;
    private int mAdmissionNumber;
    private String mClass;
    private int mYear;

    private int mMathematics;
    private int mGrammar;
    private int mScience;
    private int mPhysicalEducation;
    private int mEnglish;

    public ReportCard(String name,String dOB, int admissionNumber, String theClass, int year, int mathematics, int grammar,
                      int science, int pE, int english, int average) {

        mName = name;
        mDateOfBirth = dOB;
        mAdmissionNumber = admissionNumber;
        mClass =theClass;
        mYear = year;
        mMathematics = mathematics;
        mGrammar = grammar;
        mScience = science;
        mPhysicalEducation = pE;
        mEnglish = english;
    }

    public String getName() { return mName; }

    public String getDateOfBirth() { return mDateOfBirth; }

    public int getAdmissionNumber() { return mAdmissionNumber; }

    public String getTheClass() { return mClass; }

    public int getYear() { return mYear; }

    public int getMathematics() { return mMathematics; }

    public int getGrammar() { return mGrammar; }

    public int getScience() { return mScience; }

    public int getPE() { return mPhysicalEducation; }

    public int getEnglish() { return mEnglish; }



    public void setName(String name) {
        mName = name;
    }

    public void setDateOfBirth (String dOB) {
        mDateOfBirth = dOB;
    }

    public void setAdmissionNumber (String admissionNumber) {
        mDateOfBirth = admissionNumber;
    }

    public void setTheClass(String theClass) {
        mDateOfBirth = theClass;
    }

    public void setYear (String year) {
        mDateOfBirth = year;
    }

    public void setMathematics (String mathematics) {
        mDateOfBirth = mathematics;
    }

    public void setGrammar(int grammar) {
        mGrammar = grammar;
    }

    public void setScience(int science) {
        mScience = science;
    }

    public void setPhysicalEducation(int pE) {
        mPhysicalEducation = pE;
    }

    public void setEnglish(int english) {
        mEnglish = english;
    }

    public int setAverage (int average ) {
        average = (mMathematics + mGrammar + mPhysicalEducation + mEnglish + mScience)/5;
        return average;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "mName='" + mName + '\'' +
                ", mDateOfBirth='" + mDateOfBirth + '\'' +
                ", mAdmissionNumber=" + mAdmissionNumber +
                ", mClass='" + mClass + '\'' +
                ", mYear=" + mYear +
                ", mMathematics=" + mMathematics +
                ", mGrammar=" + mGrammar +
                ", mScience=" + mScience +
                ", mPhysicalEducation=" + mPhysicalEducation +
                ", mEnglish=" + mEnglish +
                '}';
    }
}
