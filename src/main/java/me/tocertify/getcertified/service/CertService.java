package me.tocertify.getcertified.service;

import me.tocertify.getcertified.domain.Cert;

import java.util.List;

public interface CertService {
    List<Cert> getAllCerts();
    Cert getCertById(int certId);
    void addCert(Cert cert);
}
