package pe.edu.cibertec.demo_azure_01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.demo_azure_01.viewmodel.VehiculoModel;

import java.util.ArrayList;
import java.util.List;

@Controller
public class VehiculoController {
    @GetMapping("/")
    public String obtenerVehiculos(Model model){
        List<VehiculoModel> listaVehiculos = new ArrayList<VehiculoModel>();
        listaVehiculos.add(new VehiculoModel(1, "Toyota", "Corolla", "Rojo", "ABC123"));
        listaVehiculos.add(new VehiculoModel(2, "Hyundai", "Santa Fe", "Negro Mate", "POZ992"));
        listaVehiculos.add(new VehiculoModel(3, "Ford", "Mustang", "Blanco Perla", "BMW478"));
        listaVehiculos.add(new VehiculoModel(4, "BMW", "Serie 3", "Gris Oscuro", "QER234"));
        listaVehiculos.add(new VehiculoModel(5, "Nissan", "Altima", "Verde", "BTT456"));

        model.addAttribute("listaVehiculos",listaVehiculos);
        return "vehiculo";
    }
}
