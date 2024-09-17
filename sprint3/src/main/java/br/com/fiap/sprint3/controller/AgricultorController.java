package br.com.fiap.sprint3.controller;

import br.com.fiap.sprint3.domainmodel.Agricultor;
import br.com.fiap.sprint3.service.AgricultorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Controller
@RequestMapping("/agricultores")
public class AgricultorController {

    private final AgricultorService service;

    @GetMapping("/addNew")
    public String addNewAgricultor(Model model) {
        Agricultor agricultor = new Agricultor();
        model.addAttribute("agricultor", agricultor);
        return "addNewAgricultor";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("agricultor") Agricultor agricultor) {
        this.service.save(agricultor);
        return "redirect:/agricultores/";
    }

    @GetMapping("/delete/{id}")
    public String deleteById(@PathVariable("id") Long id) {
        this.service.deleteById(id);
        return "redirect:/agricultores/";
    }

    @GetMapping("/")
    public String viewHomePageAsList(Model model) {
        List<Agricultor> agricultorList = this.service.findAll();
        model.addAttribute("allAgricultorList", agricultorList);
        return "index";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showUpdateForm(@PathVariable("id") Long id, Model model) {
        Optional<Agricultor> agricultor = this.service.findById(id);
        if (agricultor.isPresent()) {
            model.addAttribute("agricultor", agricultor.get());
        } else {
            System.out.println("Agricultor não encontrado");
        }
        return "updateAgricultor";
    }

    @GetMapping("/show/{id}")
    public String showAgricultor(@PathVariable("id") Long id, Model model) {
        Optional<Agricultor> agricultor = this.service.findById(id);
        if (agricultor.isPresent()) {
            model.addAttribute("agricultor", agricultor.get());
        } else {
            System.out.println("Agricultor não encontrado");
        }
        return "showAgricultor";
    }
}
