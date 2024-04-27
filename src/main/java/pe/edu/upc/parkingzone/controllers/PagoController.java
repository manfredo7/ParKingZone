package pe.edu.upc.parkingzone.controllers;
//Desarrollo Ricardo

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.parkingzone.dtos.PagoDTO;
import pe.edu.upc.parkingzone.dtos.QuerysDTO.PagoQ1DTO;
import pe.edu.upc.parkingzone.dtos.QuerysDTO.PagoQ2DTO;
import pe.edu.upc.parkingzone.entities.Pago;
import pe.edu.upc.parkingzone.serviceinterfaces.IPagoService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Pago")


public class PagoController {


    @Autowired
    private IPagoService pS;


    //Registrar
    @PostMapping
    public void registrar(@RequestBody PagoDTO pagoDTO) {
        ModelMapper m = new ModelMapper();
        Pago p = m.map(pagoDTO, Pago.class);
        pS.insert(p);
    }

    //Visualizar
    @GetMapping
    public List<PagoDTO> listar(){
        return pS.list().stream().map(y->{
            ModelMapper m =new ModelMapper();
            return m.map(y, PagoDTO.class);
        }).collect(Collectors.toList());
    }

    //Eliminar
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) { pS.delete(id);}

    //ListarPorId
    @GetMapping("/{id}")
    public PagoDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        PagoDTO pg=m.map(pS.listId(id),PagoDTO.class);
        return pg;
    }

    //modificar
    @PutMapping
    public void ModificarPago(@RequestBody Pago pago) {
        ModelMapper m = new ModelMapper();
        Pago p = m.map(pago, Pago.class);
        pS.insert(p);
    }

    //ver tipo de pago mas utilizado}
    @GetMapping("/TipopagoMasUtilizado")
    public List<PagoQ1DTO> getTipopagoMasUtilizado() {
        List<Object[]> results = pS.getTotalPago();
        List<PagoQ1DTO> dtoList = new ArrayList<>();
        for (Object[] row : results) {
            PagoQ1DTO dto = new PagoQ1DTO();
            dto.setPagoid(((Number) row[0]).intValue()); // Assuming ID is the first column
            dto.setCantidad(((Number) row[1]).intValue());            // Assuming name is the second colum// Assuming hours are in the third column
            dtoList.add(dto);
        }
        return dtoList;
    }

    //Visualizar monto total recaudado por reservas en un rango de tiempo
    @GetMapping("/TotalReservasRangoTiempo")
    public PagoQ2DTO TotalReservasRangoTiempo(
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate startDate,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate endDate) {
        long userCount = pS.getTotalRecaudado(startDate,endDate);
        return new PagoQ2DTO(userCount);
    }
}
