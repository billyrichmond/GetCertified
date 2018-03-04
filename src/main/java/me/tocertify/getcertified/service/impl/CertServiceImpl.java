package me.tocertify.getcertified.service.impl;

import me.tocertify.getcertified.domain.Cert;
import me.tocertify.getcertified.domain.repository.CertRepository;
import me.tocertify.getcertified.service.CertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertServiceImpl implements CertService {

    @Autowired
    private CertRepository certRepository;

    @Override
    public List<Cert> getAllCerts() {
        List<Cert> allCerts = certRepository.getAllCerts();

        return allCerts;
    }
}
