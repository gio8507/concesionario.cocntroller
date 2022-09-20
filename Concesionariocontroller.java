package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
 class VendedoresAcontroller {
    @PostMapping("/vendedoresAcomision")
    public void highVendedores(@RequestBody VendedoresA vendedoresA){
        System.out.println("altaVendedores");
    }
    @DeleteMapping("/vendedoresAcomision")
    public void deleteVendedores(@PathVariable String vendedoresA){
        System.out.println("vendedoresA eliminados");
    }
    @PutMapping("/vendedor")
    public void updateVendedor(@Valid @RequestBody String vendedor){
        System.out.println("/vendedor actulizado");

    }
    @PostMapping("/cochess/{reserva}")
    public void highCochessByReserva(@PathVariable String  reserva){
        System.out.println("reserva de coche");

    }
    @DeleteMapping("/cochess/{cancelar}")
    public void deleteCochessByCancelar(@PathVariable String cancelar){
        System.out.println("coche cancelado");
    }

}
