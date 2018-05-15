package me.tocertify.getcertified.controller;

import me.tocertify.getcertified.domain.Cert;
import me.tocertify.getcertified.service.CertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CertController {

    @Autowired
    private CertService certService;

    @RequestMapping("/certs")
    public String listCerts(Model model) {
        model.addAttribute("certs", certService.getAllCerts());
        return "certs";
    }

    @RequestMapping("/cert")
    public String getCertById(@RequestParam("id") int certId, Model model) {
        model.addAttribute("cert", certService.getCertById(certId));
        return "cert";
    }

    @RequestMapping(value = "/addcert", method = RequestMethod.GET)
    public String getAddCertCert(Model model) {
        Cert newCert = new Cert();
        model.addAttribute("newCert", newCert);
        return "addcert";
    }

    @RequestMapping(value = "/addcert", method = RequestMethod.POST)
    public String processAddNewCert(Model model, Cert newCert) {
        certService.addCert(newCert);
        return "redirect:/certs";
    }
}
