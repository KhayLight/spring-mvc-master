package web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.CarService.CarService;

@Controller
@RequiredArgsConstructor
public class CarsController {
 private final CarService carService;
    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if(count != null) {
            model.addAttribute("printCar", carService.getCountCars(count));
        } else {
            model.addAttribute("printCar", carService.getAllCars());
        }
        return "cars";
    }
}
