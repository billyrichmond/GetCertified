package me.tocertify.getcertified.domain;

import java.io.Serializable;
import java.util.List;

public class NewExam extends Exam implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Cert> certList;

    public NewExam() { super(); }

    public List<Cert> getCertList() {
        return certList;
    }

    public void setCertList(List<Cert> certList) {
        this.certList = certList;
    }

}
