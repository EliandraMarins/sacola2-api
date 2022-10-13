package me.dio.sacola2.resource;

import lombok.RequiredArgsConstructor;
import me.dio.sacola2.model.Item;
import me.dio.sacola2.model.Sacola;
import me.dio.sacola2.resource.dto.ItemDto;
import me.dio.sacola2.service.SacolaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ifood-devweek/sacolas")
@RequiredArgsConstructor

public class SacolaResource {
    private final SacolaService sacolaService;


    @PostMapping
    public Item incluirItemNaSacola(@RequestBody ItemDto itemDto) {
        return sacolaService.incluirItemNaSacola(itemDto);
    }


    @GetMapping("/{id}")
    public Sacola verSacola(@PathVariable("id") Long id){
    return sacolaService.verSacola(id);
    }

    @PatchMapping("/fecharSacola/{sacolaId}")
    public Sacola fecharSacola(@PathVariable("sacolaId") Long sacolaId,
                               @RequestParam("formaPagamento") int formaPagamento){
        return sacolaService.fecharSacola(sacolaId, formaPagamento);
    }
}
