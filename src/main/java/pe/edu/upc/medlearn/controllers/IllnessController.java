package pe.edu.upc.medlearn.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.medlearn.servicesinterfaces.IIllnessService;

@RestController("/Enfermedades")
public class IllnessController {
    @Autowired
    private IIllnessService iS;

}
