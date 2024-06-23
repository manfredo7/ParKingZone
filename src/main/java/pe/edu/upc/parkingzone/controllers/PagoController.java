package pe.edu.upc.parkingzone.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.parkingzone.dtos.PagoDTO;
import pe.edu.upc.parkingzone.dtos.QuerysDTO.PagoQ1DTO;
import pe.edu.upc.parkingzone.dtos.QuerysDTO.PagoQ2DTO;
import pe.edu.upc.parkingzone.entities.Pago;
import pe.edu.upc.parkingzone.serviceinterfaces.IPagoService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pago")
public class PagoController {
    @Autowired
    private IPagoService pS;


    //Registrar
    @PostMapping
    public void registrar(@RequestBody PagoDTO pagodto) {
        ModelMapper m = new ModelMapper();
        Pago p = m.map(pagodto, Pago.class);
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
    public void ModificarPago(@RequestBody PagoDTO pagodto) {
        ModelMapper m = new ModelMapper();
        Pago p = m.map(pagodto, Pago.class);
        pS.insert(p);
    }

    //visualizar conteo de la cantidad de todos los tipos de pago
    @GetMapping("/Tipopagocantidad")
    public List<PagoQ1DTO> getTipopagoMasUtilizado() {
        List<Object[]> results = pS.getTotalPago();
        List<PagoQ1DTO> dtoList = new ArrayList<>();
        for (Object[] row : results) {
            PagoQ1DTO dto = new PagoQ1DTO();
            dto.setPagoid(((Number) row[0]).intValue());
            dto.setCantidad(((Number) row[1]).intValue());
            dto.setDescripcion_tpago(((String) row[2]));
            dtoList.add(dto);
        }
        return dtoList;
    }

    //Visualizar monto total recaudado por reservas en un rango de tiempo
    @GetMapping("/TotalReservasRangoTiempo")
    public PagoQ2DTO TotalReservasRangoTiempo(
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd 00:00:00") LocalDateTime startDate,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd 00:00:00") LocalDateTime endDate) {
        long userCount = pS.getTotalRecaudado(startDate,endDate);
        return new PagoQ2DTO(userCount);
    }

}
