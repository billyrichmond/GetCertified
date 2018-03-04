package me.tocertify.getcertified.domain.repository;

import me.tocertify.getcertified.domain.Cert;

import java.util.List;

public interface CertRepository {
    List<Cert> getAllCerts();
}
