package com.springboot.springbootbrewery.web.controller;

import com.springboot.springbootbrewery.web.model.BeerDto;
import org.apache.coyote.Response;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {


    @GetMapping({"{beerId}"})
    public ResponseEntity<BeerDto> getBeer(@PathVariable UUID beerId) {

        //todo impl

        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createBeer(@RequestBody @Valid BeerDto beerDto) {

        //todo impl

        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping({"{beerId}"})
    public ResponseEntity updateBeer(@PathVariable UUID beerId, @RequestBody @Valid BeerDto beerDto) {

        //todo impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
