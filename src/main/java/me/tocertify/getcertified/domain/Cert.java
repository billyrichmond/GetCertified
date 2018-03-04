package me.tocertify.getcertified.domain;

import java.io.Serializable;

public class Cert implements Serializable {

    private static final long serialVersionUID = 1L;

    private int certId;
    private String certName;

    public Cert() { super(); }

    public Cert(int certId, String certName) {
        this.certId = certId;
        this.certName = certName;
    }

    public int getCertId() {
        return certId;
    }

    public void setCertId(int certId) {
        this.certId = certId;
    }

    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName;
    }

    @Override
    public boolean equals(Object obj) {
        boolean flag = false;
        Cert cert = (Cert) obj;
        if (cert.certId == certId)
            flag = true;

        return flag;
    }

    @Override
    public int hashCode() {
        return certId;
    }
}

