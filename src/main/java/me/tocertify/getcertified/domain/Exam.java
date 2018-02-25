package me.tocertify.getcertified.domain;

import java.io.Serializable;

public class Exam implements Serializable {

    private static final long serialVersionUID = 1L;

    private String examId;
    private String name;

    public Exam() {
        super();
    }

    public Exam(String examId, String name) {
        this.examId = examId;
        this.name = name;
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result +((examId == null) ? 0 : examId.hashCode());

        return result;
    }

}
