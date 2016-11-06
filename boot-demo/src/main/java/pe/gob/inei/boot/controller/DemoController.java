package pe.gob.inei.boot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.gob.inei.boot.canonico.Objeto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Erick Gonzales on 6/11/2016
 */
@RestController
public class DemoController {

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ResponseEntity<List<Objeto>> d(@RequestHeader("clave") String clave,
                                          @RequestParam("q") String query) {
        List<Objeto> response = new ArrayList<>();
        if ("1234".equals(clave)) {
            response.add(new Objeto(1, query + " knuto"));
            response.add(new Objeto(2, query + " goku"));
            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
