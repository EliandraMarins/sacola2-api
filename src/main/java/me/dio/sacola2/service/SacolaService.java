package me.dio.sacola2.service;

import me.dio.sacola2.model.Item;
import me.dio.sacola2.model.Sacola;
import me.dio.sacola2.resource.dto.ItemDto;

public interface SacolaService {
    Item incluirItemNaSacola(ItemDto itemDto);
    Sacola verSacola(Long id);
    Sacola fecharSacola(Long id, int formaPagamento);

}
