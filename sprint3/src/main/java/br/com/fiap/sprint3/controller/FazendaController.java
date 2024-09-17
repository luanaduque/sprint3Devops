package br.com.fiap.sprint3.controller;



import br.com.fiap.sprint3.domainmodel.Fazenda;
import br.com.fiap.sprint3.service.FazendaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Controller
@RequestMapping("/fazendas")
public class FazendaController {

    private FazendaService service;

    @GetMapping("/addNew")
    public String addNewFazenda(Model model) {
        Fazenda fazenda = new Fazenda();
        model.addAttribute("fazenda", fazenda);
        return "addNewFazenda";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("fazenda") Fazenda fazenda) {
        this.service.save(fazenda);
        return "redirect:/fazendas/";
    }

    @GetMapping("/delete/{id}")
    public String deleteById(@PathVariable("id") Long id) {
        this.service.deleteById(id);
        return "redirect:/fazendas/";
    }

    @GetMapping("/")
    public String viewHomePageAsList(Model model) {
        List<Fazenda> fazendaList = this.service.findAll();
        model.addAttribute("allFazendaList", fazendaList);
        return "index2";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showUpdateForm(@PathVariable("id") Long id, Model model) {
        Optional<Fazenda> fazenda = this.service.findById(id);
        if (fazenda.isPresent()) {
            model.addAttribute("fazenda", fazenda.get());
        } else {
            System.out.println("Fazenda não encontrada");
        }
        return "updateFazenda";
    }

    @GetMapping("/show/{id}")
    public String showFazenda(@PathVariable("id") Long id, Model model) {
        Optional<Fazenda> fazenda = this.service.findById(id);
        if (fazenda.isPresent()) {
            model.addAttribute("fazenda", fazenda.get());
        } else {
            System.out.println("Fazenda não encontrada");
        }
        return "showFazenda";
    }
}
