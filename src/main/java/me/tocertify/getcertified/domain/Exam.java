package me.tocertify.getcertified.domain;

import java.io.Serializable;

public class Exam implements Serializable {

    private static final long serialVersionUID = 1L;

    private int examId;
    private String examName;
    private String examNumber;

    public Exam() {
        super();
    }

    public Exam(int examId, String examName, String examNumber) {
        this.examId = examId;
        this.examName = examName;
        this.examNumber = examNumber;
    }

    public int getExamId() {
        return examId;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public String getExamNumber() {
        return examNumber;
    }

    public void setExamNumber(String examNumber) {
        this.examNumber = examNumber;
    }

    @Override
    public boolean equals(Object obj) {
        boolean flag = false;
        Exam exam = (Exam) obj;
        if (exam.examId == examId)
            flag = true;

        return flag;
    }

    @Override
    public int hashCode() {
        return examId;
    }

    /*
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Exam other = (Exam) obj;
        if (examId == null) {
            if (other.examId != null) {
                return false;
            } else if (!examId.equals(other.examId))
                return false;
        }

        return true;
    }
    */

    /*
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result +((examId == null) ? 0 : examId.hashCode());

        return result;
    }
    */

}
